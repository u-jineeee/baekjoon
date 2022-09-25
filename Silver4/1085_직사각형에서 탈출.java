import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       int x = Integer.parseInt(st.nextToken());
       int y = Integer.parseInt(st.nextToken());
       int w = Integer.parseInt(st.nextToken());
       int h = Integer.parseInt(st.nextToken());

       int min1, min2, min;

       min1 = x < (w - x)? x : w - x;
       min2 = y < (h - y)? y : h - y;
       min = min1 < min2? min1: min2;

       System.out.println(min);
    }
}