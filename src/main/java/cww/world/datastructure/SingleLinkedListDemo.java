package cww.world.datastructure;

import java.util.Stack;

/**
 * 单链表
 * head节点不存放数据 表示链表的头部
 */
public class SingleLinkedListDemo {

    public static void main(String[] args) {

        HeroNode heroNode1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode heroNode2 = new HeroNode(3, "cww", "cww");
        HeroNode heroNode3 = new HeroNode(5, "fl", "fl");
        HeroNode heroNode4 = new HeroNode(7, "syb", "syb");

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.add(heroNode1);
        singleLinkedList.add(heroNode2);
        singleLinkedList.add(heroNode3);
        singleLinkedList.add(heroNode4);
        singleLinkedList.list();

//        singleLinkedList.delete(1);
//        singleLinkedList.update(heroNode5);
//        singleLinkedList.addOrder(heroNode1);
//        singleLinkedList.addOrder(heroNode5);

//        int length = singleLinkedList.getLength();
//        System.out.println(length);

//        HeroNode backNode = singleLinkedList.getBackNode(2);
//        System.out.println(backNode);
//        singleLinkedList.revert(SingleLinkedList.head);
//        singleLinkedList.list();

        System.out.println("逆向输出");
        singleLinkedList.revertAndPrintList(SingleLinkedList.head);


    }


    static class SingleLinkedList {
        public SingleLinkedList() {
        }

        private static HeroNode head = new HeroNode(0, "", "");


        /**
         * 合并连个有序的单列表，合并之后依然有序(由小到大)
         */
        public void mergeList(HeroNode list1, HeroNode list2,HeroNode head) {
            if (list1.next == null || list2.next == null) {
                return;
            }
            HeroNode cur1 = list1.next;
            HeroNode cur2 = list2.next;
            HeroNode temparyHead = new HeroNode(0, "1", "1");
            HeroNode next1 = null;
            HeroNode next2 = null;

            while (cur1 != null || cur2 != null) {
                if (cur1 != null && cur2 != null) {
                    if (cur1.no < cur2.no) {
                        next1 =cur1.next;
                        cur1.next = next1;
                        temparyHead.next = cur1;
                        cur1 = cur1.next;
                    } else if (cur1.no > cur2.no) {
                        next2 = cur2.next;
                        cur2.next = next2;
                        temparyHead.next = cur2;
                        cur2 = cur2.next;
                    } else {

                    }


                }

            }

        }


        /**
         * 逆序打印单链表
         */
        public void revertAndPrintList(HeroNode head) {
            if (head.next == null) {
                return;
            }
            Stack<HeroNode> nodes = new Stack<>();
            HeroNode cur = head.next;
            while (cur != null) {
                nodes.push(cur);
                cur = cur.next;
            }

            while (nodes.size() > 0) {
                System.out.println(nodes.pop());
            }
        }


        /**
         * 实现链表的反转
         */

        public void revert(HeroNode head) {
            if (head.next == null || head.next.next == null) {
                return;
            }

            HeroNode reverseHead = new HeroNode(0, "", "");

            HeroNode cur = head.next;
            HeroNode next = null;
            while (cur != null) {
                next = cur.next;
                //这句话应该很好懂的 居然想了这么久
                cur.next = reverseHead.next;
                reverseHead.next = cur;
                cur = next;

            }

            head.next = reverseHead.next;

        }


        /**
         * 查找单列表中倒数第k个节点
         */

        public HeroNode getBackNode(int k) {
            if (k <= 0) {
                return null;
            }

            int length = getLength();  //3
            if (k > length) {  // k =2
                return null;
            }

            HeroNode temp = head;
            if (temp.next == null) {
                return null;
            }

            int order = length - k + 1;
            int index = 1;
            while (true) {
                if (order == index) {
                    return temp.next;
                }
                index++;
                temp = temp.next;
            }
        }


        /**
         * 1 求单链表中有效节点的个数
         */
        public int getLength() {
            HeroNode temp = head;
            int length = 0;
            while (true) {
                if (temp.next == null) {
                    return length;
                }
                length++;
                temp = temp.next;
            }
        }

        //向链表中添加节点 当不考虑 编号顺序时
        //1 找到链表的最后一个节点
        //2 将这个节点的next 指向新的节点

        /**
         * 添加节点
         *
         * @param heroNode
         */
        public void add(HeroNode heroNode) {
            //辅助变量temp是关键
            HeroNode temp = head;
            while (true) {
                if (temp.next == null) {
                    break;
                }
                temp = temp.next;
            }

            temp.next = heroNode;
        }

        /**
         * 修改节点信息
         * <p>
         * 找到节点 修改节点
         */
        public void update(HeroNode heroNode) {
            HeroNode temp = head;
            boolean isFind = false;
            while (true) {
                if (temp.next == null) {
                    System.out.println("链表为空");
                    break;
                }
                if (temp.no == heroNode.no) {
                    isFind = true;
                    break;
                }
                temp = temp.next;
            }
            if (isFind) {
                temp.name = heroNode.name;
                temp.nickName = heroNode.nickName;
            } else {
                System.out.printf("未找到对应的节点信息，传入节点信息为%d%n", heroNode.no);
            }

        }

        /**
         * 按照 顺序添加节点
         * 要求 no 的顺序添加节点（由小到大） ，由小到大 若节点已经存在则提示
         * 思路 ：
         * 1 找到 需要添加节点的位置（遍历 ，辅助变量），找到节点 是插入节点的上一个节点（temp）
         * 2  heroNode.next = temp.next
         * temp.next = heroNode
         *
         * @param heroNode
         */
        public void addOrder(HeroNode heroNode) {
            HeroNode temp = head;
            boolean isExist = false;
            while (true) {
                if (temp.next == null) {
                    break;
                }
                if (temp.next.no > heroNode.no) {
                    break;
                } else if (temp.next.no == heroNode.no) {
                    isExist = true;
                }
                temp = temp.next;
            }

            if (isExist) {
                System.out.println("添加的编号已经存在");
                return;
            }

            heroNode.next = temp.next;
            temp.next = heroNode;

            System.out.println("添加成功");

        }

        /**
         * 删除节点
         * 1 找到删除节点的上一个节点 temp
         * 2 temp.next = temp.next.next
         */
        public void delete(int no) {
            HeroNode temp = head;
            Boolean isExist = false;
            while (true) {
                if (temp.next == null) {
                    break;
                }
                if (temp.next.no == no) {
                    isExist = true;
                    break;
                } else {
                    temp = temp.next;
                }
            }

            if (isExist) {
                temp.next = temp.next.next;
            } else {
                System.out.println("没有找到对应的节点信息");
            }
        }

        /**
         * 遍历节点
         */
        public void list() {
            if (head.next == null) {
                System.out.println("链表是空的");
            }
            HeroNode temp = head.next;
            while (true) {
                if (temp == null) {
                    break;
                }
                System.out.println(temp);
                temp = temp.next;
            }
        }

    }


    static class HeroNode {
        public int no;
        public String name;
        public String nickName;
        public HeroNode next;

        public HeroNode(int no, String name, String nickName) {
            this.no = no;
            this.name = name;
            this.nickName = nickName;
        }

        @Override
        public String toString() {
            return "HeroNode{" +
                    "no=" + no +
                    ", name='" + name + '\'' +
                    ", nickName='" + nickName + '\'' +
                    '}';
        }
    }

}
