import java.util.Scanner;

public class BOJ_2193 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();	// 자연수 N 입력
		
		long[] dp=new long[91];
		dp[1]=1;
		dp[2]=1;
		
		for(int i=3;i<=N;i++) {	// 다이나믹 프로그래밍
			dp[i]=dp[i-1]+dp[i-2];
		}
		
		System.out.println(dp[N]);
	}
}
