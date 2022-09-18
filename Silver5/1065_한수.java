import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int x = Integer.parseInt(br.readLine());
      int cnt = 0;

      for(int i = 1; i <= x; i++) {
        if(sequence(i) == 1)
            cnt++;
      }
      System.out.println(cnt);
    }
    static int sequence(int n) {
        int[] r = new int[4];
        int cnt = 0;

        if(n < 100)
            return 1;
        while(n != 0) {
            r[cnt++] = n % 10;
            n /= 10;
        }
        int x = r[0] - r[1];
        for(int i = 0; i < cnt - 1; i++) {
            if(r[i] - r[i + 1] != x)
                return 0;
        }
        return 1;
    }
}