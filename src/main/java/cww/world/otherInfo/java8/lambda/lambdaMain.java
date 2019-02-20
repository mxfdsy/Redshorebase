package cww.world.otherInfo.java8.lambda;

public class lambdaMain {
    public static void main(String[] args) {

        /**
         * 1 有一个person类
         * 2 有一个获得person对象的工厂接口
         * 3 想通过工厂获得一个Person对象
         * 4 需要先有一个实际的工厂对象
         */

        //函数接口 ：内部只有一个抽象方法

        //匿名内部类
        PersonFactory factory = new PersonFactory() {
            @Override
            public Person createPerson(String name, Integer age) {
                return new Person(name, age);
            }
        };

        System.out.println(factory.createPerson("xiaowu", 333));

        //lambda1
        PersonFactory factory1 = (name, age) -> new Person(name, age);
        factory1.createPerson("1", 99);
        //构造方法
        PersonFactory factory2 = Person::new;
        factory2.createPerson("xiaowu", 88);


        /**
         * 静态方法引用
         */

        ParseInterface p1 = new ParseInterface() {
            @Override
            public int parse(String str) {
                return Integer.parseInt(str);
            }
        };

        int parse = p1.parse("123");

        //lambda
        ParseInterface p2 = string -> Integer.parseInt(string);

        //静态方法引用
        ParseInterface p3 = Integer::parseInt;
        p3.parse("22");


    }
}
