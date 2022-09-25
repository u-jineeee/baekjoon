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
       int n = Integer.parseInt(br.readLine());

       ArrayList<Integer> list = new ArrayList<>();
       for(int i = 0; i < n; i++) {
           StringTokenizer st = new StringTokenizer(br.readLine(), " ");
           String s = st.nextToken();

           switch (s) {
               case "push":
                   int x = Integer.parseInt(st.nextToken());
                   push(list, x); break;
               case "pop":
                   pop(list); break;
               case "size":
                   size(list); break;
               case "empty":
                   empty(list); break;
               case "front":
                   front(list); break;
               case "back":
                   back(list); break;
           }
       }

    }
    public static void push(ArrayList<Integer> list, int n) {
        list.add(n);
    }
    public static void pop(ArrayList<Integer> list) {
        if(list.isEmpty())
            System.out.println("-1");
        else {
            int n = list.get(0);
            list.remove(0);
            System.out.println(n);
        }
    }
    public static void size(ArrayList<Integer> list) {
        System.out.println(list.size());
    }
    public static void empty(ArrayList<Integer> list) {
        if(list.isEmpty())
            System.out.println(1);
        else
            System.out.println(0);
    }
    public static void front(ArrayList<Integer> list) {
        if(list.isEmpty())
            System.out.println("-1");
        else
            System.out.println(list.get(0));
    }
    public static void back(ArrayList<Integer> list) {
        if(list.isEmpty())
            System.out.println("-1");
        else
            System.out.println(list.get(list.size() - 1));
    }
}