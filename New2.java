import java.util.*;

public class New2 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        HashSet<Stack<Integer>> subArrays = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        fillData(s, hashmap);

        System.out.println(hashmap);

        findSubArrays(hashmap, subArrays);

        System.out.println(subArrays);


    }


    private static void findSubArrays(HashMap<Integer, Integer> hashMap, HashSet<Stack<Integer>> subArrays) {
        Stack<Integer> stack = new Stack<>();

        for (int j=0;j<hashMap.size();j++) {
            stack.add(hashMap.get(j));
//            System.out.println(hashMap.get(j));
            for (int i=j+1;i<hashMap.size();i++) {
                stack.add(hashMap.get(i));
//                System.out.println("===" + hashMap.get(i));
                if (sumStacks(stack) == 0) {
//                    System.out.println(stack);
                    subArrays.add(cloneStack(stack));
                    stack.clear();
                    break;
                }
            }
            stack.clear();
        }

        for (int i=0;i < hashMap.size();i++) {
            stack.add(hashMap.get(i));
            if ((sumStacks(stack)) == 0 && i== hashMap.size()-1) {
                subArrays.add(cloneStack(stack));
                stack.clear();
            }
        }

    }

    private static Stack<Integer> cloneStack(Stack<Integer> stack) {
        Stack<Integer> newstack = (Stack<Integer>)stack.clone();

        return newstack;
    }

    private static int sumStacks(Stack<Integer> stack) {
        int sum = 0;
        for (int i=0; i<stack.size();i++) {
            sum += stack.get(i);
        }
//        System.out.println("sum = " + sum);
        return sum;
    }


    private static HashMap<Integer, Integer> fillData(String s, HashMap<Integer, Integer> hashmap) {
        String newS = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                newS += s.charAt(i);
            }
            if (s.charAt(i) == ' ' || i == s.length() - 1) {
                int digit = Integer.parseInt(newS);
                hashmap.put(count, digit);
                newS = "";
                count++;
            }
        }
        return hashmap;
    }
}
