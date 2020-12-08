public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibNaive(10));
        System.out.println(fibEffective(1000));
    }

    // наивный, медленный, очевидный алгоритм; за счет дублирующихся вычислений при вызове рекурсии вычисляет дольше
    // например: Fn 100 будет вычисляться ~ 50.000 лет
    private static long fibNaive(int n) {
        if (n <= 1)
            return n;
        return fibNaive(n - 1) + fibNaive(n - 2);
    }

    // эффективный алгоритм, вычисляет быстрее
    // например: Fn 100 будет вычисляться меньше 1 сек
    private static long fibEffective(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++)
            arr[i] = arr[i - 1] + arr[i - 2];

        return arr[n];
    }
}
