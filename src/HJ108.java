/**
 * description: HJ108 <br>
 * date: 2020/7/8 14:44 <br>
 *
 * @author: Jerry <br>
 * @version: 1.0 <br>
 */

/**
 *@ClassName HJ108 最小公倍数
 *@Descripition 题目描述
 * 正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
 *
 * 输入描述:
 * 输入两个正整数A和B。
 *
 * 输出描述:
 * 输出A和B的最小公倍数。
 *@Author jerry
 *@Date 2020/7/8 14:44
 *@Version 1.0
 **/
public class HJ108 {

    public static int commonDivisor(int m,int n){
        int a = m,b =n;
        int i = 0;
        if(m<n){
            m=m^n;
            n=m^n;
            m=m^n;
        }
        //通过递归区域获取最大公约数，用乘积相除得到最小公倍数
        while(n!=0){
            i = m%n;
            m=n;
            n=i;
        }
        return a*b/m;
    }

    public static void main(String[] args) {
        System.out.println(commonDivisor(31,5));
    }
}
