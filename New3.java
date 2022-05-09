import java.util.*;

public class New3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        String s = sc.nextLine();

        fillData(s, stack);

        int result = findMinDublicated(stack);
        if (result != -1 ) {
            System.out.print("The minimum index of the repeating element is " + result);
        } else {
            System.out.print("Invalid Input");
        }

    }

    private static int findMinDublicated(Stack<Integer> arr) {
        int minIndex = arr.size();
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = arr.size() - 1; i >= 0; i--) {
            if (hashSet.contains(arr.get(i))) {
                minIndex = i;
            } else {
                hashSet.add(arr.get(i));
            }
        }
        if (minIndex == arr.size()) {
            return -1;
        }
        return minIndex;
    }


    private static Stack<Integer> fillData(String s, Stack<Integer> set) {
        String newS = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                newS += s.charAt(i);
            }
            if (s.charAt(i) == ' ' || i == s.length() - 1) {
                int digit = Integer.parseInt(newS);
                set.add(count, digit);
                newS = "";
                count++;
            }
        }
        return set;
    }
}
