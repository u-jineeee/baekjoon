import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        while (n != 0) {
            int x = n % 10;
            list.add(x);
            n /= 10;
        }

        list.sort(Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < list.size(); i++)
            sb.append(list.get(i));

        System.out.println(sb);
    }
}