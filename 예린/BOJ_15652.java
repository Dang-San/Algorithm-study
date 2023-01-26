import java.util.*;
import java.io.*;

public class BOJ_15652 {
	static BufferedWriter bw;
	static int N, M;
	static int[] ans;
	
	public static void backtracking(int cur, int cnt) throws IOException {
		ans[cnt]=cur;	// 수열 배열에 현재 숫자 저장
		
		if(cnt==M) {	// M개의 숫자에 방문 완료했으면
			for(int i=1;i<M+1;i++) {	// 수열 출력
				bw.write(ans[i]+" ");
			}
			bw.write("\n");	// 수열 구분
			return;
		}
		
		for(int i=cur;i<N+1;i++) {// 15651번 문제와 다른 부분: 수열을 비내림차순으로 만들기 위함
			backtracking(i, cnt+1);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());	// 자연수 N 입력
		M=Integer.parseInt(st.nextToken());	// 자연수 M 입력
		ans=new int[N+1];	// 수열 저장할 배열
		
		for(int i=1;i<N+1;i++) {
			backtracking(i, 1);	// 백트래킹
		}
		
		bw.flush();
		bw.close();
	}
}