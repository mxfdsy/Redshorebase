package cww.world.datastructure;

/**
 * 约瑟夫问题
 */
public class Josepfu {

    public static void main(String[] args) {
        CircleSingleLinkList circleSingleLinkList = new CircleSingleLinkList();
        circleSingleLinkList.addBoy(5);
//        circleSingleLinkList.list();

        circleSingleLinkList.countBoy(1, 2, 5);


    }
}


class Boy {
    private int no;

    private Boy next;

    public Boy(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }
}

//单向的环形链表
class CircleSingleLinkList {

    public CircleSingleLinkList() {
    }

    private Boy first = new Boy(-1);


    /**
     * 根据用户的输入，计算小孩出圈的顺序
     *
     * @param startNo  从第几个个小孩开始数数
     * @param countNum 数几下
     * @param nums     表示最初由有多少个小孩在圈中
     */
    public void countBoy(int startNo, int countNum, int nums) {
        System.out.println("记得要校验入参");

        //创建一个辅助指针
        Boy helper = first;
        //让这个辅助指针helper 应该事先指向first的前一个节点
        while (true) {
            if (helper.getNext() == first) {
                break;
            }
            helper = helper.getNext();
        }
        //开始让 first 和helper 开始移动
        for (int i = 0; i < startNo - 1; i++) {
            first = first.getNext();
            helper = helper.getNext();
        }
        //小孩开始报数 first 和 help 移动  countNum -1 次
        while (true) {
            if (helper == first) {
                break;
            }
            //开始移动指针
            for (int i = 0; i < countNum -1; i++) {
                first = first.getNext();
                helper = helper.getNext();
            }
            //这时first 指向的节点。就是要出圈的小孩
            System.out.println("要出圈的小孩" + first.getNo());
            first = first.getNext();
            helper.setNext(first);
        }

        System.out.println("最后留在圈中的小孩编号为" + first.getNo());


    }

    public void addBoy(int nums) {
        if (nums < 1) {
            return;
        }
        //先赋值 first 为什么会错-》自己debug 看下就知道了
        Boy cur = null;
        for (int i = 1; i <= nums; i++) {
            Boy boy = new Boy(i);
            if (i == 1) {
                first = boy;
                boy.setNext(first);
                cur = first;
            } else {
                cur.setNext(boy);
                boy.setNext(first);
                cur = boy;
                if (1 == 1) {
                    System.out.println("sss");
                }
            }
        }
    }


    public void list() {
        if (first == null) {
            return;
        }
        Boy cur = first;
        while (true) {
            System.out.println(cur.getNo());
            if (cur.getNext() == first) {
                return;
            }
            cur = cur.getNext();
        }

    }
}
