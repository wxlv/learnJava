import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class ArraysTest2 {
    public static void main(String[] args) {
        int[] a1 = new int[] { 4, -5, 9, 10, -3, 14 };
        Arrays.parallelSort(a1);
        System.out.println("Arrays parallelSort 排序：" + Arrays.toString(a1));
        int[] a2 = new int[] { 23, 19, 3, -9, -11, 19, 5 };
        Arrays.parallelPrefix(a2, new IntBinaryOperator() {
            public int applyAsInt(int left, int right) {
                return left * right;
            }
        });
        System.out.println("Arrays parallelPrefix 转换：" + Arrays.toString(a2));
        int[] a3 = new int[5];
        Arrays.parallelSetAll(a3, new IntUnaryOperator() {
            //operand表示数组下标
            public int applyAsInt(int operand) {
                return operand * 5;
            }
        });
        System.out.println("Arrays parallelSetAll 转换：" + Arrays.toString(a3));
    }
}
