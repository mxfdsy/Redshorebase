package cww.world.datastructure.huffmancode;

import java.util.*;

public class HuffmanCode {
    public static void main(String[] args) {
        String content = "i like like like java do you like a java";

        byte[] bytes = content.getBytes();
        System.out.println(bytes.length);
        List<Node> nodes = getNodes(bytes);
        System.out.println(nodes);

        Node root = createHuffmanTree(nodes);
        root.preOrder();

        Map<Byte, String> huffmanCodes = getCodes(root);
        System.out.println("生成的哈负man表" + huffmanCodes);

    }

    //字符串对应的Bytes数组，生成赫夫曼编码表，返回哈夫曼压缩的Bytes

    /**
     * 赫夫曼编码存放的map
     * 32->01 , 97->100
     */
    static Map<Byte, String> huffmanCodes = new HashMap<Byte,String>();

    //字符串拼接
    static StringBuilder stringBuilder = new StringBuilder();



    private static Map<Byte, String> getCodes(Node root) {
        if(root == null) {
            return null;
        }
        //????root????????
        getCodes(root.left, "0", stringBuilder);
        //????root????????
        getCodes(root.right, "1", stringBuilder);
        return huffmanCodes;
    }

    /**
     *  将传入的node 节点的所有叶子及诶单的赫夫曼编码得到，并放入 huffmanCodes集合中
     * @param node  传入节点
     * @param code  路径 左 0 右 1
     * @param stringBuilder 用于拼接
     */
    private static void getCodes(Node node, String code, StringBuilder stringBuilder) {
        StringBuilder stringBuilder2 = new StringBuilder(stringBuilder);
        //??code ?????? stringBuilder2
        stringBuilder2.append(code);
        if(node != null) { //????node == null??????
            //????????node ????????????????????????
            if(node.data == null) { //??????????
                //????????
                //????????
                getCodes(node.left, "0", stringBuilder2);
                //????????
                getCodes(node.right, "1", stringBuilder2);
            } else { //??????????????????
                //????????????????????????????
                huffmanCodes.put(node.data, stringBuilder2.toString());
            }
        }
    }




    /**
     * 创建赫夫曼树
     */

    private static  Node createHuffmanTree(List<Node> nodes) {
        while(nodes.size() > 1) {
            //����, ��С����
            Collections.sort(nodes);
            //ȡ����һ����С�Ķ�����
            Node leftNode = nodes.get(0);
            //ȡ���ڶ�����С�Ķ�����
            Node rightNode = nodes.get(1);
            //����һ���µĶ�����,���ĸ��ڵ� û��data, ֻ��Ȩֵ
            Node parent = new Node(null, leftNode.weight + rightNode.weight);
            parent.left = leftNode;
            parent.right = rightNode;

            //���Ѿ���������Ŷ�������nodesɾ��
            nodes.remove(leftNode);
            nodes.remove(rightNode);
            //���µĶ����������뵽nodes
            nodes.add(parent);

        }
        //nodes ���Ľ�㣬���Ǻշ������ĸ����
        return nodes.get(0);

    }

    /**
     * 获得一个list node 每个Node 带有 数据信息 ，该数据出现的次数
     * @param bytes
     * @return
     */
    public  static List<Node> getNodes(byte[] bytes)   {

        ArrayList<Node> nodes = new ArrayList<>();


        Map<Byte, Integer> counts = new HashMap<>();
        for (byte b : bytes) {
            Integer count = counts.get(b);
            if (count == null) { // Map��û������ַ�����,��һ��
                counts.put(b, 1);
            } else {
                counts.put(b, count + 1);
            }
        }

        for(Map.Entry<Byte, Integer> entry: counts.entrySet()) {
            nodes.add(new Node(entry.getKey(), entry.getValue()));
        }
        return nodes;


    }
}


class Node implements Comparable<Node> {
    Byte data; // �������(�ַ�)��������'a' => 97 ' ' => 32
    //权重
    int weight;
    Node left;//
    Node right;

    public Node(Byte data, int weight) {

        this.data = data;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        // ��С��������
        return this.weight - o.weight;
    }

    public String toString() {
        return "Node [data = " + data + " weight=" + weight + "]";
    }

    //ǰ�����
    public void preOrder() {
        System.out.println(this);
        if (this.left != null) {
            this.left.preOrder();
        }
        if (this.right != null) {
            this.right.preOrder();
        }
    }
}

