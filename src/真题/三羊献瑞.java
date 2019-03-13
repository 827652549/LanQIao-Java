package 真题;

/**
 * 三羊献瑞
 * <p>
 * 观察下面的加法算式：
 * <p>
 * 祥 瑞 生 辉
 * +    三 羊 献 瑞
 * -------------------
 * 三 羊 生 瑞 气
 * <p>
 * (如果有对齐问题，可以参看【图1.jpg】)
 * <p>
 * 其中，相同的汉字代表相同的数字，不同的汉字代表不同的数字。
 * <p>
 * 请你填写“三羊献瑞”所代表的4位数字（答案唯一），不要填写任何多余内容。
 */
public class 三羊献瑞 {
    public static void main(String[] args) {
        int count = 0;
        int topNum, bottomNum, andNum;
        int a, b, c, d, e = 1, f, g, i;
        for (a = 2; a <= 9; a++) {
            for (b = 0; b <= 9; b++) {
                for (c = 0; c <= 9; c++) {
                    for (d = 0; d <= 9; d++) {
                        for (f = 0; f <= 9; f++) {
                            for (g = 0; g <= 9; g++) {
                                for (i = 0; i <= 9; i++) {
                                    ++count;
                                    if (a != b && a != c && a != d && a != e && a != f && a != g && a != i
                                            && b != c && b != d && b != e && b != f && b != g && b != i
                                            && c != d && c != e && c != f && c != g && c != i
                                            && d != e && d != f && d != g && d != i
                                            && e != f && e != g && e != i
                                            && f != g && f != i
                                            && g != i
                                    ) {
                                        topNum = a * 1000 + b * 100 + c * 10 + d;
                                        bottomNum = e * 1000 + f * 100 + g * 10 + b;
                                        andNum = e * 10000 + f * 1000 + c * 100 + b * 10 + i;
                                        if ((topNum + bottomNum) == andNum) {
                                            System.out.println("祥瑞生辉：" + topNum + " 三羊献瑞：" + bottomNum + " 三羊生瑞气：" + andNum);
                                        }
                                    }

                                }


                            }
                        }
                    }

                }
            }
        }
        System.out.println("共筛选了"+count+"组数");
    }


}

