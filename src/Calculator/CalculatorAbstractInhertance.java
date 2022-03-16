package Calculator;

public class CalculatorAbstractInhertance extends CalculatorAbstract {

    @Override
    void calculate(double a, double b, String mathOperation) {
        if (mathOperation.equals("+")){
            System.out.println(a + b);
        } else if (mathOperation.equals("-")){
            System.out.println(a - b);
        } else if (mathOperation.equals("*")){
            System.out.println(a * b);
        } else if (mathOperation.equals("/")) {
            System.out.println(a / b);
        } else {
            System.out.println("Нет такой математической операции");
        }
    }
}
