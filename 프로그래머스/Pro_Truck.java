package Practice.July_26;

import java.util.LinkedList;
import java.util.Queue;

public class Pro_Truck {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> q=new LinkedList<>();
        int sum=0;
        for(int a:truck_weights){

            while (true){
                if(q.isEmpty()){
                    q.offer(a);
                    sum+=a;
                    answer++;
                    break;
                } else if(q.size()==bridge_length){
                    sum-=q.poll();
                }else{
                    if(sum+a>weight){
                        q.offer(0);
                        answer++;
                    }else{
                        q.offer(a);
                        sum+=a;
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer+bridge_length;
    }
}
