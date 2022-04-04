import java.util.Scanner;

public class Main {
    private static int count;
    private static int[] arr;
    private static Scanner sc = new Scanner(System.in);

    private static void result() {
       if (count >= 0) {
           System.out.println(arr[count]);
           count--;
           result();
       } else System.out.println("done");
    }

    public static void main(String[] args) {
        count = sc.nextInt();
        arr = new int [count];
        count -= 1;
        for (int i=0; i <= count; i++) {
            arr[i] = sc.nextInt();
        }
        result();
    }

}
