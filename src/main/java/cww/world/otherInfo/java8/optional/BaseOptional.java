package cww.world.otherInfo.java8.optional;

import java.util.Optional;

public class BaseOptional {
    public static void main(String[] args) {
        Optional<String> gender = Optional.of("MALE");
        String answer1 = "Yes";
        String answer2 = null;

        System.out.println("开始输出--------------------------------");
        System.out.println("Non-Empty Optional:" + gender);
        System.out.println("Non-Empty Optional:" + gender.get());


        System.out.println("Optional.ofNullable() -------------可以为空--------");
        System.out.println(Optional.ofNullable(answer1));
        System.out.println(Optional.ofNullable(answer2));

        System.out.println("OOptional.of(answer2) -----如果是空值就直接报错----------------");
        System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));

    }
}
