import java.io.*;
import java.util.*;

public class BOJ_2309 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> height=new ArrayList<Integer>();	// 난쟁이들의 키
		int sum=0;	// 난쟁이들 키의 합
		
		for(int i=0;i<9;i++) {
			height.add(Integer.parseInt(br.readLine()));	// 난쟁이들 키 입력받아 배열에 저장
			sum+=height.get(i);	// 난쟁이들 키의 합
		}

		Collections.sort(height);	// 오름차순으로 정렬
		
		Loop:
			// 탐색
			for(int i=0;i<height.size()-1;i++) {
				for(int j=i+1;j<height.size();j++) {
					if(height.get(i)+height.get(j)==sum-100) {	// 난쟁이 두명 키의 합이 sum-100과 같으면
						// 리스트에서 난쟁이 두명 키 삭제하고 반복문 종료
						height.remove(j);
						height.remove(i);
						break Loop;
					}
				}
			}
		
		// 난쟁이 일곱명의 키 출력
		Iterator<Integer> it=height.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
