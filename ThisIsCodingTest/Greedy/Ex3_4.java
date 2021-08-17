package ThisIsCodingTest.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex3_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int sol=0;
        while (N!=1){
            if(N%K==0){
                N/=K;
                sol++;
            }else{
                N-=1;
                sol++;
            }
        }
        System.out.println(sol);
    }
}
