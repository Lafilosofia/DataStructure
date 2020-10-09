package Algorithm.Example;

public class Demo2 {
    /*方法2 递归*/
    public static int maxSub_2(int[] sequence){
        int max = 0;
        int n = sequence.length;
        int sum = 0;
        for (int i = 0;i < n;i ++){
            sum = 0;
            for (int j = i;j < n;j ++){
                sum += sequence[j];
                if (sum > max)
                    max = sum;
            }
        }
        return max;
    }
}
