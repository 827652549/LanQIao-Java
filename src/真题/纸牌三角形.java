package 真题;

/**
 * 二.标题：纸牌三角形
 * A,2,3,4,5,6,7,8,9 共9张纸牌排成一个正三角形（A按1计算）。要求每个边的和相等。
 * 下图就是一种排法（如有对齐问题，参看p1.png）。
 *       A
 *      9 6
 *     4   8
 *    3 7 5 2
 * 这样的排法可能会有很多。
 * 如果考虑旋转、镜像后相同的算同一种，一共有多少种不同的排法呢？
 * 请你计算并提交该数字。
 * 注意：需要提交的是一个整数，不要提交任何多余内容。
 * ---------------------
 */
public class 纸牌三角形 {
    public static void main(String[] args) {
        int count=0;
//        int a,b,c,d,e,f,g,
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    for (int l = 0; l < 9; l++) {
                        for (int m = 0; m < 9; m++) {
                            for (int n = 0; n < 9; n++) {
                                for (int o = 0; o < 9; o++) {
                                    for (int p = 0; p < 9; p++) {
                                        for (int q = 0; q < 9; q++) {
                                            if(i!=j&&i!=k&&i!=l&&i!=m&&i!=n&&i!=o&&i!=p&&i!=q
                                                    &&j!=k&&j!=l&&j!=m&&j!=n&&j!=o&&j!=p&&j!=q
                                                    &&k!=l&&k!=m&&k!=n&&k!=o&&k!=p&&k!=q
                                                    &&l!=m&&l!=n&&l!=o&&l!=p&&l!=q
                                                    &&m!=n&&m!=o&&m!=p&&m!=q
                                                    &&n!=o&&n!=p&&n!=q
                                                    &&o!=p&&o!=q
                                                    &&p!=q){

                                                if(i+j+k+l==l+m+n+o&&i+j+k+l==o+p+q+i) {
                                                    System.out.println(i+"-"+j+"-"+k+"-"+l+"-"+m+"-"+n+"-"+o+"-"+p+"-"+q+"");
                                                    count++;

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count/3/2);
    }
}
