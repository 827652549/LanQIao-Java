package 算法.回溯算法;

import java.util.ArrayList;

/**
 * 参数传递
 * 问题：给出n对括号，求括号排列的所有可能性
 *  n为 括号的个数
 */
public class 括号问题 {
    public static void main(String[] args) {
        int n = 3,i;
        int left = n, right = n;
        ArrayList<String> arrayList = new ArrayList<String>();
        back("",arrayList,left,right);
        for (i=0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("共"+i);
    }

    /**
     * 回溯算法
     *
     * @param str       已经拼接的字符串
     * @param arrayList 用于存放解的空间
     * @param leftK     左括号的库存
     * @param rightK    右括号的库存
     */
    public static void back(String str,ArrayList<String> arrayList,int leftK,int rightK){
        if(leftK>0)
            back(str+"(",arrayList,leftK-1,rightK);
        if (rightK>leftK)
            back(str+")",arrayList,leftK,rightK-1);
        if (rightK==0&&leftK==0)
            arrayList.add(str);
    }
}

