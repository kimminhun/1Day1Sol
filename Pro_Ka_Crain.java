import java.util.Stack;

public class Pro_Ka_Crain {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stk=new Stack<>();
        int kmp=0;
        for (int i=0; i<moves.length;i++){
            int k=moves[i]-1;
            if(!stk.isEmpty()) {
                kmp=stk.peek();
            }
            for (int j=0;j< board.length;j++){
                if(board[j][k]!=0){
                    if(board[j][k]==kmp) {
                        answer+=2;
                        stk.pop();
                        board[j][k]=0;
                        break;
                    }else {
                        stk.push(board[j][k]);
                        board[j][k]=0;
                        break;
                    }
                }

            }
        }
        return answer;
    }
        public static void main(String[] args) {
        int[][] board={{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves={1,5,3,5,1,2,1,4};
           solution(board,moves);
        }
}
