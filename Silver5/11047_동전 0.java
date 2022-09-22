import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main{
    public static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        int i = n - 1;
        while(k != 0) {
            k = cal(k, list.get(i));
            i--;
        }
        System.out.println(cnt);
    }
    public static int cal(int k, int money) {
        if(k % money != k) {
            cnt += (k / money);
            return k - (k / money) * money;
        }
        return k;
    }
}