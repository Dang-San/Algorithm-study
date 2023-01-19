import java.util.*;

public class BOJ_15649 {
	static int N, M;
	static int[] visit, ans;
	
	public static void backtracking(int cur, int cnt) {
		visit[cur]=1;
		ans[cnt]=cur;
		
		if(cnt==M) {
			for(int i=1;i<M+1;i++) {
				System.out.print(ans[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=1;i<N+1;i++) {
			if(visit[i]==0) {
				backtracking(i, cnt+1);
				visit[i]=0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		visit=new int[N+1];
		ans=new int[N+1];
		
		for(int i=1;i<N+1;i++) {
			backtracking(i, 1);
			visit[i]=0;
		}
		
		sc.close();
	}
}
