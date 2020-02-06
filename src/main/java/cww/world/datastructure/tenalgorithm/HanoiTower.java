package cww.world.datastructure.tenalgorithm;

/**
 * 分治算法 汉诺塔
 */
public class HanoiTower {
    public static void main(String[] args) {
        hanoiTower(4,'a','b','c');
    }


    public static void hanoiTower(int num, char a, char b, char c) {
        //如果只有一个盘
        if (num == 1) {
            System.out.println("第一个盘从 " + a + "->" + c);
        } else {
            //如果有n>2的情况 ，我们可以总是可以看做是两个盘 1.最下边的一个盘 2 上面所有盘
            //1 先把上面所有盘a->b ，移动过程会使用到c
            hanoiTower(num - 1, a, c, b);

            //把最下边的盘 从a->c
            System.out.println("第" + num + "个盘从 " + a + "->" + c);
            //把B 塔的所有盘从b->c,移动过程使用到a塔
            hanoiTower(num - 1, b, a, c);
        }

    }
}
