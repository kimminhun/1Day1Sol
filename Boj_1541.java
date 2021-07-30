package Practice.July_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int sum=Integer.MAX_VALUE;
        StringTokenizer st=new StringTokenizer(br.readLine(),"-");

        while (st.hasMoreTokens()){
            int tmp=0;
            StringTokenizer st2=new StringTokenizer(st.nextToken(),"+");
            while (st2.hasMoreTokens()){
                tmp+=Integer.parseInt(st2.nextToken());
            }

            if(sum==Integer.MAX_VALUE){
                sum=tmp;
            }else{
                sum-=tmp;
            }
        }
        System.out.println(sum);
    }
}
