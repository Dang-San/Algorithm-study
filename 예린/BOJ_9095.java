import java.io.*;

public class BOJ_9095 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());	// 테스트 케이스 개수
		int[] dp=new int[11];	// 1,2,3의 합으로 나타내는 방법의 수
		
		dp[1]=1;	// 1 = 1+1 (1가지)
		dp[2]=2;	// 2 = 1+1 (2가지)
		dp[3]=4;	// 3 = 2+1 = 1+2 = 1+1+1 (4가지)
		
		for(int i=4;i<11;i++) {	// 다이나믹 프로그래밍
			dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
		}
		
		while(T-->0) {	// 테스트 케이스 개수만큼 반복
			int n=Integer.parseInt(br.readLine());	// 정수 n 입력
			
			System.out.println(dp[n]);	// 정수 n을 1,2,3의 합으로 나타내는 방법의 수 출력
		}
	}
}
