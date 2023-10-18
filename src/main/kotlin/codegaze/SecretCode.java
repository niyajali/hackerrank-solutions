package codegaze;

import java.util.Scanner;

public class SecretCode {

    static int secretCode(int n, int []a) {

        int result = 0;
        int sum = 0;

        for(int i = 0; i < 3; i++) {
            for (int j = i; j < a.length; j++) {
                sum += a[i];


            }
        }

        return 0;
    }


    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 4, 1};

        int result = secretCode(n, arr);

        System.out.println(result);
    }
}
