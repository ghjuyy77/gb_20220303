package array;

public class Main01 {

	public static void main(String[] args) {
		// 성적표에 대한 2차 배열 생성
		// 학급 성적을 위한 배열
		int[][] grade = new int[3][3];
		
		// 둘리의 과목별 점수
		grade[0][0] = 75;
		grade[0][1] = 82;
		grade[0][2] = 91;
		
		// 도우너의 과목별 점수
		grade[0][0] = 88;
		grade[0][1] = 64;
		grade[0][2] = 50;
		
		// 또치의 과목별 점수
		grade[0][0] = 100;
		grade[0][1] = 100;
		grade[0][2] = 90;
		
		// 2차 배열을 탐색하여 총점과 평균점수 구하기
		for(int i = 0; i<grade.length; i++) {
			int sum = 0;
			int avg = 0;
			
			
			for(int j = 0; j<grade[i].length; j++ ) {
				// i번째 행의 j번째 열의 데이터를 누적처리
				sum += grade[i][j];
			}
			
			// i번째 위치의 평균점수 구하기 - 총점 / 과목수
			// i번재 학생의 과목수는 grade 배열의 i번째에 대한 길이
			avg = sum / grade[i].length ; 
			
			System.out.println("총점= " + sum + ", 평균 = " + avg);
		}
		
		
		
	}

}
