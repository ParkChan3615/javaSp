package sp_exam;

import java.util.Scanner;

public class Calculator {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (true) {

         // 5. 사용자로부터 정수를 입력 받아 변수 firstNum에 저장하여라
         System.out.println("숫자1입력:");
         int firstNum = sc.nextInt();
         int i = 0;
         while (true) {
            // 6. 사용자로부터 부호를 입력 받아 변수 buho에 저장하여라
            System.out.println("부호 입력:");

            String buho = sc.next();
            // 7. 사용자로부터 정수를 입력 받아 변수 secondNum에 저장하여라
            System.out.println("숫자2입력:");
            int secondNum = sc.nextInt();
            // 8. buho에 저장된 값이 '+'이면 add 메서드 , '-'이면 sunstract메서드
            // '*'이면 multiply 메소드, '/'이면 drivide메서드를 호출하고 결과를 출력하여라
            // 단. buho의 저장된 값이 위의 4가지 경우가 아니라면 '연산종료'를 출력
            Calc calc = new Calc();

            if ("+".equals(buho)) {
               int result = calc.add(firstNum, secondNum);
               System.out.println(result);
               firstNum = result;
            } else if ("-".equals(buho)) {
               int result = calc.substract(firstNum, secondNum);
               System.out.println(result);
               firstNum = result;
            } else if ("*".equals(buho)) {
               long result = calc.multiply(firstNum, secondNum);
               System.out.println(result);
               firstNum = (int) result;
            } else if ("/".equals(buho)) {
               float result = calc.divide(firstNum, secondNum);
               System.out.println(result);
               firstNum = (int) result;
            } else {
               System.out.println("연산종료");
               break;
            }
         }
      }
   }
}

class Calc {
   // 1. 두개의 int 타입의 입력받아 두 인자의 합의 결과를 반환하는 인스턴스메서드
   // add를 구하여라
   int add(int num1, int num2) {
      int result = num1 + num2;
      return result;
   }

   // 2. 두개의 int 타입의 입력받아 앞의 인자에서 뒤의 인자를 뺀 결과를 반환하는 인스턴스 메서드 substract를 구현 하여라.
   int substract(int num1, int num2) {
      int result = num1 - num2;
      return result;
   }

   // 3. 두 개의 int타입 입력받아 두 인자의 곱의 결과를 반환하는 인스턴스메서드 multiply를 구현하여라
   long multiply(int num1, int num2) {
      long result = num1 * num2;
      return result;
   }

   // 4. 두개의 int 타입 입렵다아 앞의 인자를 뒤의 인자로 나누기한 결과를 반환하는 인스턴스메서드 divide를 구현하여라
   // 단 결과는 소수점 두 번째 자리에서 반올림하여 첫 번째 자리까지 표현하여라.
   float divide(int num1, int num2) {
      float result = (int) ((float) num1 / num2 * 10 + 0.5) / 10f;
      return result;

   }
}