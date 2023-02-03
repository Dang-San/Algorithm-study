import java.io.*;
import java.util.*;

public class BOJ_1463 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N=Integer.parseInt(br.readLine());
		int[] dp=new int[N+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		
		dp[1]=0;
		for(int i=2;i<=N;i++) {
			dp[i]=1+dp[i-1];
			
			if(i%2==0) {
				dp[i]=Math.min(dp[i], 1+dp[i/2]);
			}
			
			if(i%3==0) {
				dp[i]=Math.min(dp[i], 1+dp[i/3]);
			}
		}
		
		bw.write(Integer.toString(dp[N]));
		bw.flush();
		bw.close();
	}
}
