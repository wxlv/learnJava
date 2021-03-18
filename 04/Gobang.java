import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Gobang {
    // 定义棋盘大小
    private static int BOARD_SIZE = 15;
    // 定义二维数组充当棋盘
    private String[][] board;

    /**
     * 初始化棋盘
     */
    public void initBoard() {
        board = new String[BOARD_SIZE][BOARD_SIZE];
        // 把每个元素赋值为“＋”用于控制台绘制棋盘
        for (int i = 0; i < BOARD_SIZE; i++) {
            Arrays.fill(board[i], "➕");
        }
    }

    /**
     * 打印棋盘
     */
    public void printBoard() {
        // 打印数组每个元素
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        Gobang gb = new Gobang();
        gb.initBoard();
        gb.printBoard();
        // 获取键盘输入
        var br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = null;
        while ((inputStr = br.readLine()) != null) {
            // 将用户输入的字符串以逗号隔开，分割成2个字符串
            String[] posStrArr = inputStr.split(",");
            var xPos = Integer.parseInt(posStrArr[0]);
            var yPos = Integer.parseInt(posStrArr[1]);
            // 把对应数组的点修改为“·”
            gb.board[xPos - 1][yPos - 1] = "⚪";
            gb.printBoard();
            System.out.println("请输入下棋的坐标，以x,y的形式：");
        }
    }
}
