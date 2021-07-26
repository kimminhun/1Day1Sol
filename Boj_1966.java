package Practice.July_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Boj_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i <n ; i++) {
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            LinkedList<int[]> que=new LinkedList<>();
            st=new StringTokenizer(br.readLine());
            for (int j = 0; j < a; j++) {
                que.offer(new int[]{j, Integer.parseInt(st.nextToken())});
            }
            int cnt=0;
            while(!que.isEmpty()){
                int[] tmp=que.poll();
                boolean x=true;

                for (int j = 0; j < que.size(); j++) {
                    if(tmp[1]<que.get(j)[1]){
                        que.offer(tmp);
                        for (int k = 0; k <j ; k++) {
                            que.offer(que.poll());
                        }
                          x=false;
                            break;
                    }
                }
                if(!x){
                    continue;
                }
                cnt++;
                if(tmp[0]==b){
                    break;
                }

            }
            System.out.println(cnt);
        }

    }
}
