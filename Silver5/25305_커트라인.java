import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main{
    public static int sum = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < N; i++)
            list.add(Integer.parseInt(st.nextToken()));

        list.sort(Comparator.reverseOrder());

        System.out.println(list.get(C - 1));

    }
}