import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            list.add(n);
            sum += n;
        }
        int x = sum - 100;
        int y = 0;
        list.sort(Comparator.naturalOrder());

        for(int i = 0; i < 9; i++) {
           y = x - list.get(i);
           if(list.contains(y)) {
               x = list.get(i);
               break;
           }
       }
       for(int i = 0; i < 9; i++) {
           if(list.get(i) == x || list.get(i) == y) {
               continue;
           }
           System.out.println(list.get(i));
       }
    }
}