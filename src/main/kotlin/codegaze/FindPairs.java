package codegaze;

import java.util.HashMap;

public class FindPairs {
    static void contributions(int n, int []a) {
        HashMap<Integer, Integer> h = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int data = a[i] % 3;

            for (int j = i; j < a.length; j++) {
                int datab = a[j] % 3;

                if (data == datab) {
                    h.put(a[i], a[j]);
                }
            }
        }

        for (int i = 0; i < h.size(); i++) {
            System.out.println(h.get(i).toString());
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int[] arr = {3, 6, 5, 11};

        contributions(n, arr);
    }

}
