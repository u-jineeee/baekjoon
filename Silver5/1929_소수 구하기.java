import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean arr[] = new boolean[N + 1];
        arr[0] = arr[1] = true;

        int sqrt = (int)Math.sqrt(N);
        for(int i = 2; i <= sqrt; i++) {
            for(int j = 2; j <=N/i; j++) {
                if(arr[i*j] == true)
                    continue;
                else
                    arr[i*j] = true;
            }
       }
        for(int i = M; i <= N; i++) {
            if(arr[i] == false)
                System.out.println(i);
        }
    }
}