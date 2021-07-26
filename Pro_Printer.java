package Practice.July_26;

import java.util.LinkedList;

public class Pro_Printer {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        LinkedList<int[]> que = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            que.offer(new int[]{i,priorities[i]});
        }
        while(!que.isEmpty()){
            int[] tmp=que.poll();
            boolean x=true;
            for (int i = 0; i < que.size(); i++) {
                if(tmp[1]<que.get(i)[1]){
                    que.add(tmp);
                    for (int j = 0; j < i; j++) {
                        que.add(que.poll());
                    }
                    x=false;
                    break;
                }
            }

            if(!x) continue;
            answer++;
            if(tmp[0]==location) break;


        }
        return answer;
    }
}
