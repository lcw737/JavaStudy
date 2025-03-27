package test2;

public class test5 {
/*
 중첩 for문을 이용하여 방정식 4x + 5y = 60 의 모든 해를 구해서 (x, y) 형태로 출력해보세요
단, x와 y는 10 이하의 자연수 입니다.
 */
	public static void main(String[] args) {
		
		for(int x=1; x<100; x++) {
			for(int y=1; y<100; y++) {
				if((4*x)+(5*y)==60) {
					System.out.println(x +","+y);
				}
			}
		}
	}

}
