package ThisIsCodingTest.implementaion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex4_4 {
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};
    static int[][] visit;
    static boolean[][] visited;
    static int direction;

    public static void trunLeft(){
        direction-=1;
        if(direction==-1) direction=3;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        visit = new int[N][M];
        visited = new boolean[N][M];
        st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        direction = Integer.parseInt(st.nextToken());
        visited[x][y]=true;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0;j<M;j++){
                visit[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt=1;
        int turn=0;
        while (true){
            trunLeft();
            int cx = x + dx[direction];
            int cy = y + dy[direction];
            if(!visited[cx][cy]&&visit[cx][cy]==0){
                visited[cx][cy]=true;
                x=cx;
                y=cy;
                cnt++;
                turn=0;
                continue;
            }else turn++;
            if(turn==4){
                cx = x + dx[direction];
                cy = y + dy[direction];

                if(visit[cx][cy]==0){
                    x=cx;
                    y=cy;
                }else break;
                turn=0;
            }
        }
        System.out.println(cnt);
    }
}
