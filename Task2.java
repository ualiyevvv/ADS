import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //объявляем сканнер
        String digitLine = sc.next(); // вводим строку
        int count = digitLine.length(); // определяем длину строки
        count -= 1; // уменьшаем длину на минус 1, т.к массив начинается с нуля
        reverseLine(digitLine, count); // вызываем функцию
    }

    public static void reverseLine(String digitLine, int count) {
        // условия чтобе перебирать строку по символам
        if (count >= 0) {
            System.out.print(digitLine.charAt(count)); // выводим символ
            --count;  // двигаемся по массиву
            reverseLine(digitLine, count); // рекурсия
        }
    }
}
