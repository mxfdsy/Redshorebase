package cww;

import java.util.HashMap;
import java.util.Map;

public enum FloorLevelEnum {

    /**
     * 负三楼
     */
    LEVELB3("B3", "负三楼"),

    /**
     * 负二楼
     */
    LEVELB2("B2", "负二楼"),

    /**
     * 负一楼
     */
    LEVELB1("B1", "负一楼"),

    /**
     * 一楼
     */
    LEVEL1("F1", "一楼"),

    /**
     * 二楼
     */
    LEVEL2("F2", "二楼"),

    /**
     * 三楼
     */
    LEVEL3("F3", "三楼"),

    /**
     * 四楼
     */
    LEVEL4("F4", "四楼"),

    /**
     * 五楼
     */
    LEVEL5("F5", "五楼"),

    /**
     * 六楼
     */
    LEVEL6("F6", "六楼"),

    /**
     * 七楼
     */
    LEVEL7("F7", "七楼"),

    /**
     * 八楼
     */
    LEVEL8("F8", "八楼"),

    /**
     * 九楼
     */
    LEVEL9("F9", "九楼"),

    /**
     * 十楼
     */
    LEVEL10("F10", "十楼"),

    /**
     * 十一楼
     */
    LEVEL11("F10", "十一楼"),

    /**
     * 十二楼
     */
    LEVEL12("F11", "十二楼"),

    /**
     * 十三楼
     */
    LEVEL13("F13", "十三楼"),

    /**
     * 十四楼
     */
    LEVEL14("F14", "十四楼"),

    /**
     * 十五楼
     */
    LEVEL15("F15", "十五楼"),

    /**
     * 十六楼
     */
    LEVEL16("F16", "十六楼"),

    /**
     * 十七楼
     */
    LEVEL17("F17", "十七楼"),

    /**
     * 十八楼
     */
    LEVEL18("F18", "十八楼"),

    /**
     * 十九楼
     */
    LEVEL19("F19", "十九楼"),

    /**
     * 二十楼
     */
    LEVEL20("F20", "二十楼"),

    /**
     * 二十一楼
     */
    LEVEL21("F21", "二十一楼"),

    /**
     * 二十二楼
     */
    LEVEL22("F22", "二十二楼"),

    /**
     * 二十三楼
     */
    LEVEL23("F23", "二十三楼"),

    /**
     * 二十四楼
     */
    LEVEL24("F24", "二十四楼"),

    /**
     * 二十五楼
     */
    LEVEL25("F25", "二十五楼"),

    /**
     * 二十六楼
     */
    LEVEL26("F26", "二十六楼"),

    /**
     * 二十七楼
     */
    LEVEL27("F27", "二十七楼"),

    /**
     * 二十八楼
     */
    LEVEL28("F28", "二十八楼"),

    /**
     * 二十九楼
     */
    LEVEL29("F29", "二十九楼"),

    /**
     * 三十楼
     */
    LEVEL30("F30", "三十楼"),

    /**
     * 未知
     */
    UNKNOWN("", "未知");

    private String levelStr;
    private String levelF;

    private static final Map<String, FloorLevelEnum> VALUES = new HashMap<String, FloorLevelEnum>();

    static {
        for (FloorLevelEnum floor : FloorLevelEnum.values()) {
            VALUES.put(floor.levelF, floor);
        }
    }

    public static FloorLevelEnum getLevelStr(String levelF) {
        FloorLevelEnum floor = VALUES.get(levelF);
        if (floor != null) {
            return floor;
        }
        return UNKNOWN;
    }

    private FloorLevelEnum(String levelF, String levelStr) {
        this.levelF = levelF;
        this.levelStr = levelStr;
    }

    public String getLevelStr() {
        return levelStr;
    }

    public String getLevelF() {
        return levelF;
    }
}
