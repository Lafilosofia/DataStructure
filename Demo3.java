/*
package Algorithm.Example;

public class Demo3 {
    */
/*方法3 分治思想*//*

    public static int maxSum(int[] sequence,int left,int right){
        if (left == right)
            if (sequence[left] > 0)
                return sequence[left];
            else
                return 0;
            int mid = (left + right) / 2;
            int maxLeftSum = maxSum(sequence,left,mid);
            int maxRightSum = maxSum(sequence,mid + 1,right) ;
            int maxLeftBorderSum = 0;
            int leftBorderSum = 0;
            for (int i = 0;i >= left;i ++){
                leftBorderSum += sequence[i];
                if (leftBorderSum > maxLeftBorderSum)
                    maxLeftBorderSum = leftBorderSum;
            }
            int maxRightBorderSum = 0;
            int rightBorderSum = 0;
            for (int i = mid + 1;i <= right;i ++){
                rightBorderSum += sequence[i];
                if (rightBorderSum > maxLeftBorderSum)
                    maxRightBorderSum = rightBorderSum;
            }
            return max3(maxLeftSum,maxRightSum,maxLeftBorderSum,maxRightBorderSum);
    }

    public static int max3(int a,int b,int c){
        int max = a>b:a?b;
        max = max > c:max?c;
        return max;
    }

    public static int maxSub_3(int[] sequence){
        return maxSum(a,0,sequence.length - 1);
    }

}
*/
