package cww.world.datastructure;

/**
 * 数组实现环形队列
 */
public class CircleArray {
    public static void main(String[] args) {





    }
    //数组容量
    private int maxSize;
    //队列头部 默认值为0 元素的第一个元素
    private int font;
    //队列尾部 最后一个元素的后一个位置，空出一个位子
    private int rear;

    private int[] arr;

    //构造器
    public CircleArray(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }

    //数据是否满了 有一个元素是空出来的 就是说 5个长度的数组 4个的时候我们就算他满
    public boolean isFull() {
        return (rear + 1) % maxSize == font;
    }

    public boolean isEmpty() {
        return rear == font;
    }

    public void addQueue(int n) {
        if (isFull()) {
            System.out.println("队列满不能在加了---");
        }
        arr[rear] = n;
        rear = (rear + 1) % maxSize;
    }


    public int getQueue(int n) {
        if (isEmpty()) {
            System.out.println("队列中没有数据---");
        }
        int value = arr[font];
        font = (font + 1) % maxSize;
        return value;
    }


    public void showQueue(int n) {
        if (isEmpty()) {
            System.out.println("队列中没有数据---");
        }

        for (int i = font; i < useFullSize(); i++) {
            System.out.println(String.format("arr[ %d]=%d\n", i % maxSize, arr[i % maxSize]));
        }

    }

    //去除当前有效的 数据信息
    public int useFullSize() {
        return (rear + maxSize - font) % maxSize;
    }

    public  int getHeader() {
        if (isEmpty()) {
            System.out.println("队列中没有数据---");
        }
        return arr[font];

    }
}
