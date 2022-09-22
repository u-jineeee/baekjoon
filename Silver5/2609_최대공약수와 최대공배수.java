import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int r = Math.min(x, y);

        int gcd = 0;
        int lcm = 0;
        for(int i = r; i > 0; i--)
            if(x % i == 0 && y % i == 0) {
                gcd = i;
                break;
            }
        lcm = x * y / gcd;
        System.out.println(gcd);
        System.out.println(lcm);

    }
}