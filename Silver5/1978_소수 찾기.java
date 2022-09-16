import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if (isPrime(num)) cnt++;
        }
        System.out.println(cnt);
    }

    public static Boolean isPrime(int x) {
        if(x == 1) return false;

        for(int i = 2; i < x; i++) {
            if(x % i == 0)
                return false;
        }
        return true;
    }
}