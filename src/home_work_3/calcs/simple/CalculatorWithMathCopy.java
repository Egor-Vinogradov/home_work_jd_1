package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    /** Сложение чисел a и b
     *
     * @param a входной параметр
     * @param b входной параметр
     * @return возвращает значение сложения
     */
    public double addition(double a, double b) {
        return a + b;
    }

    /** Вычитание числа b от a
     *
     * @param a входной параметр
     * @param b входной параметр
     * @return возвращает значение вычитания чисел
     */
    public double subtraction(double a, double b) {
        return a - b;
    }

    /** Умножение числа a на b
     *
     * @param a входной параметр
     * @param b входной параметр
     * @return возвращает значение умножения чисел
     */
    public double multiplication(double a, double b) {
        return a * b;
    }

    /** Деление числа a на b
     *
     * @param a входной параметр
     * @param b входной параметр
     * @return возвращает значение деления чисел
     */
    public double division(double a, double b) {
        return a / b;
    }

    /** Возведение числа в степень
     *
     * @param value входной параметр числа
     * @param powValue входной параметр степени
     * @return возвращает значение возведения числа в степень через Math
     */
    public double pow(double value, int powValue) {
        return Math.pow(value, powValue);
    }

    /** Модуль числа
     *
     * @param a входной параметр
     * @return возвращает значение через Math
     */
    public double absNumber(double a) {
        return Math.abs(a);
    }

    /** Квадратный корень числа
     *
     * @param a входной параметр
     * @return возвращает значение через Math
     */
    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}
