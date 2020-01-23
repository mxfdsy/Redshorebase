package cww.world.datastructure.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 哈夫曼数
 */
public class huffManTree {

    public static void main(String[] args) {
        int[] arr = {13, 7, 8, 3, 29, 6, 1};
        createHuffmanTree(arr);
        Node huffmanTree = createHuffmanTree(arr);
        huffmanTree.preOrder();

    }

    public static Node createHuffmanTree(int[] arr) {
        List<Node> nodes = new ArrayList<Node>();
        for (int value : arr) {
            nodes.add(new Node(value));
        }
//        //由小到大排序
//        Collections.sort(nodes);
//        System.out.println("nodes = " + nodes);
//
//        //创建一颗新的二叉树
//        Node parent = new Node(nodes.get(0).value + nodes.get(1).value);
//        Node left = nodes.get(0);
//        Node right = nodes.get(1);
//        parent.left = left;
//        parent.right = right;
//
//        //移除list 中的元素
//        nodes.remove(left);
//        nodes.remove(right);
//        nodes.add(parent);
//
//        System.out.println("第一次处理后" + nodes);

        while (nodes.size() > 1) {
            //由小到大排序
            Collections.sort(nodes);
//            System.out.println("nodes = " + nodes);

            //创建一颗新的二叉树
            Node parent = new Node(nodes.get(0).value + nodes.get(1).value);
            Node left = nodes.get(0);
            Node right = nodes.get(1);
            parent.left = left;
            parent.right = right;

            //移除list 中的元素
            nodes.remove(left);
            nodes.remove(right);
            nodes.add(parent);
        }


        return nodes.get(0);


    }
}


class Node implements Comparable<Node> {
    int value; // ���Ȩֵ
    char c; //�ַ�
    Node left; // ָ�����ӽ��
    Node right; // ָ�����ӽ��

    //дһ��ǰ�����
    public void preOrder() {
        System.out.println(this);
        if (this.left != null) {
            this.left.preOrder();
        }
        if (this.right != null) {
            this.right.preOrder();
        }
    }

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node [value=" + value + "]";
    }

    @Override
    public int compareTo(Node o) {
        // TODO Auto-generated method stub
        // ��ʾ��С��������
        return this.value - o.value;
    }

}
