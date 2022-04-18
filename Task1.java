import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //объявляем сканнер

        String digits = sc.next(); // вводим строку
        int count = digits.length(); // определяем длину строки
        count -= 1; // уменьшаем длину на минус 1, т.к массив начинается с нуля

        char max = digits.charAt(count); // устанавливаем дефолтный максимум
        System.out.println(byDigit(digits, count, max)); // вызываем функцию

    }

    public static char byDigit(String digits, int count, char max) {
        // условия чтобе перебирать строку по символам
        if (count > 0) {
            if (max<digits.charAt(count-1)) max = digits.charAt(count-1); // линейный поиск чтобы найти максимум
            --count; // двигаемся по массиву
            return byDigit(digits, count, max); // рекурсия
        }
        return max; // возвращаем максимум
    }
}
