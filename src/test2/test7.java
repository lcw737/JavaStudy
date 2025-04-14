package test2;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// 입력 도구 준비
		boolean running = true;// 프로그램 반복 실행을 위한 변수
		
		System.out.println("=== 계산기 프로그램 ===");
		
		while (running) {
		   System.out.print("첫번째 숫자 입력: ");
		   double num1 = scanner.nextDouble();

		   System.out.print("연산자 입력 (+, -, *, /): ");
		   String op = scanner.next();
		   
		   System.out.print("두번째 숫자 입력: ");
		   double num2 = scanner.nextDouble();
		   
		   double result = 0;
		   boolean valid = true;

		   switch (op) {
		       case "+":
		           result = num1 + num2;
		           break;
		       case "-":
		           result = num1 - num2;
		           break;
		       case "*":
		           result = num1 * num2;
		           break;
		       case "/":
		           if (num2 != 0) {
		               result = num1 / num2;
		           } else {
		               System.out.println("❌ 0으로 나눌 수 없습니다.");
		               valid = false;
		           }
		           break;
		       default:
		           System.out.println("❌ 잘못된 연산자입니다.");
		           valid = false;
		    }
		   if (valid) {
			    System.out.println("결과: " + result);
			}

			System.out.print("계속하시겠습니까? (y/n): ");
			String answer = scanner.next();

			if (!answer.equalsIgnoreCase("y")) {
			    running = false;
			    System.out.println("프로그램을 종료합니다.");
			}

		}
	
		scanner.close();// 입력 도구 닫기
	}

}
