public class ReturnThis {
    public int age;

    public ReturnThis grow() {
        age++;
        return this;
    }

    public static void swap(int a, int b) {
        var tmp = a;
        a = b;
        b = tmp;
        System.out.println("swap方法转换后a：" + a + " b:" + b);
    }

    public static void main(String[] args) {
        var a1 = new ReturnThis();
        a1.grow().grow().grow();
        System.out.println(a1.age);
        System.out.println("swap方法转换前a：19 b:31");
        swap(19, 31);
    }
}
