package Practice.August_2;

public class Pro_Weekly_Challenge {
    public long solution(int price, int money, int count) {
        long answer = money;
        long sum=0;
        for (int i = 1; i <= count; i++) {
            sum+=price*i;
        }
        answer=sum-answer;
        if(answer<=0) return 0;
        return answer;
    }

}
