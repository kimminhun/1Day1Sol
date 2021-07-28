package Practice.Julu_07_28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_5430 {
    public static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        StringTokenizer st;

        while(T-->0) {
            String str=br.readLine();

            int n=Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine(),"[],");

            //String st=br.readLine();
            //st=st.substring(1,st.length()-1);
            //st=new StringTokenizer(st,",");

            sb=new StringBuilder();
            ArrayDeque<Integer> deque = new ArrayDeque<>();
            for (int j = 0; j <n ; j++) {
                deque.add(Integer.parseInt(st.nextToken()));
            }

        AC(str,deque);


            System.out.print(sb);
        }
    }

    public static void AC(String str,ArrayDeque<Integer> deque){
        boolean dir=true;

        for (char cmd:str.toCharArray()) {

            if(cmd=='R'){
                dir=!dir;
                continue;
            }

            if(dir){
                if(deque.pollFirst()==null){
                    sb.append("error\n");
                   return;
                }
            }else{
                if(deque.pollLast()==null){
                    sb.append("error\n");
                    return;
                }
            }
        }
        sb.append("[");
        if(deque.size()>0){

            if(dir){
                sb.append(deque.pollFirst());
                while (!deque.isEmpty()){
                    sb.append(",").append(deque.pollFirst());
                }
            }else{
                sb.append(deque.pollLast());
                while (!deque.isEmpty()){
                    sb.append(",").append(deque.pollLast());
                }
            }

        }
        sb.append("]").append("\n");
    }

}
