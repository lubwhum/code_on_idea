public class Father {
    //非静态变量
    private int i = test();
    //静态变量
    private static int j = method();

    //静态代码块
    static {
        System.out.print("(1)");
    }

    //构造方法
    Father(){
        System.out.print("(2)");
    }

    //非静态代码块
    {
        System.out.print("(3)");
    }

    //非静态变量调用
    public int test() {
        System.out.print("(4)");
        return 1;
    }

    //静态变量方法调用
    private static int method() {
        System.out.print("(5)");
        return 1;
    }
}