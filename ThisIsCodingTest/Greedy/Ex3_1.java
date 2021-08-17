package ThisIsCodingTest.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] walllet = {500, 100, 50, 10};
        int cnt=0;
        for (int i = 0; i < walllet.length; i++) {
            cnt += N / walllet[i];
            N %= walllet[i];
        }
        System.out.println(cnt);
    }
}
