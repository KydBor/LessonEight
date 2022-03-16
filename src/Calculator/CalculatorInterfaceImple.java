package Calculator;

import java.util.Scanner;
//SHIFT+f6 переименовать класс везде где он используется,
// выделить в списке проекта нужный класс и нажать сочетание классов
public class CalculatorInterfaceImple implements CalculatorInterface {//когда строка подчёркнута красным
    // направляем мышь на строку и нажимаем ALT+ENTER

    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        String mathOperation = scanner.next();
        action(a, b, mathOperation);
    }

    @Override
    public void action(double a, double b, String mathOperation) {
        switch (mathOperation) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Нет такой математической операции");
        }
    }
}
