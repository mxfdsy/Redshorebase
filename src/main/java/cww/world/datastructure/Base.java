package cww.world.datastructure;

public class Base {

    public Base() {
        callName();
    }

    private String baseName = "base";

    public void callName() {
        System.out.println(baseName);
    }

    static class Sub extends Base {
        public Sub() {
            callName();
        }

        private String baseName = "sub";
        public void callName(){
            System.out.println(baseName);
        }
    }

    public static void main(String[] args) {
        Base b = new Sub();
//        b.callName();

    }
}