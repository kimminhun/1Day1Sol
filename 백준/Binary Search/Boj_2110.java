package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_2110 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int N=Integer.parseInt(st.nextToken());
        int C=Integer.parseInt(st.nextToken());
        int[] ar=new int[N];

        for (int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine()," ");
            ar[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ar);

        int left=1;
        int right=ar[N-1]-ar[0];
        int d=0;
        int dis=0;
        while(left<=right){
            int mid=(left+right)/2;
            int start=ar[0];
            int cnt=1;

            for (int i=1; i<N;i++){
                d=ar[i]-start;
                if(mid<=d){
                    ++cnt;
                    start=ar[i];
                }
            }

           if(cnt>=C){
               dis=mid;
               left=mid+1;
           }else {
               right=mid-1;
           }
        }
        System.out.println(dis);

    }
}
