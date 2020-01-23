package cww.world.datastructure.tree;

/**
 * 二叉树
 *
 * 前序遍历，中序遍历，后续遍历，
 * 后续遍历效率高
 */
public class BinaryTreeDemo {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        HeroNode root = new HeroNode(1, "宋江");
        HeroNode node2 = new HeroNode(2, "吴用");
        HeroNode node3 = new HeroNode(3, "卢俊义");
        HeroNode node4 = new HeroNode(4, "林冲");
        HeroNode node5 = new HeroNode(5, "关胜");
        root.setLeft(node2);
        root.setRight(node3);
        node3.setRight(node4);
        node3.setLeft(node5);
        binaryTree.setRoot(root);

        //输出
////        binaryTree.preOrder();
//        binaryTree.mixOrder();

        //查找
//        HeroNode heroNode = binaryTree.preOrderSearch(15);
//        if (heroNode != null) {
//            System.out.println(heroNode);
//        } else {
//            System.out.println("没有找到");
//        }
        //删除
        System.out.println("删除前，前序遍历");
        binaryTree.preOrder();
        binaryTree.deleteNode(5);
        System.out.println("删除后，前序遍历");
        binaryTree.preOrder();

    }

    static class BinaryTree{
        private HeroNode root;

        public BinaryTree() {
        }

        public void setRoot(HeroNode root) {
            this.root = root;
        }

        //前-遍历-输出
        public  void  preOrder(){
            if (this.root != null) {
                this.root.preOrder();
            }
        }


        //中-遍历-输出
        public  void  mixOrder(){
            if (this.root != null) {
                this.root.mixOrder();
            }
        }


        //后-遍历-输出
        public  void  postOrder(){
            if (this.root != null) {
                this.root.postOrder();
            }
        }

        //前 -查找
        public  HeroNode preOrderSearch(int no) {
            if (root != null) {
                return root.preSearchNode(no);
            } else {
                return null;
            }
        }

        //中-查找
        public  HeroNode infixOrderSearch(int no) {
            if (root != null) {
                return root.infixSearchNode(no);
            } else {
                return null;
            }
        }

        //后-查找
        public  HeroNode postOrderSearch(int no) {
            if (root != null) {
                return root.postSearchNode(no);
            } else {
                return null;
            }
        }

        //
        public void deleteNode(int no) {
            if (root != null) {
                if (root.no == no) {
                    root = null;
                } else {
                    root.deleteNode(no);
                }
            } else {
                System.out.println("空树不能删除");
            }
        }

    }


    static class HeroNode{
        private int no;

        private String name;

        private HeroNode left;

        private HeroNode right;

        public HeroNode(int no, String name) {
            this.no = no;
            this.name = name;
        }

        //前序遍历 父节点->左节点->右节点
        public void preOrder(){
            System.out.println(this);
            if (this.left != null) {
                this.left.preOrder();
            }
            if (this.right != null) {
                this.right.preOrder();;
            }
        }
        //中序遍历  左节点->父节点->右节点
        public void mixOrder(){
            if (this.left != null) {
                this.left.mixOrder();
            }
            System.out.println(this);
            if (this.right != null) {
                this.right.mixOrder();
            }
        }

        //后序遍历  左节点->又节点->左节点
        public void postOrder(){
            if (this.left != null) {
                this.left.postOrder();
            }

            if (this.right != null) {
                this.right.postOrder();
            }

            System.out.println(this);
        }

        //如果是叶子节点，则删除该节点
        //如果删除的节点是非叶子节点，则删除该子树
        public void deleteNode(int no) {
            if (this.left != null && this.left.no == no) {
                this.left = null;
                return;
            }
            if (this.right != null && this.right.no == no) {
                this.right = null;
                return;
            }
            if (this.no == no) {

                return;
            }

            if (this.left != null) {
                this.left.deleteNode(no);
            }

            if (this.right != null) {
                this.right.deleteNode(no);
            }
            System.out.println("没有找到");
        }

        //前序遍历查找
        public  HeroNode preSearchNode(int no) {
            if (this.no == no) {
                return this;
            }

            HeroNode result = null;
            //向左
            if (this.left != null) {
                result =this.left.preSearchNode(no);
            }

            if (result != null) {
                return result;
            }

            //向右
            if (this.right != null ) {
                result = this.right.preSearchNode(no);
            }

            if (result != null) {
                return result;
            }
            return null;
        }


        //中序遍历查找
        public  HeroNode infixSearchNode(int no) {
            HeroNode result = null;
            //向左
            if (this.left != null) {
                result =this.left.infixSearchNode(no);
            }


            if (result != null) {
                return result;
            }

            //root
            if (this.no == no) {
                return this;
            }


            //向右
            if (this.right != null ) {
                result = this.right.infixSearchNode(no);
            }

            if (result != null) {
                return result;
            }
            return null;
        }

        //后序遍历查找
        public  HeroNode postSearchNode(int no) {
            HeroNode result = null;
            //向左
            if (this.left != null) {
                result =this.left.postSearchNode(no);
            }


            if (result != null) {
                return result;
            }


            //向右
            if (this.right != null ) {
                result = this.right.postSearchNode(no);
            }

            if (result != null) {
                return result;
            }

            //root
            if (this.no == no) {
                return this;
            }
            return null;
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

        @Override
        public String toString() {
            return "HeroNode{" +
                    "no=" + no +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
