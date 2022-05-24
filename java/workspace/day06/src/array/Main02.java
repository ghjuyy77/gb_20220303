package array;

public class Main02 {

	public static void main(String[] args) {
		// 문제1, num 배열에 저장된 요소의 합을 구하시오
		
		int[] num = new int[] {22, 3, 8, 12};
		int sum = 0;
		
		for(int i = 0; i < num.length; i++);{
			sum += num[i];
		}
			System.out.println("총점 :" + sum);
		
		
		
		
		
		// 문제2, num2 배열에 저장된 요소의 합과 평균을 구하시오
		
		int[] num2 = new int[] {60, 95, 88};
		
		// 문제3, num3 배열에 저장된 요소의 최대값을 출력하시오.
		
		int[] num3 = {94, 85, 95, 88, 90};
		
		// 문제4, num4 배열에 저장된 요소의 홀수와 짝수의 합을 각각 구하시오
		
		int[] num4 = new int[] {22, 3, 8, 12};
	}

}
