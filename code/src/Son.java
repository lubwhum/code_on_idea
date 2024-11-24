public class Son extends Father{
    //非静态变量
    private int i = test();
    //静态变量
    private static int j = method();

    //静态代码块
    static {
        System.out.print("(6)");
    }

    //构造方法
    Son(){
        System.out.print("(7)");
    }

    //非静态代码块
    {
        System.out.print("(8)");
    }

    //非静态变量调用
    public int test() {
        System.out.print("(9)");
        return 1;
    }

    //静态变量方法调用
    private static int method() {
        System.out.print("(10)");
        return 1;
    }
}
