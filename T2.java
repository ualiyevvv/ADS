import java.util.*;

public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        String s = sc.nextLine();
        list = fillList(s, list);
        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

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
