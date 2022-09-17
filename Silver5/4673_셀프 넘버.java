public class Main {
    public static void main(String[] args) {

        boolean[] arr = new boolean[10001];

        for(int i = 1; i < 10001; i++) {
            int n = notSelfNumber(i);

            if(n < 10001)
                arr[n] = true;
        }

        for(int i = 1; i < 10001; i++)
            if(arr[i] == false)
                System.out.println(i);
    }

    public static int notSelfNumber(int x) {
        int sum = x;

        while(x != 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}