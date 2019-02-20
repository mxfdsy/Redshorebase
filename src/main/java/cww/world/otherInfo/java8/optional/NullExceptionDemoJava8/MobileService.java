package cww.world.otherInfo.java8.optional.NullExceptionDemoJava8;

public class MobileService {


    public int getMobileScreenWidth(Mobile mobile) {

        if (mobile != null) {
            DisplayFeatures dfeatures = mobile.getDisplayFeatures();
            if (dfeatures != null) {
                ScreenResolution resolution = dfeatures.getResolution();
                if (resolution != null) {
                    return resolution.getWidth();
                }
            }
        }
        return 0;

    }

}
