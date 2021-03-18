import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] iArr = new int[4];
        iArr[0] = 4;
        iArr[1] = 2;
        iArr[2] = 10;
        iArr[3] = 90;
        System.out.println("Arrays操作数组：" + Arrays.toString(iArr));
        Arrays.fill(iArr,929);
        System.out.println("Arrays.fill赋值后输出：" + Arrays.toString(iArr));
    }
}
