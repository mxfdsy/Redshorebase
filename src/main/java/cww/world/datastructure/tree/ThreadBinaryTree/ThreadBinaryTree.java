package cww.world.datastructure.tree.ThreadBinaryTree;

public class ThreadBinaryTree {
    public static void main(String[] args) {


        HeroNode root = new HeroNode(1, "tom");
        HeroNode node2 = new HeroNode(3, "jack");
        HeroNode node3 = new HeroNode(6, "smith");
        HeroNode node4 = new HeroNode(8, "mary");
        HeroNode node5 = new HeroNode(10, "king");
        HeroNode node6 = new HeroNode(14, "dim");
        root.setLeft(node2);
        root.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);
        ThreadedBinaryTree threadedBinaryTree = new ThreadedBinaryTree();
        threadedBinaryTree.setRoot(root);
        threadedBinaryTree.threadedNodes();
        HeroNode leftNode = node5.getLeft();
        HeroNode rightNode = node5.getRight();
        System.out.println("10号结点的前驱结点是 =" + leftNode);
        System.out.println("10号结点的后继结点是=" + rightNode);
        System.out.println("使用线索化的方式遍历 线索化二叉树");
//        threadedBinaryTree.threadedList();
    }



   static class ThreadedBinaryTree{
        private HeroNode root;

        //总是前一个节点
        private HeroNode pre = null;


       public void threadedNodes() {
           this.threadedNodes(root);
       }



        //中序 线索化
        public void threadedNodes(HeroNode node) {
            if (node == null) {
                return;
            }

            //先线索化左子树
            threadedNodes(node.getLeft());

            //线索化当前节点
            //处理前驱节点
            if (node.getLeft() == null) {
                //指向前驱节点
                node.setLeft(pre);
                node.setLeftType(1);
            }
            //处理后驱节点
            // 让他下面的那个节点挂他
            if (pre != null &&pre.getRight() == null) {
                //让前驱节点指向右指针
                pre.setRight(node);
                pre.setRightType(1);
            }


            //保存下个节点的信息
            pre = node;

            //线索右子树
            threadedNodes(node.getRight());


        }

        public HeroNode getRoot() {
            return root;
        }

        public void setRoot(HeroNode root) {
            this.root = root;
        }

        public HeroNode getPre() {
            return pre;
        }

        public void setPre(HeroNode pre) {
            this.pre = pre;
        }



    }

    static class HeroNode {

        private int no;

        private String name;

        private HeroNode left;

        private HeroNode right;

        //0 左子树 1 前驱节点
        private int leftType;
        //0 左子树 1 前驱节点
        private int rightType;

        public HeroNode(int no, String name) {
            this.no = no;
            this.name = name;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public HeroNode getLeft() {
            return left;
        }

        public void setLeft(HeroNode left) {
            this.left = left;
        }

        public HeroNode getRight() {
            return right;
        }

        public void setRight(HeroNode right) {
            this.right = right;
        }

        public int getLeftType() {
            return leftType;
        }

        public void setLeftType(int leftType) {
            this.leftType = leftType;
        }

        public int getRightType() {
            return rightType;
        }

        public void setRightType(int rightType) {
            this.rightType = rightType;
        }

        @Override
        public String toString() {
            return "HeroNode{" +
                    "no=" + no +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
