import java.util.*;
import java.io.*;

public class BOJ_15654 {
	static BufferedWriter bw;
	static int N, M;
	static int[] num, visit, ans;
	
	public static void backtracking(int cur, int cnt) throws IOException {
		visit[cur]=1;	// 현재 숫자에 방문했음을 체크
		ans[cnt]=num[cur];	// 수열 배열에 현재 숫자 저장
		
		if(cnt==M) {	// M개의 숫자에 방문 완료했으면
			for(int i=1;i<M+1;i++) {	// 수열 출력
				bw.write(ans[i]+" ");
			}
			bw.write("\n");	// 수열 구분
			return;
		}
		
		for(int i=1;i<N+1;i++) {// 15651번 문제와 다른 부분: 수열을 비내림차순으로 만들기 위함
			if(visit[i]==0) {	// 숫자 i에 아직 방문하지 않았다면
				backtracking(i, cnt+1);	// 방문
				visit[i]=0;	// 다음 탐색을 위해 초기화
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());	// 자연수 N 입력
		M=Integer.parseInt(st.nextToken());	// 자연수 M 입력

		num=new int[N+1];		//입력 받은 N개의 수
		visit=new int[N+1];	// 방문한 숫자 체크할 배열
		ans=new int[N+1];	// 수열 저장할 배열
		
		st=new StringTokenizer(br.readLine());
		for(int i=1;i<N+1;i++) {	// 입력 받은 N개의 수 배열에 저장
			num[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num);	// 배열 오름차순 정렬
		
		for(int i=1;i<N+1;i++) {
			backtracking(i, 1);	// 백트래킹
			visit[i]=0;	// 다음 탐색을 위해 다시 초기화
		}
		
		bw.flush();
		bw.close();
	}
}