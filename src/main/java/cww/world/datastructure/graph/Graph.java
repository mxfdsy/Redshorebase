package cww.world.datastructure.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * 图
 */
public class Graph {
    public static void main(String[] args) {


        int n = 5;  //���ĸ���
        String Vertexs[] = {"A", "B", "C", "D", "E"};
//        String Vertexs[] = {"1", "2", "3", "4", "5", "6", "7", "8"};

        //����ͼ����
        Graph graph = new Graph(n);
        //ѭ������Ӷ���
        for (String vertex : Vertexs) {
            graph.insertVertex(vertex);
        }
        graph.insertEdge(0, 1, 1); // A-B
        graph.insertEdge(0, 2, 1); //
        graph.insertEdge(1, 2, 1); //
        graph.insertEdge(1, 3, 1); //
        graph.insertEdge(1, 4, 1); //
        //线束邻接矩阵
        graph.showGraph();
        //深度优先遍历
//        graph.dfs();

        //广度优先
        graph.bfs();
    }

    //存顶点
    private ArrayList<String> vertexList;
    //存储对应的领结矩阵
    private int[][] edges;

    //表示边的数目
    private int numOfEdges;

    //是否被访问
    private boolean[] isVisited;


    public Graph(int n) {
        //存放节点
        edges = new int[n][n];
        vertexList = new ArrayList<>(n);
        numOfEdges = 0;
        isVisited = new boolean[vertexList.size()];
    }


    /**
     * 全部节点的 深度优先遍历
     */
    public void dfs() {
        isVisited = new boolean[vertexList.size()];

        for (int i = 0; i < getNumOfVertex(); i++) {
            if (!isVisited[i]) {
                dfs(isVisited, i);
            }
        }
    }

    //全部节点的广度优先遍历
    public void bfs() {
        isVisited = new boolean[vertexList.size()];
        for(int i = 0; i < getNumOfVertex(); i++) {
            if(!isVisited[i]) {
                bfs(isVisited, i);
            }
        }
    }

    /**
     * 深度优先遍历算法
     * 这里是一个节点信息
     *
     * @param
     */
    private void dfs(boolean[] isVisited, int i) {
        //输出节点
        System.out.print(getValueByIndex(i) + "->");
        //置为已经访问
        isVisited[i] = true;
        //获取下一个节点
        int w = getFirstNeighbor(i);
        //递归
        while (w != -1) {
            if (!isVisited[w]) {
                dfs(isVisited, w);
            }
            w = getNextNeighbor(i, w);
        }
    }

    /**
     * 对一个节点进行广度优先遍历的方法
     */
    private void bfs(boolean[] isVisited, int i) {
        //表示队列的头节点对应的下标
        int u;
        //表示领接节点的下标
        int w;
        //队列，记录节点访问的顺序
        LinkedList<Object> queue = new LinkedList<>();
        //访问输出节点的信息
        System.out.print(getValueByIndex(i) + "=>");
        //标记为已访问
        isVisited[i] = true;

        //将节点加入队列
        queue.addLast(i);

        while (!queue.isEmpty()) {
            //取出节点
            u = (Integer)queue.removeFirst();

            w = getFirstNeighbor(u);
            //找到
            while (w != -1) {
                //是否访问过
                if (!isVisited [w]) {
                    System.out.print(getValueByIndex(w) + "=>");
                    isVisited[w] = true;
                    //入队
                    queue.addLast(w);
                }

                //以U为前驱及诶单，找w后面的下一个节点（体现广度优先）
                w = getNextNeighbor(u, w);

            }
        }

    }


    //插入节点
    public void insertVertex(String vertex) {
        vertexList.add(vertex);
    }

    //得到相邻节点的下标

    /**
     * @param index
     * @return 如果存在则返回对应的下标，否则返回-1
     */
    public int getFirstNeighbor(int index) {
        for (int j = 0; j < vertexList.size(); j++) {
            if (edges[index][j] > 0) {
                return j;
            }
        }
        return -1;
    }

    /**
     * 根据前一个邻接节点的下标来获取下一个邻接节点
     */
    public int getNextNeighbor(int v1, int v2) {
        for (int j = v2 + 1; j < vertexList.size(); j++) {
            if (edges[v1][j] > 0) {
                return j;
            }
        }
        return -1;
    }


    //添加边

    /**
     * @param v1     第一个顶点
     * @param v2     第二顶点
     * @param weight 两点间的距离 可以理解为
     */
    public void insertEdge(int v1, int v2, int weight) {
        //加两遍的原因是 a 可以到b  b也可以到 a
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numOfEdges++;
    }


    //得到节点的个数
    public int getNumOfVertex() {
        return vertexList.size();
    }

    //得到边的数量
    public int getNumOfEdges() {
        return numOfEdges;
    }

    //通过下标返回节点
    public String getValueByIndex(int i) {
        return vertexList.get(i);
    }

    //获取权值
    public int getWeight(int v1, int v2) {
        return edges[v1][v2];
    }

    //显示图对应的矩阵
    public void showGraph() {
        for (int[] link : edges) {
            System.err.println(Arrays.toString(link));
        }
    }


}
