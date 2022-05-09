import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class New1 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        fillData(s, hashmap);
        System.out.print("target = ");
        int target = sc.nextInt();

        System.out.println(Arrays.toString(solutTarget(hashmap, target)));

    }

    private static int[] solutTarget(HashMap<Integer, Integer> hashMap, int target) {
        int[] indexes = new int[2];
        for (int i=0;i<hashMap.size()-1;i++) {
            for (int j=i+1;j<hashMap.size();j++) {
                if (hashMap.get(i) + hashMap.get(j) == target) {
                    indexes[0] = i;
                    indexes[1] = j;
                    return indexes;
                }
            }
        }
        return indexes;
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
