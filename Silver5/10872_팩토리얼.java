import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static int sum = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(factorial(N));

    }
    public static int factorial(int n) {
        if((n - 1) == 0 || n == 0)
            return sum;
        else {
            sum *= n;
        }
        return factorial(n - 1);
    }
}