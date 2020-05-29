package get.avatar.android.svg.methods;

import android.util.Pair;

import get.avatar.android.svg.Util;
import get.avatar.android.svg.Enums;

import static get.avatar.android.svg.methods.Colors.clothColor;

public class Clothes {

    public static String getClothSvg(Enums.Cloth cloth, Enums.ClothColor color, Enums.Graphic graphic) {
        switch (cloth) {
            case blazerShirt:
                return blazerShirt();
            case blazerSweater:
                return blazerSweater();
            case collarSweater:
                return collarSweater(color);
            case graphicShirt:
                return graphicShirt(color, graphic);
            case hoodie:
                return hoodie(color);
            case overall:
                return overall(color);
            case shirtCrewNeck:
                return shirtCrewNeck(color);
            case shirtScoopNeck:
                return shirtScoopNeck(color);
            case shirtVNeck:
                return shirtVNeck(color);
            default:
                return "";
        }
    }

    private static String blazerShirt() {
        return Util.getSvg("clothes/blazerShirt.svgx");
    }

    private static String blazerSweater() {
        return Util.getSvg("clothes/blazerSweater.svgx");
    }

    private static String collarSweater(Enums.ClothColor color) {
        return Util.getSvg("clothes/collarSweater.svgx",
                new Pair<String, String>("clothColor", clothColor(color, "collar_mask"))
        );
    }

    private static String graphicShirt(Enums.ClothColor color, Enums.Graphic g) {
        return Util.getSvg("clothes/graphicShirt.svgx",
                new Pair<String, String>("clothColor", clothColor(color, "shirt_mask")),
                new Pair<String, String>("graphic", graphic(g, "shirt_mask"))
        );
    }

    private static String hoodie(Enums.ClothColor color) {
        return Util.getSvg("clothes/hoodie.svgx",
                new Pair<String, String>("clothColor", clothColor(color, "hoodie_mask"))
        );
    }

    private static String overall(Enums.ClothColor color) {
        return Util.getSvg("clothes/overall.svgx",
                new Pair<String, String>("clothColor", clothColor(color, "overall_mask"))
        );
    }

    private static String shirtCrewNeck(Enums.ClothColor color) {
        return Util.getSvg("clothes/shirtCrewNeck.svgx",
                new Pair<String, String>("clothColor", clothColor(color, "crew_mask"))
        );
    }

    private static String shirtScoopNeck(Enums.ClothColor color) {
        return Util.getSvg("clothes/shirtScoopNeck.svgx",
                new Pair<String, String>("clothColor", clothColor(color, "scoop_mask"))
        );
    }

    private static String shirtVNeck(Enums.ClothColor color) {
        return Util.getSvg("clothes/shirtVNeck.svgx",
                new Pair<String, String>("clothColor", clothColor(color, "v_mask"))
        );
    }

    private static String graphic(Enums.Graphic graphic, String maskId) {
        switch (graphic) {
            case bat:
                return Util.getSvg("clothes/graphic/bat.svgx",
                        new Pair<String, String>("maskId", maskId)
                );
            case cumbia:
                return Util.getSvg("clothes/graphic/cumbia.svgx",
                        new Pair<String, String>("maskId", maskId)
                );
            case deer:
                return Util.getSvg("clothes/graphic/deer.svgx",
                        new Pair<String, String>("maskId", maskId)
                );
            case diamond:
                return Util.getSvg("clothes/graphic/diamond.svgx",
                        new Pair<String, String>("maskId", maskId)
                );
            case hola:
                return Util.getSvg("clothes/graphic/hola.svgx",
                        new Pair<String, String>("maskId", maskId)
                );
            case pizza:
                return Util.getSvg("clothes/graphic/pizza.svgx",
                        new Pair<String, String>("maskId", maskId)
                );
            case resist:
                return Util.getSvg("clothes/graphic/resist.svgx",
                        new Pair<String, String>("maskId", maskId)
                );
            case selena:
                return Util.getSvg("clothes/graphic/selena.svgx",
                        new Pair<String, String>("maskId", maskId)
                );
            case bear:
                return Util.getSvg("clothes/graphic/bear.svgx",
                        new Pair<String, String>("maskId", maskId)
                );
            case skullOutline:
                return Util.getSvg("clothes/graphic/skullOutline.svgx",
                        new Pair<String, String>("maskId", maskId)
                );
            case skull:
                return Util.getSvg("clothes/graphic/skull.svgx",
                        new Pair<String, String>("maskId", maskId)
                );
            default:
                return "";
        }
    }

}
