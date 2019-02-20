package cww.world.otherInfo.java8.optional;

import java.math.BigDecimal;
import java.util.Optional;

public class OrElse {
    public static void main(String[] args) {


        System.out.println("--------------也是如果存在就干什么 这个可以指定干什么-------------------");
        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();

        System.out.println(gender.orElse("<N/A>")); //MALE
        System.out.println(emptyGender.orElse("<N/A>")); //<N/A>

        System.out.println(gender.orElse("<N/A>")); //MALE
        System.out.println(emptyGender.orElse("<N/A>")); //<N/A>

        System.out.println(Optional.ofNullable(null).orElse(new BigDecimal(0)));

    }
}
