import java.util.Scanner;
public class test1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //键入被除数范围最大值flag
        int flag = sc.nextInt();
        //使用for循环，遍历判断1至flag的所有数，定义sum用来存储这个数
        for (int num = 1; num <= flag; num++)
        {
            // 定义numall，用于存储数字因子之和，以便后续完数判断
            int numall = 0;
            //定义numflag,用作数组下标
            int numflag = 0;
            //定义numclass,用作存储每一个因子
            //数组范围使用num，因为最后的结果数量肯定是小于被除数范围的最大值，动态节省空间
            int[] numclass = new int[num];
            //定义factor为因子，从1开始遍历到被除数本身
            for (int factor = 1; factor < num; factor++)
            {
                //如果数a 模除 数b的结果等于零的话，说明数b是数a的因子
                if (num % factor == 0)
                {
                    //如果factor是num的因子，就将因子的值加给numall（因子和）
                    numall += factor;
                    //同时将因子放入数组中，以便后续输出
                    //numflag++将数组下标往后移，每次放入一个推一个
                    numclass[numflag++] = factor;
                }
            }
            //如果因子和等于被除数，则输出被除数+所有的因子
            if(numall == num)
            {
                System.out.print(num+"its factors are");
                for(int i=0;i<numflag;i++)
                {
                    System.out.print(numclass[i]);
                    //因为直接输出“，”号，最后会多一个，所以当i遍历至数组的倒数第二个数的时候，就只会直接输出最后一个数，在最后一个数后面就不会有“，”号了
                    if(i<numflag-1)
                    {
                        System.out.print(",");
                    }
                }
                System.out.println();
            }
        }
    }
}