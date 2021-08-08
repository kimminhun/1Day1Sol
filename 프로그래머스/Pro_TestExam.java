package Practice.August_4;

import java.util.ArrayList;

public class Pro_TestExam {
    public ArrayList<Integer> solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[][] user={
                {1,2,3,4,5},
                {2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5}
        };
        int[] point = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if(user[0][i%5]==answers[i]) point[0]++;
            if(user[1][i%8]==answers[i]) point[1]++;
            if(user[2][i%10]==answers[i]) {
                point[2]++;
            }
        }
        int max = Math.max(Math.max(point[0], point[1]), point[2]);
        for (int i = 0; i < 3; i++) {
            if(max == point[i]) {
                answer.add(i+1);
            }
        }
        return answer;
    }
}
