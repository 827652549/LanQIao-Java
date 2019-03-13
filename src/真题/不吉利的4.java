package 真题;

/**
 * 填空题：（第六届蓝桥杯本科B组）
 * 有些人很迷信数字，比如带“4”的数字，认为和“死”谐音，就觉得不吉利。
 * 虽然这些说法纯属无稽之谈，但有时还要迎合大众的需求。某抽奖活动的奖券号码是5位数（10000-99999），
 * 要求其中不要出现带“4”的号码，主办单位请你计算一下，如果任何两张奖券不重号，最多可发出奖券多少张。
 *
 * 下面写了三种方法
 */
public class 不吉利的4 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10000; i <= 99999; i++) {
            if (passFour3(i))
                count++;
        }
        System.out.println("总共" + count + "个吉利数");
    }

    /**
     * 自己想的方案（非回溯）
     *
     * @param num
     * @return
     */
    public static boolean passFour1(int num) {
        if (num % 10 != 4)
            if ((num / 10) % 10 != 4)
                if ((num / 100) % 10 != 4)
                    if ((num / 1000) % 10 != 4)
                        if ((num / 10000) % 10 != 4) {
                            System.out.println(num);
                            return true;
                        }
        return false;

    }

    /**
     * 回溯法
     * @param num
     * @return
     */
    public static boolean passFour2(int num) {
        while (num > 0) {
            if (num % 10 == 4) return false;
            num/=10;
        }
        return true;

    }

    /**
     * 利用字符串的截取
     * @param num
     * @return
     */
    public static boolean passFour3(int num) {
        String strNum = String.valueOf(num);
        char[] charNum = strNum.toCharArray();
        for (int i = 0; i < charNum.length; i++) {
            int numItem = charNum[i]-'0';//每一位的数字
            if(numItem==4)
                return false;
        }
        return true;

    }




}
