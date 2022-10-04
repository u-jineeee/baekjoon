import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            int result = hotel(h, w, x);
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
    static int hotel(int h, int w, int x) {
        int result;
        if(x % h == 0)
            result = h * 100 + x / h;
        else
            result = (x % h) * 100 + (x / h) + 1;
        return result;
    }
}