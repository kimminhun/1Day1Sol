package Practice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Pro_Double_Prique {

    public int[] solution(String[] operations) {
        int[] answer = {0,0};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        PriorityQueue<Integer> rpq=new PriorityQueue<>(Comparator.reverseOrder());
        for (String operation : operations) {
            String[] str = operation.split(" ");
            if (str[0].equals("I")) {
                pq.add(Integer.parseInt(str[1]));
                rpq.add(Integer.parseInt(str[1]));

            } else if (str[0].equals("D")) {
                if (!rpq.isEmpty()) {
                    if (str[1].equals("1")) {
                        int max = rpq.peek();
                        pq.remove(max);
                        rpq.remove(max);
                    } else {
                        int min = pq.peek();
                        pq.remove(min);
                        rpq.remove(min);

                    }
                }
            }
        }

        if(!rpq.isEmpty()){
            answer[0]=rpq.peek();
            answer[1]=pq.peek();
        }

    return answer;

    }

    public static void main(String[] args) {
        String[] operations={"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};

    }
}
