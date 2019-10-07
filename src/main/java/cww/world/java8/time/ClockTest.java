package cww.world.java8.time;

import java.math.BigDecimal;

public class ClockTest {
    public static void main(String[] args) {

//        Date date = new Date();
//        System.out.println(date.toLocaleString());
////        Date firstDay = org.apache.commons.lang3.time.DateUtils.truncate(date, 1);
////        System.out.println(firstDay.toLocaleString());
//
////        Date date1 = DateUtils.setMonths(date, -3);
//
//        System.out.println(date.toLocaleString());
//        Date truncate = DateUtils.truncate(date, Calendar.YEAR);
////        DateUtils.addYears()
//
////        Date truncate = DateUtils.truncate(date, Calendar);
//        System.out.println(truncate.toLocaleString());
        BigDecimal bigDecimal1 = new BigDecimal(13);
        BigDecimal bigDecimal3 = new BigDecimal(3);
        System.out.println(bigDecimal1.divide(bigDecimal3, 5, BigDecimal.ROUND_HALF_EVEN));
    }


}
