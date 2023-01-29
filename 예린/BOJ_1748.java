import java.io.*;

public class BOJ_1748 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N=Integer.parseInt(br.readLine());	// 입력: N
		long ans=0;	// 새로운 수의 자릿수
		for(int i=1;i<=N;i*=10) {	// 반복해서 자릿수 더해나가기
			ans+=N-i+1;
		}
		
		bw.write(String.valueOf(ans));	// 자릿수 출력
		
		bw.flush();
		bw.close();
	}
}
