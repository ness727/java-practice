package idusw.java.chapter_14.lambda_1;

public class Lambda1 {
    public void lambda() {
        // 람다식
        MyFunc myFunc1 = i -> { return; };
        myFunc1.func(1);

        // 익명 클래스
        MyFunc myFunc2 = new MyFunc() {
            @Override
            public void func(int a) {
                return;
            }
        };
        myFunc2.func(1);
    }

    @FunctionalInterface
    private interface MyFunc {
        public abstract void func(int a);
    }
}
