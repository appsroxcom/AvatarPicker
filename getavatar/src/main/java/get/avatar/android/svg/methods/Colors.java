package get.avatar.android.svg.methods;

import android.util.Pair;

import get.avatar.android.svg.Util;

import static get.avatar.android.svg.Enums.*;

public class Colors {

    private static String makeColor(String hex, String maskId) {
        return Util.getSvg("colors/makeColor.svgx",
                new Pair<String, String>("hex", hex),
                new Pair<String, String>("maskId", maskId)
        );
    }

    public static String facialHairColor(FacialHairColor color, String maskId) {
        return makeColor(facialHairColorHex(color), maskId);
    }

    public static String hairColor(HairColor color, String maskId) {
        return makeColor(hairColorHex(color), maskId);
    }

    public static String hatColor(HatColor color, String maskId) {
        return makeColor(hatColorHex(color), maskId);
    }

    public static String skinSvg(Skin skin, String maskId) {
        return makeColor(skinColorHex(skin), maskId);
    }

    public static String clothColor(ClothColor color, String maskId) {
        return makeColor(clothColorHex(color), maskId);
    }

// App wide Hex

    static String facialHairColorHex(FacialHairColor color) {
        switch (color) {
            case auburn:
                return "#A55728";
            case black:
                return "#2C1B18";
            case blonde:
                return "#B58143";
            case blondeGolden:
                return "#D6B370";
            case brown:
                return "#724133";
            case brownDark:
                return "#4A312C";
            case platinum:
                return "#ECDCBF";
            case red:
                return "#C93305";
            case pastelPink:
                return "#F59797";
            default:
                return "";
        }
    }

    static String hairColorHex(HairColor color) {
        switch (color) {
            case aurburn:
                return "#A55728";
            case black:
                return "#2C1B18";
            case blonde:
                return "#B58143";
            case blondeGolden:
                return "#D6B370";
            case brown:
                return "#724133";
            case brownDark:
                return "#4A312C";
            case pastelPink:
                return "#F59797";
            case platinum:
                return "#ECDCBF";
            case red:
                return "#C93305";
            case silverGray:
                return "#E8E1E1";
            default:
                return "";
        }
    }

    static String hatColorHex(HatColor color) {
        switch (color) {
            case black:
                return "#262E33";
            case blue01:
                return "#65C9FF";
            case blue02:
                return "#5199E4";
            case blue03:
                return "#25557C";
            case gray01:
                return "#E6E6E6";
            case gray02:
                return "#929598";
            case heather:
                return "#3C4F5C";
            case pastelblue:
                return "#B1E2FF";
            case pastelgreen:
                return "#A7FFC4";
            case pastelorange:
                return "#FFDEB5";
            case pastelred:
                return "#FFAFB9";
            case pastelyellow:
                return "#FFFFB1";
            case pink:
                return "#FF488E";
            case red:
                return "#FF5C5C";
            case white:
                return "#FFFFFF";
            default:
                return "";
        }
    }

    public static String skinColorHex(Skin skin) {
        switch (skin) {
            case tanned:
                return "#FD9841";
            case yellow:
                return "#F8D25C";
            case pale:
                return "#FFDBB4";
            case light:
                return "#EDB98A";
            case brown:
                return "#D08B5B";
            case darkBrown:
                return "#AE5D29";
            case black:
                return "#614335";
            default:
                return "";
        }
    }

    private static String clothColorHex(ClothColor color) {
        switch (color) {
            case black:
                return "#262E33";
            case blue1:
                return "#65C9FF";
            case blue2:
                return "#5199E4";
            case blue3:
                return "#25557C";
            case gray1:
                return "#E6E6E6";
            case gray2:
                return "#929598";
            case heather:
                return "#3C4F5C";
            case pastelBlue:
                return "#B1E2FF";
            case pastelGreen:
                return "#A7FFC4";
            case pastelOrange:
                return "#FFDEB5";
            case pastelRed:
                return "#FFAFB9";
            case pastelYellow:
                return "#FFFFB1";
            case pink:
                return "#FF488E";
            case red:
                return "#FF5C5C";
            case white:
                return "#FFFFFF";
            default:
                return "";
        }
    }

}
