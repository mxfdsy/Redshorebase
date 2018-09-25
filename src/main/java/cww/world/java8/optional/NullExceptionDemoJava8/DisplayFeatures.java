package cww.world.java8.optional.NullExceptionDemoJava8;

public class DisplayFeatures {

    private String size; // In inches
    private ScreenResolution resolution;

    public DisplayFeatures(String size, ScreenResolution resolution){
        this.size = size;
        this.resolution = resolution;
    }

    public String getSize() {
        return size;
    }
    public ScreenResolution getResolution() {
        return resolution;
    }

}