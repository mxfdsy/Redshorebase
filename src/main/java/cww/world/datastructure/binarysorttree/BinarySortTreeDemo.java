package cww.world.datastructure.binarysorttree;

/**
 * 二叉树
 */
public class BinarySortTreeDemo {
    public static void main(String[] args) {
        int[] arr = {7, 3, 10, 12, 5, 1, 9, 2};
        BinarySortTree binarySortTree = new BinarySortTree();
        for (int i = 0; i < arr.length; i++) {
            binarySortTree.add(new Node(arr[i]));

        }
        binarySortTree.infixOrder();

        System.out.println("删除后");
//        binarySortTree.delNode(5);
        binarySortTree.delNode(3);
        binarySortTree.infixOrder();


    }
}


class BinarySortTree {

    private Node root;


    public void delNode(int value) {
        if (root == null) {
            return;
        } else {

            Node targetNode = search(value);
            if (targetNode == null) {
                return;
            }

            if(root.left == null && root.right == null) {
                //删除跟节点
                root = null;
                return;
            }
            //找到父节点
            Node parent = searchParent(value);

            //如果是叶子节点
            if(targetNode.left == null && targetNode.right == null) {
                if (parent.left != null && parent.left.value == value) {
                    //删除左节点
                    parent.left = null;
                } else if (parent.right != null && parent.right.value == value){
                    parent.right = null;
                }
            } else if (targetNode.left != null && targetNode.right != null) {//两颗子树的节点
                int minVal = delRightTreeMin(targetNode.right);
                targetNode.value = minVal;
            } else {//单个子树节点

                //删除节点有左子节点
                if (targetNode.left != null) {
                    if (parent != null) {
                        //如果删除节点在父节点的左边
                        if (parent.left.value == value) {
                            parent.left = targetNode.left;
                        } else { //  targetNode �� parent �����ӽ��

                            //这样可能会违反二叉数定义唉
                            parent.right = targetNode.left;
                        }

                    } else {
                        root = targetNode.left;
                    }
                } else {
                    if(parent != null) {
                        //��� targetNode �� parent �����ӽ��
                        if(parent.left.value == value) {
                            parent.left = targetNode.right;
                        } else { //��� targetNode �� parent �����ӽ��
                            parent.right = targetNode.right;
                        }
                    } else {
                        root = targetNode.right;
                    }

                }


            }

        }


    }


    public int delRightTreeMin(Node node) {
        Node target = node;
        //ѭ���Ĳ������ӽڵ㣬�ͻ��ҵ���Сֵ
        while(target.left != null) {
            target = target.left;
        }
        //��ʱ target��ָ������С���
        //ɾ����С���
        delNode(target.value);
        return target.value;
    }

    public Node search(int value) {
        if (root == null) {
            return null;
        } else {
            return root.search(value);
        }
    }

    public Node searchParent(int value) {
        if (root == null) {
            return null;
        } else {
            return root.searchParent(value);
        }
    }

    public void add(Node node) {
        if (root == null) {
            root = node;
        } else {
            root.add(node);
        }
    }

    public void infixOrder() {
        if (root != null) {
            root.midFixOrder();
        }
    }
}

class Node {
    int value;
    Node left;
    Node right;

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    public Node(int value) {
        this.value = value;
    }

    /**
     * 查找父节点
     *
     * @param value
     * @return
     */
    public Node searchParent(int value) {
        if ((this.left != null && this.left.value == value) ||
                (this.right != null && this.right.value == value)) {
            //找到父节点
            return this;
        } else {

            if (value < this.value && this.left != null) {
                return this.left.searchParent(value); //���������ݹ����
            } else if (value >= this.value && this.right != null) {
                return this.right.searchParent(value); //���������ݹ����
            } else {
                return null; // û���ҵ������
            }
        }

    }


    /**
     * 查找节点
     *
     * @param value
     * @return
     */
    public Node search(int value) {
        if (value == this.value) {
            return this;

        } else if (value < this.value) { //左子树
            if (this.left == null) {
                return null;
            }
            return this.left.search(value);
        } else {
            if (this.right == null) {

            }
            return this.right.search(value);
        }
    }

    public void add(Node node) {
        if (node == null) {
            return;
        }

        if (this.value > node.value) {
            if (this.left == null) {
                this.left = node;
            } else {
                this.left.add(node);
            }
        } else {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.add(node);
            }

        }
    }


    public void midFixOrder() {

        if (this.left != null) {
            this.left.midFixOrder();
        }

        System.out.println(this);

        if (this.right != null) {
            this.right.midFixOrder();
        }
    }

}