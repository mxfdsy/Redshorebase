package cww.world.datastructure.tenalgorithm;

import java.util.Arrays;

/**
 * 普里姆算法最佳实践(修路问题)
 */
public class PrimAlgorithm {

    public static void main(String[] args) {


        char[] data = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int verxs = data.length;
        //权值的连接矩阵
        int[][] weight = new int[][]{
                {10000, 5, 7, 10000, 10000, 10000, 2},
                {5, 10000, 10000, 9, 10000, 10000, 3},
                {7, 10000, 10000, 10000, 8, 10000, 10000},
                {10000, 9, 10000, 10000, 10000, 4, 10000},
                {10000, 10000, 8, 10000, 10000, 5, 4},
                {10000, 10000, 10000, 4, 5, 10000, 6},
                {2, 3, 10000, 10000, 4, 6, 10000},};

        //创建图
        MGraph graph = new MGraph(verxs);
        //����һ��MinTree����
        MinTree minTree = new MinTree();
        //构建树
        minTree.createGraph(graph, verxs, data, weight);
        //���
        minTree.showGraph(graph);
        //以a节点构建树
        minTree.prim(graph, 1);//

    }


}

class MinTree {
    //����ͼ���ڽӾ���

    /**
     * @param graph  图对象
     * @param verxs  顶点数
     * @param data   顶点信息
     * @param weight 图的邻接矩阵
     *               向   graph填充信息
     */
    public void createGraph(MGraph graph, int verxs, char data[], int[][] weight) {
        int i, j;
        for (i = 0; i < verxs; i++) {//����
            graph.data[i] = data[i];
            for (j = 0; j < verxs; j++) {
                graph.weight[i][j] = weight[i][j];
            }
        }
    }

    //显示图的信息
    public void showGraph(MGraph graph) {
        for (int[] link : graph.weight) {
            System.out.println(Arrays.toString(link));
        }
    }

    // 编写 prim 算法，得到最小生成树

    /**
     * @param graph ͼ
     * @param v     ��ʾ��ͼ�ĵڼ������㿪ʼ����'A'->0 'B'->1...
     */
    public void prim(MGraph graph, int v) {
        //visited[] 是否访问过数组信息
        int visited[] = new int[graph.verxs];
        //visited[] 填充数据 0 威视未被访问过
//		for(int i =0; i <graph.verxs; i++) {
//			visited[i] = 0;
//		}

        //设置当前节点已经被访问
        visited[v] = 1;
        //h1 �� h2 假设权值最小的顶点是
        int h1 = -1;
        int h2 = -1;

        //预设值 权值为一个大值
        int minWeight = 10000;
        for (int k = 1; k < graph.verxs; k++) {//我们其实要找顶点数 减一条边

            //在这里实现 顶点（n） 他有可以有几个领结节点的信息，是否连接过，获取可连接的最小值
            //使用双层for循环其实是在遍历图的信息
            for (int i = 0; i < graph.verxs; i++) {// i����ʾ�����ʹ��Ľ��
                for (int j = 0; j < graph.verxs; j++) {//j����ʾ��û�з��ʹ��Ľ��
                    if (visited[i] == 1 && visited[j] == 0 && graph.weight[i][j] < minWeight) {
                        //�滻minWeight(Ѱ���Ѿ����ʹ��Ľ���δ���ʹ��Ľ����Ȩֵ��С�ı�)
                        minWeight = graph.weight[i][j];
                        h1 = i;
                        h2 = j;
                    }
                }
            }
            //输出权值最小的边
            System.out.println("边<" + graph.data[h1] + "," + graph.data[h2] + "> 权值:" + minWeight);
            ;
            //设置当前节点已经访问过
            visited[h2] = 1;
            //重置权值的值
            minWeight = 10000;
        }

    }
}

class MGraph {
    int verxs; //顶点数
    char[] data;//顶点信息
    int[][] weight; //每个顶点之间的权重信息

    public MGraph(int verxs) {
        this.verxs = verxs;
        data = new char[verxs];
        weight = new int[verxs][verxs];
    }
}


