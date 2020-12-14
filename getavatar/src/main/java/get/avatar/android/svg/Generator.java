package get.avatar.android.svg;

import android.content.Context;
import android.util.Pair;

import static get.avatar.android.svg.methods.Clothes.getClothSvg;
import static get.avatar.android.svg.methods.Colors.clothColorHex;
import static get.avatar.android.svg.methods.Colors.skinColorHex;
import static get.avatar.android.svg.methods.Colors.skinSvg;
import static get.avatar.android.svg.methods.Face.eyebrowSvg;
import static get.avatar.android.svg.methods.Face.eyesSvg;
import static get.avatar.android.svg.methods.Face.mouthSvg;
import static get.avatar.android.svg.methods.Face.noseSvg;
import static get.avatar.android.svg.methods.Tops.topSVG;

public class Generator {

    public Generator(Context appContext) {
        Util.setContext(appContext);
    }

    public String getSvg(Options options) {
        return Util.getSvg("main.svgx",
                new Pair<String, String>("customDefs", options.customDefs),
                new Pair<String, String>("styleSvg", styleSvg(options.style, options.backgroundFill)),
                new Pair<String, String>("skinColorHex", skinColorHex(options.skin)),
                new Pair<String, String>("skinSvg", skinSvg(options.skin, "mask-6")),
                new Pair<String, String>("getClothSvg", getClothSvg(options.clothes, options.clothColor, options.graphic)),
                new Pair<String, String>("faceSvg", faceSvg(options.mouth, options.eyes, options.eyebrow)),
                new Pair<String, String>("topSVG", topSVG(options.top, options.facialHair, options.accessories, options.hatColor, options.facialHairColor, options.hairColor))
                );
    }

    private String styleSvg(Enums.AvatarStyle avatarStyle, String backgroundFill) {
        switch (avatarStyle) {
            case circle:
                return Util.getSvg("style.svgx",
                        new Pair<String, String>("backgroundFill", backgroundFill));
            case custom:
                return backgroundFill;
            default:
                return "";
        }
    }

    private String faceSvg(Enums.Mouth mouth, Enums.Eyes eyes, Enums.Eyebrow eyeBrow) {
        return Util.getSvg("face.svgx",
                new Pair<String, String>("mouthSvg", mouthSvg(mouth)),
                new Pair<String, String>("noseSvg", noseSvg()),
                new Pair<String, String>("eyesSvg", eyesSvg(eyes)),
                new Pair<String, String>("eyebrowSvg", eyebrowSvg(eyeBrow))
        );
    }

    public static class Options {
        public String customDefs;
        public Enums.AvatarStyle style;
        public String backgroundFill;
        public Enums.Top top;
        public Enums.Accessories accessories;
        public Enums.HairColor hairColor;
        public Enums.FacialHair facialHair;
        public Enums.Cloth clothes;
        public Enums.ClothColor clothColor;
        public Enums.Eyes eyes;
        public Enums.Eyebrow eyebrow;
        public Enums.Mouth mouth;
        public Enums.Skin skin;
        public Enums.HatColor hatColor;
        public Enums.FacialHairColor facialHairColor;
        public Enums.Graphic graphic;

        public Options() {
            customDefs = "";
            style = Enums.AvatarStyle.circle;
            backgroundFill = clothColorHex(Enums.ClothColor.blue1);
            top = Enums.Top.shortHairFrizzle;
            accessories = Enums.Accessories.kurt;
            hairColor = Enums.HairColor.brownDark;
            facialHair = Enums.FacialHair.moustacheMagnum;
            clothes = Enums.Cloth.blazerShirt;
            clothColor = Enums.ClothColor.gray1;
            eyes = Enums.Eyes.wink;
            eyebrow = Enums.Eyebrow.angry;
            mouth = Enums.Mouth.serious;
            skin = Enums.Skin.light;
            hatColor = Enums.HatColor.black;
            facialHairColor = Enums.FacialHairColor.black;
            graphic = Enums.Graphic.skull;
        }
    }
}
