package cww.world.reflect;

import cww.world.traceImpl.BillItemNameEnum;

public class Test {
    public static void main(String[] args) {
        for (BillItemNameEnum value : BillItemNameEnum.values()) {
            System.out.println(value);
            System.out.println(value.getKey());
            System.out.println(value.getItemName());
        }
    }
}
