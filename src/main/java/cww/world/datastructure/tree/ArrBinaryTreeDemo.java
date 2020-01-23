package cww.world.datastructure.tree;

/**
 * 顺序存储二叉树遍历
 */
public class ArrBinaryTreeDemo {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        //����һ�� ArrBinaryTree
        ArrBinaryTree arrBinaryTree = new ArrBinaryTree(arr);
        arrBinaryTree.preOrder(); // 1,2,4,5,3,6,7

    }


    static class ArrBinaryTree {
        private int[] arr;

        public ArrBinaryTree(int[] arr) {
            this.arr = arr;
        }

        public void preOrder() {
            preOrder(0);
        }

        /**
         * 二叉树遍历
         */
        public void preOrder(int index) {
            if (arr == null || arr.length == 0) {
                System.out.println("空");
                return;
            }
            //输出当前元素
            System.out.println(arr[index]);

            //向左遍历 公式根据 顺序存储二叉树定义可得出
            if (2 * index + 1 < arr.length) {
                preOrder(2 * index + 1);
            }

            //向右
            if (2 * index + 2 < arr.length) {
                preOrder(2 * index + 2);
            }
        }

    }

}
