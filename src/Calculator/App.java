package Calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Scanner 객체 소환
        Scanner sc = new Scanner(System.in);

        // 반복
        while (true) {

            // 양의 정수 입력 받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번쨰 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            // 사칙연산 입력받기
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            // 사칙 연산 진행
            int result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("0으로 나눌 수 없음");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("잘못된 연산자");
                    continue;
            }
            // 연산 결과 출력
            System.out.println("결과: " + result);

            // 종료 여부 확인
            System.out.println("더 계산하시겠습니까? (exit 입력시 종료)");
            String command = sc.next();

            if (command.equals("exit")) {
                System.out.println("프로그램을 종료");
                break;
            }


        }

        sc.close();

    }
}
