import java.util.*;

public class T4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        String s = sc.nextLine();
        list = fillList(s, list);
        System.out.println(removeDuplicate(list));

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

    private static LinkedList<Integer> removeDuplicate(LinkedList<Integer> list) {
        LinkedList<Integer> newList = new LinkedList<>();

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) != list.get(i+1)) {
                newList.add(list.get(i));
            }
        }

        newList.add(list.getLast());

        return newList;
    }


}
