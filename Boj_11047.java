package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int[] wallet=new int[n];
        for (int i = 0; i <n ; i++){
            wallet[i]=Integer.parseInt(br.readLine());
        }
        int tmp=0;
        int cnt=0;
        for (int i = n-1; i >=0 ; i--) {
            if(wallet[i]<=k){
                cnt+=(k/wallet[i]);
                k=k%wallet[i];
            }

        }
        System.out.println(cnt);
    }
}
