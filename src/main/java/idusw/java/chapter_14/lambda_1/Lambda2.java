package idusw.java.chapter_14.lambda_1;

public class Lambda2 {
    public static void lambda1() {
        // 모두 작성
        MyFuncOne myFunc1 = (int a) -> { return String.valueOf(a); };

        // 타입 제거
        MyFuncOne myFunc2 = (a) -> { return String.valueOf(a); };

        // 괄호 제거
        MyFuncOne myFunc3 = a -> { return String.valueOf(a); };

        // 중괄호 & return 제거
        MyFuncOne myFunc4 = a -> String.valueOf(a);

        // 메서드 참조 사용
        MyFuncOne myFunc5 = String::valueOf;
    }

    @FunctionalInterface
    private interface MyFuncOne {
        public abstract String func(int a);
    }

    public static void lambda2() {
        // 모두 작성
        MyFuncTwo myFunc1 = (int a, String b) -> { return String.valueOf(a) + b; };

        // 타입 제거
        MyFuncTwo myFunc2 = (a, b) -> { return String.valueOf(a) + b; };

        // 중괄호 & return 제거
        MyFuncTwo myFunc3 = (int a, String b) -> String.valueOf(a) + b;

        // 타입 & 중괄호 & return 제거
        MyFuncTwo myFunc4 = (a, b) -> String.valueOf(a) + b;
    }

    @FunctionalInterface
    private interface MyFuncTwo {
        public abstract String func(int a, String b);
    }
}
