import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static int zeroCnt;
    public static int oneCnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (arr_1, arr_2) -> {
            if(arr_1[0] == arr_2[0])
                return arr_1[1] - arr_2[1];
            else
                return arr_1[0] - arr_2[0];
                });

        for(int i = 0; i < n; i++)
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");

        System.out.println(sb);
    }
}