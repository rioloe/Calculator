package Calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 1. 속성

    // 캡슐화
    // 연산 결과를 저장하는 컬렉션 타입 필드
    private List<Integer> results = new ArrayList<>();


    // 2. 생성자
    public Calculator() {}

    // 3. 기능
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
        results.add(result);

        // 결과 반환
        return result;
    }

    // getter: 방어적 복사
    public List<Integer> getResults() {
        return new ArrayList<>(results);
    }

    // setter: 초기화 용도
    public void resetResults(List<Integer> newResults) {
        if (newResults == null) {
            return;
        }
        results.clear();
        results.addAll(newResults);
    }

    // 가장 오래된 결과 삭제
    public void removeResult() {
        if (results.isEmpty()) {
            System.out.println("삭제할 결과가 없습니다");
            return;
        }
        results.remove(0);
    }

}

