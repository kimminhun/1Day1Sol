package ThisIsCodingTest.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Find {
    public static boolean binarySearch(int[] ar, int start, int end, int target) {
        while (start<=end){
            int mid = (start + end) / 2;
            if(ar[mid]==target) return true;
            else if(ar[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] ar = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[M];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ar);
        for (int i = 0; i < M; i++) {
            boolean result = binarySearch(ar, 0, N - 1, arr[i]);
            if(result) System.out.print("yes ");
            else System.out.print("no ");
        }

    }
}
