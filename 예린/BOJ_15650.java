import java.util.*;

public class BOJ_15650 {
	static int N, M;
	static int[] visit, ans;
	
	public static void backtracking(int cur, int cnt) {
		visit[cur]=1;	// 현재 숫자에 방문했음을 체크
		ans[cnt]=cur;	// 수열 배열에 현재 숫자 저장
		
		if(cnt==M) {	// M개의 숫자에 방문 완료했으면
			for(int i=1;i<M+1;i++) {	// 수열 출력
				System.out.print(ans[i]+" ");
			}
			System.out.println();	// 수열 구분
			return;
		}
		
		for(int i=cur+1;i<N+1;i++) {// 반복해서 탐색 (15649번 문제와 다른 부분: 수열을 오름차순으로 만들기 위함)
			if(visit[i]==0) {	// 숫자 i에 아직 방문하지 않았다면
				backtracking(i, cnt+1);	// 방문
				visit[i]=0;	// 다음 탐색을 위해 초기화
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();	// 자연수 N 입력
		M=sc.nextInt();	// 자연수 M 입력
		visit=new int[N+1];	// 방문한 숫자 체크할 배열
		ans=new int[N+1];	// 수열 저장할 배열
		
		for(int i=1;i<N+1;i++) {
			backtracking(i, 1);	// 백트래킹
			visit[i]=0;	// 다음 탐색을 위해 다시 초기화
		}
		
		sc.close();
	}
}
