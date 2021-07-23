package Practice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Pro_Disc_Controller {

    class Job{
        int arTime;
        int runtTime;

        public Job(int arTime,int runtTime){
            this.arTime=arTime;
            this.runtTime=runtTime;
        }
    }

    public int solution(int[][] jobs) {
        int answer = 0;

        PriorityQueue<Job> arQue=new PriorityQueue<>(new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                return o1.arTime-o2.arTime;
            }
        });
       for(int[] job:jobs){
        arQue.offer(new Job(job[0],job[1]));
        }
        PriorityQueue<Job> runQue=new PriorityQueue<>(new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                return o1.runtTime-o2.runtTime;
            }
        });
       int cnt=0;
       int time=0;
       int sum=0;
       while (cnt< jobs.length){
           while(!arQue.isEmpty()&&time>=arQue.peek().arTime){
               runQue.offer(arQue.poll());
           }
           if(!runQue.isEmpty()){
               Job j=runQue.poll();
               sum+=j.runtTime+(time-j.arTime);
               time+=j.runtTime;
               cnt++;
           }else{
               time++;
           }
       }
       answer=sum/cnt;
    return answer;

    }

}
