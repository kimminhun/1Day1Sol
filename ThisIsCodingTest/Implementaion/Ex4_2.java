package ThisIsCodingTest.implementaion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4_2 {

    static int cnt=0;

    public static int check(int h, int m, int s){
        if(h%10==3||m%10==3||m/10==3||s%10==3||s/10==3)
            return cnt++;

        else return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans=0;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                check(i, j, k);
                }
            }
        }
        System.out.println(cnt);
    }
}
