package Calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 속성
    // 연산 결과를 저장하는 컬렉션 타입 필드
    List<Integer> list = new ArrayList<>();

    // 생성자
    public Calculator() {}

    // 기능
    public int calculate(int num1, int num2, char operator) {
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
                    System.out.println("0으로 나눌 수 없습니다.");
                    return 0;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                return 0;
        }
        // 연산 결과를 컬렉션에 저장
        list.add(result);

        // 결과 반환
        return result;
    }

}

