import java.io.*;
import java.util.*;

public class BOJ_14501 {
	static int N, ans=0;
	static int[][] arr;
	
	public static void dfs(int current, int sum) {
		if(current==N+1) {
			ans=Math.max(ans, sum);
			return;
		}
		
		int next=current+arr[current][0];
		if(next<=N+1) {
			dfs(next, sum+arr[current][1]);
		}
		
		dfs(current+1,sum);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());	// N 입력 (1 ≤ N ≤ 15)
		arr=new int[N+1][2];	// 0번째 열: 기간, 1번째 열: 금액
		
		// N개의 줄에 Ti와 Pi 입력
		StringTokenizer st;
		for(int i=1;i<=N;i++) {
			st=new StringTokenizer(br.readLine());
			
			arr[i][0]=Integer.parseInt(st.nextToken());	// Ti (기간)
			arr[i][1]=Integer.parseInt(st.nextToken());	// Pi (금액)
		}
		
		dfs(1,0);
		
		System.out.println(ans);
	}
}
