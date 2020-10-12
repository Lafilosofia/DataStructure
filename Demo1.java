package Algorithm.Example;

/**
 * 给定整数序列A1-An,求任意一个连续子序列的和的最大值
 */
public class Demo1 {
    /*方法1 穷举法*/
    public static int maxSub_1(int[] sequence){
        int max = 0;
        int n = sequence.length;
        int sum = 0;
        for (int i = 0;i <= n;i ++){
            for (int j = 0;j < n;j ++){
                sum = 0;
                for (int k = j;k < j + 1 && k < n;k ++){
                    sum += sequence[k];
                    if (sum > max)
                        max = sum;
                }
            }
        }
        return max;
    }
}
/*三层for循环时间复杂度为O(n^3)*/
