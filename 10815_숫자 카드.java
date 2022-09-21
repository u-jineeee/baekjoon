import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int[] arr1 = new int[N];

        for(int i = 0; i < N; i++)
            arr1[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr1);

        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M];

        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
            if(binarySearch(arr1, N, arr2[i] ))
                sb.append(1).append(" ");
            else
                sb.append(0).append(" ");

        }
        System.out.println(sb);
    }
    private static boolean binarySearch(int[] card, int n, int x) {
        int left = 0;
        int right = n - 1;

        while(left <= right) {
            int mid = (left + right) /2;

            if(x  < card[mid]) right = mid - 1;
            else if (x > card[mid]) left = mid + 1;
            else return true;
        }
        return false;
    }
}