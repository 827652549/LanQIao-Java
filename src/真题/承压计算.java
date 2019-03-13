package 真题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 标题：承压计算
 *
 * X星球的高科技实验室中整齐地堆放着某批珍贵金属原料。
 *
 * 每块金属原料的外形、尺寸完全一致，但重量不同。
 * 金属材料被严格地堆放成金字塔形。
 *
 *                              7
 *                             5 8
 *                            7 8 8
 *                           9 2 7 2
 *                          8 1 4 9 1
 *                         8 1 8 8 4 1
 *                        7 9 6 1 4 5 4
 *                       5 6 5 5 6 9 5 6
 *                      5 5 4 7 9 3 5 5 1
 *                     7 5 7 9 7 4 7 3 3 1
 *                    4 6 4 5 5 8 8 3 2 4 3
 *                   1 1 3 3 1 6 6 5 5 4 4 2
 *                  9 9 9 2 1 9 1 9 2 9 5 7 9
 *                 4 3 3 7 7 9 3 6 1 3 8 8 3 7
 *                3 6 8 1 5 3 9 5 8 3 8 1 8 3 3
 *               8 3 2 3 3 5 5 8 5 4 2 8 6 7 6 9
 *              8 1 8 1 8 4 6 2 2 1 7 9 4 2 3 3 4
 *             2 8 4 2 2 9 9 2 8 3 4 9 6 3 9 4 6 9
 *            7 9 7 4 9 7 6 6 2 8 9 4 1 8 1 7 2 1 6
 *           9 2 8 6 4 2 7 9 5 4 1 2 5 1 7 3 9 8 3 3
 *          5 2 1 6 7 9 3 2 8 9 5 5 6 6 6 2 1 8 7 9 9
 *         6 7 1 8 8 7 5 3 6 5 4 7 3 4 6 7 8 1 3 2 7 4
 *        2 2 6 3 5 3 4 9 2 4 5 7 6 6 3 2 7 2 4 8 5 5 4
 *       7 4 4 5 8 3 3 8 1 8 6 3 2 1 6 2 6 4 6 3 8 2 9 6
 *      1 2 4 1 3 3 5 3 4 9 6 3 8 6 5 9 1 5 3 2 6 8 8 5 3
 *     2 2 7 9 3 3 2 8 6 9 8 4 4 9 5 8 2 6 3 4 8 4 9 3 8 8
 *    7 7 7 9 7 5 2 7 9 2 5 1 9 2 6 5 3 9 3 5 7 3 5 4 2 8 9
 *   7 7 6 6 8 7 5 5 8 2 4 7 7 4 7 2 6 9 2 1 8 2 9 8 5 7 3 6
 *  5 9 4 5 5 7 5 5 6 3 5 3 9 5 8 9 5 4 1 2 6 1 4 3 5 3 2 4 1
 * X X X X X X X X X X X X X X X X X X X X X X X X X X X X X X
 *
 * 其中的数字代表金属块的重量（计量单位较大）。
 * 最下一层的X代表30台极高精度的电子秤。
 *
 * 假设每块原料的重量都十分精确地平均落在下方的两个金属块上，
 * 最后，所有的金属块的重量都严格精确地平分落在最底层的电子秤上。
 * 电子秤的计量单位很小，所以显示的数字很大。
 *
 * 工作人员发现，其中读数最小的电子秤的示数为：2086458231
 *
 * 请你推算出：读数最大的电子秤的示数为多少？
 *
 * 注意：需要提交的是一个整数，不要填写任何多余的内容。
 *
 * ---------------------
 *
 */
public class 承压计算 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double data[][] = new double[30][30];
        //复制粘贴原数据批量录入
        for (int i = 0; i < 29; i++) {
            for (int j = 0; j <= i; j++) {
                data[i][j] = input.nextDouble();
            }
        }
        //计算每级的下级各重量
        for (int i = 0; i < 29; i++) {
            for (int j = 0; j <= i; j++) {
                data[i + 1][j] = data[i][j] / 2 + data[i + 1][j];
                data[i + 1][j + 1] = data[i][j] / 2 + data[i + 1][j + 1];
            }
        }
        //将电子秤（天平）的各值赋到数组中
        double balance[] = data[29];
        Arrays.sort(balance);
        System.out.println("最小是" + balance[0] + "最大是" + balance[29]);
        System.out.println("最终结果" + balance[29] / balance[0] * 2086458231);
    }
}
