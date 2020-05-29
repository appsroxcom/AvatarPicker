package get.avatar.android.svg.methods;

import get.avatar.android.svg.Util;
import get.avatar.android.svg.Enums;

public class Accessories {

    public static String accessorySvg(Enums.Accessories acc) {
        switch (acc) {
            case blank:
                return "";
            case kurt:
                return kurtSvg();
            case prescripiton01:
                return prescription01Svg();
            case prescripiton02:
                return prescription02();
            case round:
                return round();
            case sunglasses:
                return sunglasses();
            case wayfarers:
                return wayfarers();
            default:
                return "";
        }
    }

    private static String kurtSvg() {
        return Util.getSvg("accessories/kurt.svgx");
    }

    private static String prescription01Svg() {
        return Util.getSvg("accessories/prescription01.svgx");
    }

    private static String prescription02() {
        return Util.getSvg("accessories/prescription02.svgx");
    }

    private static String round() {
        return Util.getSvg("accessories/round.svgx");
    }

    private static String sunglasses() {
        return Util.getSvg("accessories/sunglasses.svgx");
    }

    private static String wayfarers() {
        return Util.getSvg("accessories/wayfarers.svgx");
    }

}
