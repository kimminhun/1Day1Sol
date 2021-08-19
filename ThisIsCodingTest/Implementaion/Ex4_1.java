package ThisIsCodingTest.implementaion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex4_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x=1;
        int y=1;
        for (int i = 0; i <= N; i++) {
            switch (st.nextToken()){
                case "R":
                    if(y+1<=N) y+=1;
                    break;
                case "L":
                    if(y-1>1) y-=1;
                    break;
                case "U":
                    if(x-1>1) x-=1;
                    break;
                case "D":
                    if(x+1<=N) x+=1;
                    break;

                default: break;

            }
        }
        System.out.println(x+" "+y);
    }
}
