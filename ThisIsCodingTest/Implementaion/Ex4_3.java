package ThisIsCodingTest.implementaion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4_3 {
    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] chess = new int[8][8];
        String str = br.readLine();
        int cnt=0;
        int startx=str.charAt(0)-'a';
        int starty = Integer.parseInt(String.valueOf(str.charAt(1)))-1;
        for (int i = 0; i < 8; i++) {
            int cx = startx + dx[i];
            int cy = starty + dy[i];
            if(cx>0&&cy>0&&cx<8&&cy<8) cnt++;
            else continue;
        }
        System.out.println(cnt);
    }
}
