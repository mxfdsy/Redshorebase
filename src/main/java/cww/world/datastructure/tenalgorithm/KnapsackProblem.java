package cww.world.datastructure.tenalgorithm;

/**
 * 动态规划 背包问题
 */
public class KnapsackProblem {
    public static void main(String[] args) {
        //物品的重量
        int[] w = {1, 4, 3};
        //物品的价值  这里的val[i] = v[i]
        int[] val = {1500, 3000, 2000};
        //背包的容量
        int m = 4;
        //物品的个数
        int n = val.length;

        int[][] v = new int[n + 1][m + 1];

        //记录最优解

        int[][] path = new int[n+1][m+1];

        //初始化行和列为0
        for (int i = 0; i < v.length; i++) {
            //第一列置为0
            v[i][0] = 0;
        }

        for (int i = 0; i < v[0].length; i++) {
            //第一列为0
            v[0][i] = 0;
        }


        //动态规划
        for (int i = 1; i < v.length; i++) {
            for (int j = 1; j < v[0].length; j++) {
                //如果改行的 该列的重量 大于背包的总重量-则使用上一列值的
                if (w[i - 1] > j) {//这里的i-1是因为 我这里的i是从1 开始的
                    v[i][j] = v[i - 1][j];
                } else {
                    //取上一个格子的价值和 放入了当前物品的价值 加上 多余空间的价值 的最大值
//                    v[i][j] = Math.max(v[i - 1][j], val[i - 1] + v[i - 1][j - w[i - 1]]);

                    if(v[i - 1][j] < val[i - 1] + v[i - 1][j - w[i - 1]]) {
                        v[i][j] = val[i - 1] + v[i - 1][j - w[i - 1]];
                        //�ѵ�ǰ�������¼��path
                        path[i][j] = 1;
                    } else {
                        v[i][j] = v[i - 1][j];
                    }

                }
            }

        }


        //输出v
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }


        int i = path.length - 1; //�е�����±�
        int j = path[0].length - 1;  //�е�����±�
        while(i > 0 && j > 0 ) { //��path�����ʼ��
            if(path[i][j] == 1) {
                System.out.printf("第%d个商品放入包中\n", i);
                j -= w[i-1]; //w[i-1]
            }
            i--;
        }


    }
}
