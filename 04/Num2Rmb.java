import java.util.Arrays;

public class Num2Rmb {
    private String[] hanArr = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
    private String[] unitArr = { "十", "百", "千", "万" };

    /**
     * 把一个浮点数分解成整数和小数两部分字符串
     * 
     * @param num 浮点数
     * @return 分解后的字符串数组
     */
    private String[] divide(double num) {
        // 将一个浮点数强制转换成long类型，即可得到其整数部分
        var zheng = (long) num;
        // 浮点数减去整数部分，再乘以100取整得到2位小数
        var xiao = Math.round((num - zheng) * 100);
        return new String[] { zheng + "", String.valueOf(xiao) };
    }

    /**
     * 把一个四位的数字字符串转换成汉字字符串
     * 
     * @param numStr 需要转换的四位数字字符串
     * @return 转换完成的汉字字符串
     */
    private String toHanStr(String numStr) {
        var result = "";
        int numLen = numStr.length();
        for (int i = 0; i < numLen; i++) {
            // char类型转换成int类型，因为它们的ASCII恰巧相差48，因此减去48
            var num = numStr.charAt(i) - 48;
            if (i != numLen - 1 && num != 0) {
                result += hanArr[num] + unitArr[numLen - 2 - i];
            } else {
                result += hanArr[num];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Num2Rmb _Rmb = new Num2Rmb();
        System.out.println("分解浮点数：" + Arrays.toString(_Rmb.divide(377468.1283)));
        // 把一个四位数字字符串转换成汉字
        System.out.println("五位数字字符串转汉字：" + _Rmb.toHanStr("2860"));
    }

}
