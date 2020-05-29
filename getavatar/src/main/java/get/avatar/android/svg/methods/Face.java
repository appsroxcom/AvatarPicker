package get.avatar.android.svg.methods;

import get.avatar.android.svg.Util;

import static get.avatar.android.svg.Enums.*;

public class Face {

    public static String noseSvg() {
        return Util.getSvg("face/nose.svgx");
    }

    public static String eyesSvg(Eyes eye) {
        switch (eye) {
            case close:
                return Util.getSvg("face/eyes/close.svgx");
            case cry:
                return Util.getSvg("face/eyes/cry.svgx");
            case none:
                return Util.getSvg("face/eyes/none.svgx");
            case dizzy:
                return Util.getSvg("face/eyes/dizzy.svgx");
            case eyeRoll:
                return Util.getSvg("face/eyes/eyeRoll.svgx");
            case happy:
                return Util.getSvg("face/eyes/happy.svgx");
            case hearts:
                return Util.getSvg("face/eyes/hearts.svgx");
            case side:
                return Util.getSvg("face/eyes/side.svgx");
            case squint:
                return Util.getSvg("face/eyes/squint.svgx");
            case surprised:
                return Util.getSvg("face/eyes/surprised.svgx");
            case wink:
                return Util.getSvg("face/eyes/wink.svgx");
            case winkWacky:
                return Util.getSvg("face/eyes/winkWacky.svgx");
            default:
                return "";
        }
    }

    public static String eyebrowSvg(Eyebrow brow) {
        switch (brow) {
            case angry:
                return Util.getSvg("face/eyebrow/angry.svgx");
            case angryNatural:
                return Util.getSvg("face/eyebrow/angryNatural.svgx");
            case none:
                return Util.getSvg("face/eyebrow/none.svgx");
            case defaultNatural:
                return Util.getSvg("face/eyebrow/defaultNatural.svgx");
            case flatNatural:
                return Util.getSvg("face/eyebrow/flatNatural.svgx");
            case raisedExcited:
                return Util.getSvg("face/eyebrow/raisedExcited.svgx");
            case raisedExcitedNatural:
                return Util.getSvg("face/eyebrow/raisedExcitedNatural.svgx");
            case sadConcerned:
                return Util.getSvg("face/eyebrow/sadConcerned.svgx");
            case sadConcernedNatural:
                return Util.getSvg("face/eyebrow/sadConcernedNatural.svgx");
            case uniBrowNatural:
                return Util.getSvg("face/eyebrow/uniBrowNatural.svgx");
            case upDown:
                return Util.getSvg("face/eyebrow/upDown.svgx");
            case upDownNatural:
                return Util.getSvg("face/eyebrow/upDownNatural.svgx");
            default:
                return "";
        }
    }

    public static String mouthSvg(Mouth mouth) {
        switch (mouth) {
            case concerned:
                return Util.getSvg("face/mouth/concerned.svgx");
            case none:
                return Util.getSvg("face/mouth/none.svgx");
            case disbelief:
                return Util.getSvg("face/mouth/disbelief.svgx");
            case eating:
                return Util.getSvg("face/mouth/eating.svgx");
            case grimace:
                return Util.getSvg("face/mouth/grimace.svgx");
            case sad:
                return Util.getSvg("face/mouth/sad.svgx");
            case screamOpen:
                return Util.getSvg("face/mouth/screamOpen.svgx");
            case serious:
                return Util.getSvg("face/mouth/serious.svgx");
            case smile:
                return Util.getSvg("face/mouth/smile.svgx");
            case tongue:
                return Util.getSvg("face/mouth/tongue.svgx");
            case twinkle:
                return Util.getSvg("face/mouth/twinkle.svgx");
            case vomit:
                return Util.getSvg("face/mouth/vomit.svgx");
            default:
                return "";
        }
    }

}
