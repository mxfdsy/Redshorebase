package cww.world.datastructure;

public class DoubleLinkedListDemo {

    public static void main(String[] args) {

    }


    class DoubleLinkedList {

        private HeroNode2 head = new HeroNode2(0, "", "");


        /**
         * 删除节点
         * 1 找到删除节点的上一个节点 temp
         * 2 temp.next = temp.next.next
         */
        public void delete(int no) {
            if (head.next == null) {
                return;
            }


            HeroNode2 temp = head.next;
            Boolean isExist = false;
            while (true) {
                if (temp == null) {
                    break;
                }
                if (temp.no == no) {
                    isExist = true;
                    break;
                } else {
                    temp = temp.next;
                }
            }

            if (isExist) {
                temp.pre.next = temp.next;
                if (temp.next != null) {
                    temp.next.pre = temp.pre;
                }
            } else {
                System.out.println("没有找到对应的节点信息");
            }
        }


        /**
         * 修改节点信息
         * <p>
         * 找到节点 修改节点
         */
        public void update(HeroNode2 heroNode) {
            HeroNode2 temp = head;
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
         * 添加节点 最后
         *
         * @param heroNode
         */
        public void add(HeroNode2 heroNode) {
            //辅助变量temp是关键
            HeroNode2 temp = head;
            while (true) {
                if (temp.next == null) {
                    break;
                }
                temp = temp.next;
            }

            temp.next = heroNode;
            heroNode.pre = temp;
        }


        /**
         * 遍历节点
         */
        public void list() {
            if (head.next == null) {
                System.out.println("链表是空的");
            }
            HeroNode2 temp = head.next;
            while (true) {
                if (temp == null) {
                    break;
                }
                System.out.println(temp);
                temp = temp.next;
            }
        }


    }


    class HeroNode2 {
        public int no;
        public String name;
        public String nickName;
        public HeroNode2 next;
        public HeroNode2 pre;

        public HeroNode2(int no, String name, String nickName) {
            this.no = no;
            this.name = name;
            this.nickName = nickName;
        }

        @Override
        public String toString() {
            return "HeroNode2{" +
                    "no=" + no +
                    ", name='" + name + '\'' +
                    ", nickName='" + nickName + '\'' +
                    '}';
        }
    }


}
