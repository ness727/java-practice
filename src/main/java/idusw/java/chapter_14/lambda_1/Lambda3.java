package idusw.java.chapter_14.lambda_1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Lambda3 {
    public static void lambdaTest1() {
        String[] arr = new String[]{"dc", "bh", "gi", "ki", "db"};

        arr = Arrays.stream(arr)
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return Character.compare(o1.charAt(0), o2.charAt(0));
                    }
                }.thenComparing(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return Character.compare(o2.charAt(1), o1.charAt(1));
                    }
                }))
                .toArray(String[]::new);

        for (String s : arr) System.out.printf("%s ", s);
    }

    public static void lambdaTest2() {
        String[] arr = new String[]{"dc", "bh", "gi", "ki", "db"};

        arr = Arrays.stream(arr)
                .sorted(
                        ((Comparator<String>)((s1, s2) -> Character.compare(s1.charAt(0), s2.charAt(0))))
                        .thenComparing((s1, s2) -> Character.compare(s2.charAt(1), s1.charAt(1)))
                )
                .toArray(String[]::new);

        for (String s : arr) System.out.printf("%s ", s);
    }
}
