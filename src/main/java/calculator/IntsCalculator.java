package calculator;

import calculator.Calculator;
import calculator.Ints;

/**
 * Класс-адаптер, который делает вычисления "под капотом" через класс Calculator
 */
public class IntsCalculator implements Ints {
    private Calculator calculator;

    /**
     * Конструктор Calculator для использования его методов
     * в переопределенных методах интерфейса пользователя
     */
    public IntsCalculator(Calculator calculator) {
        this.calculator = calculator;

    }

    @Override
    public int sum(int arg0, int arg1) {
        return (int) calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        return (int) calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    @Override
    public int pow(int a, int b) {
        return (int) calculator.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
    }
}
