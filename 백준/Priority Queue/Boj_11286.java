package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;


public class Boj_11286 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        PriorityQueue<Integer> qu=new PriorityQueue<>((o1,o2)->Math.abs(o1)==Math.abs(o2)?Integer.compare(o1,o2):Integer.compare(Math.abs(o1),Math.abs(o2)));

        for (int i = 0; i <n ; i++) {
            int a=Integer.parseInt(br.readLine());

            if(a==0){
                if(qu.isEmpty()) System.out.println(0);
                else{
                    System.out.println(qu.poll());
                }
            }
            else{
                qu.add(a);
            }
        }


    }
}
