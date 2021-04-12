package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        /*
        4.1 + 15 * 7 + (28 / 5) ^ 2
         */
        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        int g = 2;

        // для примера был взят CalculatorWithOperator
        // если создать тип через интерфейс, тогда нужно добавлять команду для рассчета операций в интерфейс
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
//        CalculatorWithCounterAutoCompositeInterface calc = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathCopy());
//        CalculatorWithCounterAutoCompositeInterface calc = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathExtends());

        double rezult = calc.addition(calc.addition(a, calc.multiplication(b, c)),
                calc.pow(calc.division(d, e), g));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + rezult);

        // запись в память последней операции
        calc.setMemoryLastOperation();
        // получение значения из памяти
        System.out.println("Значение в памяти: " + calc.getMemory());

        System.out.println("Количество операций: " + calc.getCountOperation());

    }
}
