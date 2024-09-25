package algorithm.solve;

public class Main {
    public static void main(String[] args) {
//        for (int i = 1; i < 11; i++)
//            System.out.printf("%d, ", fibo1(i));
        fibo2();
    }

    // 재귀
    private static int fibo1(int i) {
        if (i < 2) return i;
        return fibo1(i - 2) + fibo1(i - 1);
    }
    
    // DP
    private static void fibo2() {
        int[] result = new int[11];
        result[1] = 1;
        result[2] = 1;

        for (int i = 2; i < 11; i++)
            result[i] = result[i - 2] + result[i - 1];

        for (int r : result)
            System.out.printf("%d, ", r);
    }
}
