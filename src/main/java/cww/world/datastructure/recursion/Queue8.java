package cww.world.datastructure.recursion;

public class Queue8 {
    //8皇后
    int max = 8;
    //定义一个数组 保存位置
    int[] array = new int[max];
    int count;

    public static void main(String[] args) {
        Queue8 queue8 = new Queue8();
        queue8.check(0);
        System.out.println(queue8.count);
    }

    private void check(int n) {
        if (n == max) {
            print();
            return;
        }

        //依次放入皇后
        for (int i = 0; i < max; i++) {
            //第行的第一列
            array[n] = i;
            if (judge(n)) {
                check(n +1);
            }
            //如果冲突放置当前行的第二列
        }

    }

    //当我们放值第n个皇后,就检测该皇后是否和前面的已经摆放的是否冲突
    //不冲突 返回ture

    private boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            //是否在同一列 在同一斜线
            if (array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;

    }


    //输出在棋盘的位置
    private void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        count++;
        System.out.println();
    }
}
