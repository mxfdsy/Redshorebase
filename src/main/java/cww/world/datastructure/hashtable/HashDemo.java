package cww.world.datastructure.hashtable;

import java.util.Scanner;

public class HashDemo {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(7);
        String key = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("add:添加雇员");
            System.out.println("list:显示雇员");
            System.out.println("find:查找雇员");
            System.out.println("exist:退出系统");
            key = scanner.next();
            switch (key) {
                case "add":
                    System.out.println("输入id");
                    int id = scanner.nextInt();
                    System.out.println("输入名字");
                    String name = scanner.next();
                    Emp emp = new Emp(id, name);
                    hashTable.add(emp);
                    break;
                case "list":
                    hashTable.list();
                    break;
                case "exist":
                    scanner.close();
                    break;
                case "find":
                    System.out.println("输入要查找的id");
                    id = scanner.nextInt();
                    hashTable.hashTableFindById(id);
            }
        }


    }
}

class Emp {

    public int id;
    public String name;
    public Emp next;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class HashTable {
    private EmpLinkedList[] empLinkedLists;
    public int size;

    public HashTable(int size) {
        empLinkedLists = new EmpLinkedList[size];
        //分别初始化 每个lianb
        for (int i = 0; i < size; i++) {
            empLinkedLists[i] = new EmpLinkedList();
        }
        this.size = size;
    }


    public void add(Emp emp) {
        //根据员工的ID 得到该员工应该在那条链表
        int no = hasFun(emp.id);
        empLinkedLists[no].add(emp);
    }

    public void list() {
        for (int i = 0; i < empLinkedLists.length; i++) {
            empLinkedLists[i].list(i + 1);
        }
    }

    public void hashTableFindById(int id) {
        int no = hasFun(id);
        Emp emp = empLinkedLists[no].findById(id);
        if (emp == null) {
            System.out.println("没有找到元素");
        } else {
            System.out.printf("在第%d条链表中找到 雇员 id = %d\n", no + 1, id);
        }
    }


    //编写一个散列函数
    public int hasFun(int id) {
        return id % this.size;
    }
}

class EmpLinkedList {

    private Emp head;


    /**
     * 加到当前链表的最后
     */
    public void add(Emp emp) {
        if (head == null) {
            head = emp;
            return;
        }

        Emp curEmp = head;
        while (true) {
            if (curEmp.next == null) {
                break;
            }
            curEmp = curEmp.next;
        }
        curEmp.next = emp;
    }

    public void list(int no) {
        if (head == null) {
            System.out.println("第 " + no + "条链表为空");
            return;
        }
        System.out.println("第 " + no + "条链表信息为");
        Emp curEmp = head;
        while (true) {
            System.out.printf(String.format("id=%s ,name=%s", curEmp.id, curEmp.name));
            if (curEmp.next == null) {
                break;
            }
            curEmp = curEmp.next;
        }
        System.out.println();
    }

    public Emp findById(int id) {
        if (head == null) {
            return null;
        }
        Emp cur = head;
        while (true) {
            if (cur.id == id) {
                return cur;
            }
            if (cur.next == null) {
                return null;
            }
            cur = cur.next;
        }


    }
}
