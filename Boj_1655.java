package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Boj_1655 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        PriorityQueue<Integer> MaxHeap=new PriorityQueue<>(Comparator.reverseOrder()); //내림차순 정렬
        PriorityQueue<Integer> MinHeap=new PriorityQueue<>();   //오름차순 정렬
        for (int i = 0; i <n ; i++) {
            int a=Integer.parseInt(br.readLine());
            if (i%2==0) MaxHeap.add(a);
            else MinHeap.add(a);

            if(!MaxHeap.isEmpty()&&!MinHeap.isEmpty()&&MaxHeap.peek()>MinHeap.peek()){
                    int tmp=MaxHeap.poll();
                    MaxHeap.add(MinHeap.poll());
                    MinHeap.add(tmp);

            }
           sb.append(MaxHeap.peek()).append("\n");
        }
        System.out.println(sb);
    }
}
