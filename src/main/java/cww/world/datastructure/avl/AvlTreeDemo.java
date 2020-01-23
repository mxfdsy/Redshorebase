package cww.world.datastructure.avl;


/**
 * 平衡二叉树
 */
public class AvlTreeDemo {

    public static void main(String[] args) {
        //又旋转
        int[] arr = { 10, 12, 8, 9, 7, 6 };
        //左旋转
//        int[] arr = {4,3,6,5,7,8};
        AVLTree avlTree = new AVLTree();
        for (int i = 0; i < arr.length; i++) {
            avlTree.add(new Node(arr[i]));
        }


        System.out.println("�������");
        avlTree.infixOrder();

        System.out.println("平衡处理");
        System.out.println("树的高度" + avlTree.getRoot().height()); //4
        System.out.println("左子树的高度" + avlTree.getRoot().leftHeight()); // 1
        System.out.println("右子树的高度" + avlTree.getRoot().rightHeight()); // 3
        System.out.println("当前的跟节点" + avlTree.getRoot()); // 8
        System.out.println("当前的跟节点的左子节点" + avlTree.getRoot().right.right); // 8
    }
}

class AVLTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    // ����Ҫɾ���Ľ��
    public Node search(int value) {
        if (root == null) {
            return null;
        } else {
            return root.search(value);
        }
    }

    // ���Ҹ����
    public Node searchParent(int value) {
        if (root == null) {
            return null;
        } else {
            return root.searchParent(value);
        }
    }

    // ��д����:
    // 1. ���ص� ��node Ϊ�����Ķ�������������С����ֵ
    // 2. ɾ��node Ϊ�����Ķ�������������С���
    /**
     *
     * @param node
     *            ����Ľ��(���������������ĸ����)
     * @return ���ص� ��node Ϊ�����Ķ�������������С����ֵ
     */
    public int delRightTreeMin(Node node) {
        Node target = node;
        // ѭ���Ĳ������ӽڵ㣬�ͻ��ҵ���Сֵ
        while (target.left != null) {
            target = target.left;
        }
        // ��ʱ target��ָ������С���
        // ɾ����С���
        delNode(target.value);
        return target.value;
    }

    // ɾ�����
    public void delNode(int value) {
        if (root == null) {
            return;
        } else {
            // 1.������ȥ�ҵ�Ҫɾ���Ľ�� targetNode
            Node targetNode = search(value);
            // ���û���ҵ�Ҫɾ���Ľ��
            if (targetNode == null) {
                return;
            }
            // ������Ƿ��ֵ�ǰ��Ŷ���������ֻ��һ�����
            if (root.left == null && root.right == null) {
                root = null;
                return;
            }

            // ȥ�ҵ�targetNode�ĸ����
            Node parent = searchParent(value);
            // ���Ҫɾ���Ľ����Ҷ�ӽ��
            if (targetNode.left == null && targetNode.right == null) {
                // �ж�targetNode �Ǹ��������ӽ�㣬�������ӽ��
                if (parent.left != null && parent.left.value == value) { // �����ӽ��
                    parent.left = null;
                } else if (parent.right != null && parent.right.value == value) {// �����ӽ��
                    parent.right = null;
                }
            } else if (targetNode.left != null && targetNode.right != null) { // ɾ�������������Ľڵ�
                int minVal = delRightTreeMin(targetNode.right);
                targetNode.value = minVal;

            } else { // ɾ��ֻ��һ�������Ľ��
                // ���Ҫɾ���Ľ�������ӽ��
                if (targetNode.left != null) {
                    if (parent != null) {
                        // ��� targetNode �� parent �����ӽ��
                        if (parent.left.value == value) {
                            parent.left = targetNode.left;
                        } else { // targetNode �� parent �����ӽ��
                            parent.right = targetNode.left;
                        }
                    } else {
                        root = targetNode.left;
                    }
                } else { // ���Ҫɾ���Ľ�������ӽ��
                    if (parent != null) {
                        // ��� targetNode �� parent �����ӽ��
                        if (parent.left.value == value) {
                            parent.left = targetNode.right;
                        } else { // ��� targetNode �� parent �����ӽ��
                            parent.right = targetNode.right;
                        }
                    } else {
                        root = targetNode.right;
                    }
                }

            }

        }
    }

    // ��ӽ��ķ���
    public void add(Node node) {
        if (root == null) {
            root = node;// ���rootΪ����ֱ����rootָ��node
        } else {
            root.add(node);
        }
    }

    // �������
    public void infixOrder() {
        if (root != null) {
            root.midFixOrder();
        } else {
            System.out.println("����������Ϊ�գ����ܱ���");
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
     * 左旋转
     */
    private  void leftRotate() {
        //1、创建新的节点，以当前根节点的值
        Node newNode = new Node(value);
        //2、把新的节点的左子树设置成当前节点的左子树
        newNode.left = left;
        //3、把新的节点的右子树设置成你带过去节点的右子树的左子树
        newNode.right = right.left;
        //4、把当前节点的值替换成右子节点的值
        value = right.value;
        //5、把当前节点的右子树设置成当前节点的右子树的右子树
        right = right.right;
        //6、把当前节点的左子树（左子节点）设置成新的节点
        left = newNode;

    }

    private void rightRotate() {
        Node newNode = new Node(value);
        newNode.left = left;
        newNode.left = left.right;
        value = left.value;
        left = left.left;
        right = newNode;
    }

    // 左子树高度
    public int leftHeight() {
        if (left == null) {
            return 0;
        }
        return left.height();
    }

    // 右子树高度
    public int rightHeight() {
        if (right == null) {
            return 0;
        }
        return right.height();
    }

    /**
     * 返回当前节点的高度
     */
    public int height() {
        return Math.max(left == null ? 0 : left.height(), right == null ? 0 : right.height()) + 1;
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

    /**
     * 添加左右旋转功能
     * @param node
     */
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
        //右边的高度大于左边的高度 左旋转
        if (rightHeight() - leftHeight() >1) {
            //他的右子树的 左子树的高度大于他的右子树的高度
            //先对他的右子节点进行右旋转
            //然后当前节点进行左旋转
            if (right != null && right.leftHeight() > right.rightHeight()) {
                right.rightRotate();
                leftRotate();
            } else {
                leftRotate();
            }
            /**
             * 必须要
             */
            return;


        }

        //右旋转
        if(leftHeight() - rightHeight() > 1) {
            //他的左子树 的 右子树的高度大于 左子树
            if (left != null && left.rightHeight() > left.leftHeight()) {
                //左旋转
                left.leftHeight();
                //右旋转
                rightRotate();
            } else {
                rightRotate();
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