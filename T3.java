import java.util.*;

public class T3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        String s = sc.nextLine();
        list = fillList(s, list);
        System.out.print(" index = ");
        int index = sc.nextInt();
        System.out.println(list.get(index));

    }

    private static LinkedList<Integer> fillList(String s, LinkedList<Integer> list) {
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' ) {
                newS += s.charAt(i);
            }
            if (s.charAt(i) == ' ' || i == s.length() - 1) {
                int digit = Integer.parseInt(newS);
                list.add(digit);
                newS = "";
            }
        }

        return list;
    }
}
