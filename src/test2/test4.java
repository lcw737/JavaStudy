package test2;

class test4 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 0; i < n; i++) {
            // Printing spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            
            // Printing stars
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("* ");
            }
            
            System.out.println(); // New line
        }
    }
}
/*
 n = 5는 피라미드의 높이를 정의합니다.

첫 번째 for 루프는 각 행을 통과합니다.

두 번째 루프는 별들을 올바르게 정렬하기 위해 공간을 출력합니다.

세 번째 루프는 피라미드 모양을 만들기 위해 공간이 있는 별을 인쇄합니다.

System.out.println(); 각 행 뒤에 다음 줄로 이동합니다.

 */

