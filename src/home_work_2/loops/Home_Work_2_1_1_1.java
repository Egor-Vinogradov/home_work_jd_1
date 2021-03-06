package home_work_2.loops;

import home_work_2.utils.ValueFromConsole;

import java.util.Scanner;

public class Home_Work_2_1_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        loopsResult(ValueFromConsole.longFromConsole(scanner.next()));
    }

    /**
     * Функция получает входной параметр типа long и выводит заданный задачей результат
     * @param n входной параметр типа long
     */
    public static void loopsResult(long n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            if (i != n) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i + " = ");
            }
            result = result * i;
        }
        System.out.print(result);
    }
}
