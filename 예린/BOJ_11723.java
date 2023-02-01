import java.io.*;
import java.util.*;

public class BOJ_11723 {
	static StringTokenizer st;
	static Set<Integer> S;
	static int M, x;
	static String op;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		M=Integer.parseInt(br.readLine());
		S=new HashSet<Integer>();

		while(M-->0) {
			st=new StringTokenizer(br.readLine());
			
			op=st.nextToken();
			
			if(op.equals("all") || op.equals("empty")) {
				// S를 공집합으로 바꿈
				S.clear();
				
				// S를 {1,2,...,20}으로 바꿈
				if(op.equals("all")) {
					for(int i=1;i<=20;i++) {
						S.add(i);
					}
				}
			}
			
			else {
				x=Integer.parseInt(st.nextToken());
				
				// S에 x가 없으면 x 추가
				if(op.equals("add")) {
					if(!S.contains(x)) {
						S.add(x);
					}
				}
				
				// S에 x가 있으면 x 제거
				else if(op.equals("remove")) {
					if(S.contains(x)) {
						S.remove(x);
					}
				}

				else if(op.equals("check")) {
					// S에 x가 있으면 1 출력
					if(S.contains(x)) {
						bw.write("1\n");
					}
					// S에 x가 없으면 0 출력
					else {
						bw.write("0\n");
					}
				}
				
				else if(op.equals("toggle")) {
					// S에 x가 있으면 x 제거
					if(S.contains(x)) {
						S.remove(x);
					}
					// S에 x가 없으면 x 추가
					else {
						S.add(x);
					}
				}
			}
		}
		
		bw.flush();
		bw.close();
	}
}
