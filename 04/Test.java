import java.nio.charset.Charset;
public class Test {

    public static void main(String[] args) {
        try {
            var a = 5;
            var b = ++a + 6;
            System.out.println("a++:" + b);

            double c = Math.pow(a, 5);
            System.out.println(c);
            System.out.println("a的平方根：" + Math.sqrt(a));
            System.out.println("0~1的随机数：" + Math.random());
            System.out.println("a的sin值：" + Math.sin(a));

            System.out.println("Default Charset:" + Charset.defaultCharset());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
