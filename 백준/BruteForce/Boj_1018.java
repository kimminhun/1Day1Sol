package Practice.August_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.StringTokenizer;

public class Boj_1018 {
        static boolean[][] ar;
        static int min=64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ar = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine().trim();
            for (int j = 0; j < M; j++) {
                if(str.charAt(j)=='W'){
                    ar[i][j] = true;
                }else{
                    ar[i][j] = false;
                }

            }
        }

        int N_row=N-7;
        int M_row=M-7;

        for (int i = 0; i < N_row; i++) {
            for (int j = 0; j < M_row; j++) {
                paint(i, j);
            }
        }
        System.out.println(min);
    }

    public static void paint(int N, int M) {
        int end_N = N + 8;
        int end_M = M + 8;
        int cnt=0;
        boolean flag = ar[N][M];
        for (int i = N; i < end_N; i++) {
            for (int j = M; j < end_M; j++) {
                if(ar[i][j]!=flag){
                    cnt++;
                }
                flag = (!flag);
            }
            flag = !flag;
        }
        cnt = Math.min(cnt, 64 - cnt);
        min = Math.min(min, cnt);
    }

}
