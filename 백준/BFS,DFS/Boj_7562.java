package Practice.August_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_7562 {
    static int[] dx = {2, 1, 2, 1, -2, -1, -2, -1};
    static int[] dy = {1, 2, -1, -2, 1, 2, -1, -2};
    static int[][] cnt;
    static boolean[][] visited;
    static int a;
    static XY start, finish;
    static Queue<XY> que = new LinkedList<>();

    static class XY{
        int x;
        int y;

        public XY(int x,int y) {
            this.x = x;
            this.y=y;
        }
    }
    static int bfs(){
        que.offer(start);
        visited[start.x][start.y] = true;
        while (!que.isEmpty()){
            XY tmp = que.poll();
            if(tmp.x== finish.x&&tmp.y== finish.y) {
                return cnt[tmp.x][tmp.y];
            }
            for (int i = 0; i < 8; i++) {
                int cx = tmp.x + dx[i];
                int cy = tmp.y + dy[i];
                if(0<=cx&&cx<a&&0<=cy&&cy<a){
                    if(!visited[cx][cy]){
                        visited[cx][cy]=true;
                        cnt[cx][cy]=cnt[tmp.x][tmp.y]+1;
                        que.offer(new XY(cx, cy));
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            a = Integer.parseInt(br.readLine());
            cnt= new int[a][a];
            visited = new boolean[a][a];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            start = new XY(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            st = new StringTokenizer(br.readLine(), " ");
            finish = new XY(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

           if(start.x== finish.x&&start.y== finish.y){
               System.out.println(0);
           }else{
               System.out.println(bfs());
           }

        }
    }
}
