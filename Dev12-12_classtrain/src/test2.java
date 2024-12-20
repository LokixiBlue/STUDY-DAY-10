public class test2 {
    public static void main(String[] args)
    {
        for (int num = 1; num <= 1000; num++)
        {
            int sumOfFactors = 0;
            // 用于记录当前因子的索引位置，方便后续输出因子时拼接逗号
            int factorIndex = 0;
            int[] factors = new int[num];
            // 寻找num的所有真因子，并计算它们的和，同时记录因子到数组中
            for (int factor = 1; factor < num; factor++)
            {
                if (num % factor == 0)
                {
                    sumOfFactors += factor;
                    factors[factorIndex++] = factor;
                }
            }
            // 判断该数是否为完数，如果是则按格式输出
            if (sumOfFactors == num)
            {
                System.out.print(num + " its factors are ");
                for (int i = 0; i < factorIndex; i++)
                {
                    System.out.print(factors[i]);
                    if (i < factorIndex - 1)
                    {
                        System.out.print(",");
                    }
                }
                System.out.println();
            }
        }
    }
}