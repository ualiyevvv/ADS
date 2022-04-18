import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //объявляем сканнер
        int num1 = sc.nextInt(); // вводим переменные
        int num2 = sc.nextInt(); // вводим переменные
        range(num1,num2); // вызываем функцию
    }
    public static void range(int num1, int num2) {
        // условия чтобы двигать counter
        if (num1 > num2) --num1;
        else ++num1;

        // условие чтобы остановить рекурсию когда counter достигнет конечное значение
        if (num1 != num2) {
            System.out.print(num1 + " "); // выводим значения
            range(num1, num2); // рекурсия
        }
    }
}
