public class ReferenceTransferTest {
    public static void swap(DataWrap dw) {
        var tmp = dw.a;
        dw.a = dw.b;
        dw.b = tmp;
        System.out.println("swap方法转换后，a:" + dw.a + " b:" + dw.b);
        dw = null;
    }

    public static int fn(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * fn(n - 1) + fn(n - 2);
        }
    }

    public static void main(String[] args) {
        DataWrap dw = new DataWrap();
        dw.a = 18;
        dw.b = 34;
        System.out.println("swap方法转换前，a:" + dw.a + " b:" + dw.b);
        swap(dw);
        System.out.println("swap方法转换后，main中的dw数据。a:" + dw.a + " b:" + dw.b);
        System.out.println(fn(10));
    }
}