package test2;

import java.util.Scanner;

public class test7clear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== 간단 계산기 ===");

        while (running) {
            System.out.print("첫 번째 숫자 입력: ");
            double num1 = scanner.nextDouble();

            System.out.print("연산자 입력 (+, -, *, /): ");
            String op = scanner.next();

            System.out.print("두 번째 숫자 입력: ");
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
                        System.out.println("0으로 나눌 수 없습니다.");
                        valid = false;
                    }
                    break;
                default:
                    System.out.println("잘못된 연산자입니다.");
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

        scanner.close();
    }
}
