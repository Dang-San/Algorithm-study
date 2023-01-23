import java.util.*;
import java.io.*;

public class BOJ_15651 {
	static StringBuilder sb;
	static int N, M;
	static int[] ans;
	
	public static void backtracking(int cur, int cnt) {
		ans[cnt]=cur;	// 수열 배열에 현재 숫자 저장
		
		if(cnt==M) {	// M개의 숫자에 방문 완료했으면
			for(int i=1;i<M+1;i++) {	// 수열 출력
				sb.append(ans[i]+" ");
			}
			sb.append("\n");	// 수열 구분
			return;
		}
		
		for(int i=1;i<N+1;i++) {// 반복해서 탐색
			backtracking(i, cnt+1);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());	// 자연수 N 입력
		M=Integer.parseInt(st.nextToken());	// 자연수 M 입력
		ans=new int[N+1];	// 수열 저장할 배열
		sb=new StringBuilder();
		
		for(int i=1;i<N+1;i++) {
			backtracking(i, 1);	// 백트래킹
		}
		
		System.out.println(sb.toString());	// 수열 출력
	}
}
