public class test {
    public static void main(String[] args) {
        test t = new test();
        System.out.println(t.fibo(10));
    }
    public int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
