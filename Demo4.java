package Algorithm.Example;

public class Demo4 {
    /*方法4 动态规划*/
    public static int maxSub_4(int[] sequence){
        int max = 0;
        int n = sequence.length;
        int sum = 0;
        for (int i = 0;i < n;i ++){
            sum += sequence[i];
            if (sum > max)
                max = sum;
            else if (sum < 0);
            sum = 0;
        }
        return max;
    }
}
