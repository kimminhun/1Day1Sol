package Practice;

import java.util.PriorityQueue;

public class Pro_More_Spicy {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> que=new PriorityQueue<>();
        for (int i = 0; i <scoville.length ; i++) {
            que.add(scoville[i]);
        }
        while (que.peek()<K){
            if(que.size()<2) return -1;
            int a=que.poll();
            int b=que.poll();
            que.add(a+(b*2));
            answer++;
        }

        return answer;
    }


}
