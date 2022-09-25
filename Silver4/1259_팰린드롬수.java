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

       while(true) {
           String s = br.readLine();
           boolean flag = true;

           if(s.equals("0")) break;
           for(int i = 0; i < s.length() / 2; i++) {
               if(s.charAt(i) != s.charAt(s.length() - i - 1))
                   flag = false;

           }
           if(flag == true)
               System.out.println("yes");
           else
               System.out.println("no");
       }
    }
}