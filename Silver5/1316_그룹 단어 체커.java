import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            boolean[] isAlphabet = new boolean[26];
            boolean flag = true;

            for (int j = 0; j < s.length(); j++) {
                int index = s.charAt(j) - 'a';
                if (isAlphabet[index]) {
                    if (s.charAt(j) != s.charAt(j - 1)) {
                        flag = false;
                        break;
                    }
                } else
                    isAlphabet[index] = true;
            }
            if (flag) cnt++;
        }
        System.out.println(cnt);
    }
}