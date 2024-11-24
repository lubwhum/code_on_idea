package test1;

public class Test {
    private int a = 1893;

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        System.out.println(t1.a);
        System.out.println(t1.hello());
        System.out.println(t2.a);
        System.out.println(t2.hello());
    }

    public String hello() {
        return "江城多山，珞珈独秀";
    }
}
