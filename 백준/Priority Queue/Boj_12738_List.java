package Practice.August_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_12738_List {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] ar = new int[N+1];
        List<Integer> list=new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        list.add(-1);
        for (int i = 1; i <=N ; i++) {
            int num = ar[i];
            int left=1;
            int right=list.size()-1;
            if(num>list.get(list.size()-1)) list.add(num);
            else{
                while (left<right){
                    int mid=(left+right)/2;
                    if(list.get(mid)>=num) right=mid;
                    else left=mid+1;
                }
                list.set(right, num);
            }
        }
        System.out.println(list.size()-1);
    }
}
