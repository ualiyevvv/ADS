import java.util.Scanner;

public class BinarySearch {
    static int key = 15;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //объявляем сканнер
        int count = sc.nextInt(); //вводим размер массива
        int[] arr = new int [count]; //объявляем массив
        // цикл для заполнения массива
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
        count -= 1; // уменьшаем длину на минус 1, т.к массив начинается с нуля
        System.out.println("index: " + binS( arr, 0, count)); // вызываем функцию бинарного поиска:
        // передаем массив, позицию крайней левой и правой стороны массива
    }

    private static int binS(int[] arr, int left, int right) {
        // условия когда уже прошлись по всему массиву
        if (right - left < 0) {
            if (arr[left] == key) return left;
            else return -1;
        }

        // находим середину массива
        int middle = (left + right) / 2;

        // если значение находится в правой или левой стороне
        if (key > arr[middle]) {
            return binS(arr, middle + 1, right); // рекурсия двигаемся направо
        } else if (arr[middle] > key) {
            return binS(arr, left, middle - 1); // рекурсия двигаемся налево
        }

        // возвращаем позицию значения, которое нужно было найти
        return middle;
    }
}
