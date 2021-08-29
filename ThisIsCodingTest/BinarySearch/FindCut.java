package ThisIsCodingTest.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindCut {
   static int target;
   static int sum;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        target = Integer.parseInt(st.nextToken());
        int[] ar = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        int result = 0;
        Arrays.sort(ar);
        int start=0;
        int end = ar[N - 1];
        while (start <= end) {
            int sum=0;
            int mid = (start + end) / 2;
            for (int i = 0; i < N; i++) {
                if(ar[i]>mid) sum += ar[i] - mid;
            }
            if(sum<target) end=mid-1;
            else{
                result=mid;
                start=mid+1;
            }
        }
        System.out.println(result);

    }
}
