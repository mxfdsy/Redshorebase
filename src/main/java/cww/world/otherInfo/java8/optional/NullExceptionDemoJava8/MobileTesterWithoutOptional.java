package cww.world.otherInfo.java8.optional.NullExceptionDemoJava8;

public class MobileTesterWithoutOptional {
    public static void main(String[] args) {

        ScreenResolution resolution = new ScreenResolution(750, 1334);
        DisplayFeatures dfeatures = new DisplayFeatures("4.7", resolution);
        Mobile mobile = new Mobile(2015001, "Apple", "iPhone 6s", dfeatures);


        System.out.println("----------有了java8 我们可以这样写------getMobileScreenWidth（）------如下注释部分---------");

//        public Integer getMobileScreenWidth(Optional<Mobile> mobile){
//            return mobile.flatMap(Mobile::getDisplayFeatures)
//                    .flatMap(DisplayFeatures::getResolution)
//                    .map(ScreenResolution::getWidth)
//                    .orElse(0);
//
//        }
        MobileService mService = new MobileService();
        int mobileWidth = mService.getMobileScreenWidth(mobile);
        System.out.println("Apple iPhone 6s Screen Width = " + mobileWidth);


    }
}
