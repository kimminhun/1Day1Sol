package ThisIsCodingTest.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Top_To_Down {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] ar = new Integer[n];
        for (int i = 0; i < n; i++) {
            ar[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ar,Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i]+" ");
        }
    }
}
