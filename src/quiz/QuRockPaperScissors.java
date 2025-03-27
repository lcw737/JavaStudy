package quiz;

import java.util.Random;
import java.util.Scanner;

/*
1.난수생성기를 이용하여 1, 2, 3중 하나의 숫자를 생성한다.
2.사용자가 가위(1),바위(2),보(3) 중 하나를 낸다.
3.승부를 판단하여 출력한다.
4.1,2,3 이외의 숫자를 입력하면 잘못된 입력을 알려주고 재입력을 요구한다.
5.숫자입력을 잘못한 경우는 게임횟수에 포함하지 않는다.
6.게임은 5번 진행하고 5번째 게임을 끝내면 다시할지 물어본다. 재시작(1), 종료(0)
7.0, 1 이외의 숫자를 입력하면 재입력을 요구해야 한다.

 */
	import java.util.Random;
	import java.util.Scanner;

public class QuRockPaperScissors {

	public static void rpsGameStart() {
			
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int gameCount = 0; // 게임 카운트용 변수
					
		while(true) {
			//1. 난수생성 - 컴퓨터입장에서 가위/바위/보
			int com = random.nextInt(10000) % 3 + 1;//1~3사이의 난수
			System.out.println("컴퓨터:"+ com);
				
			//2. 사용자입력 
			int user = 0;
			System.out.println("가위바위보를 입력하세요.");
			System.out.print("가위(1), 바위(2), 보(3)=>");
				
			try {
				user = scanner.nextInt();
			}
			catch (Exception e) {
				scanner.nextLine();
				e.printStackTrace();
			}
				
			//3.승부판단		
			//사용자가 정상적으로 입력한 경우
			if(!(user<1 || user>3)) {
				
				//가위바위보 출력용 함수를 이용해서 정보출력
				System.out.printf("사용자:%s, 컴퓨터:%s ", displayRPS(user), displayRPS(com));				
					
				switch(user - com) {
				case 0:
					System.out.println("비겼습니다.");break;
				case 1: case -2:
					System.out.println("이겼습니다.");break;
				case 2: case -1:
					System.out.println("졌습니다.");break;
				}					
				gameCount++;//게임카운트 증가			
			}
			else {
				System.out.println("다시 ㄱ");
			}
				
			//게임재시작 여부 확인			 
			if(gameCount>=5) {				
				int restart;
				while(true) {
					System.out.print("게임재시작(1), 종료(0):");
					restart = scanner.nextInt();
					if(restart==0 || restart==1) {
						//정상입력이면 루프탈출
						break;
					}
					else {
						System.out.println("ㅋㅋ 잘못입력함\n");
					}
				}								
				if(restart==0) {
					break;
				}
				else {
					System.out.println("다시 ㄱ");
					gameCount=0;
				}
			}
		}	
	}
	
	public static String displayRPS(int n) {
			String str = "";
			switch(n) {
			case 1: str="가위";break;
			case 2: str="바위";break;
			case 3: str="보";break;
			}
			return str;
		}
		
		public static void main(String[] args) {
			rpsGameStart();		
		}
	}
