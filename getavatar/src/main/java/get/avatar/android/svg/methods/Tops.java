package get.avatar.android.svg.methods;

import android.util.Pair;

import get.avatar.android.svg.Util;
import get.avatar.android.svg.Enums;

import static get.avatar.android.svg.methods.Accessories.accessorySvg;
import static get.avatar.android.svg.methods.Colors.facialHairColor;
import static get.avatar.android.svg.methods.Colors.facialHairColorHex;
import static get.avatar.android.svg.methods.Colors.hairColor;
import static get.avatar.android.svg.methods.Colors.hairColorHex;
import static get.avatar.android.svg.methods.Colors.hatColor;
import static get.avatar.android.svg.methods.Colors.hatColorHex;

public class Tops {

    public static String topSVG(Enums.Top top, Enums.FacialHair fh, Enums.Accessories acc, Enums.HatColor hColor, Enums.FacialHairColor fhc, Enums.HairColor hairC) {
        switch (top) {
            case noHair:
                return Util.getSvg("tops/top/nohair.svgx",
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case eyePatch:
                return Util.getSvg("tops/top/eyepatch.svgx",
                        new Pair<String, String>("facialHair", facialHair(fh, fhc))
                );
            case hat:
                return Util.getSvg("tops/top/hat.svgx",
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case hijab:
                return Util.getSvg("tops/top/hijab.svgx",
                        new Pair<String, String>("hatColorHex", hatColorHex(hColor)),
                        new Pair<String, String>("hatColor", hatColor(hColor, "hijab_mask2")),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case turban:
                return Util.getSvg("tops/top/turban.svgx",
                        new Pair<String, String>("hatColorHex", hatColorHex(hColor)),
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("hatColor", hatColor(hColor, "turban_mask3")),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case winterHat1:
                return Util.getSvg("tops/top/winterhat1.svgx",
                        new Pair<String, String>("hatColorHex", hatColorHex(hColor)),
                        new Pair<String, String>("hatColor", hatColor(hColor, "hat_mask2")),
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case winterHat2:
                return Util.getSvg("tops/top/winterhat2.svgx",
                        new Pair<String, String>("hatColorHex", hatColorHex(hColor)),
                        new Pair<String, String>("hatColor", hatColor(hColor, "hat_mask2")),
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case winterHat3:
                return Util.getSvg("tops/top/winterhat3.svgx",
                        new Pair<String, String>("hatColorHex", hatColorHex(hColor)),
                        new Pair<String, String>("hatColor", hatColor(hColor, "hat_mask2")),
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case winterHat4:
                return Util.getSvg("tops/top/winterhat4.svgx",
                        new Pair<String, String>("hatColorHex", hatColorHex(hColor)),
                        new Pair<String, String>("hatColor", hatColor(hColor, "hat_mask2")),
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case longHairBigHair:
                return Util.getSvg("tops/top/longhairbighair.svgx",
                        new Pair<String, String>("hairColorHex", hairColorHex(hairC)),
                        new Pair<String, String>("hairColor", hairColor(hairC, "hair_mask3")),
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case longHairBob:
                return Util.getSvg("tops/top/longhairbob.svgx",
                        new Pair<String, String>("hairColorHex", hairColorHex(hairC)),
                        new Pair<String, String>("hairColor", hairColor(hairC, "bob_mask2")),
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case longHairBun:
                return Util.getSvg("tops/top/longhairbun.svgx",
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("hairColor", hairColor(hairC, "bun_mask1")),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case longHairCurly:
                return Util.getSvg("tops/top/longhaircurly.svgx",
                        new Pair<String, String>("hairColorHex", hairColorHex(hairC)),
                        new Pair<String, String>("hairColor", hairColor(hairC, "curly_mask2")),
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case longHairCurvy:
                return Util.getSvg("tops/top/longhaircurvy.svgx",
                        new Pair<String, String>("hairColorHex", hairColorHex(hairC)),
                        new Pair<String, String>("hairColor", hairColor(hairC, "curvy_mask2")),
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case longHairDreads:
                return Util.getSvg("tops/top/longhairdreads.svgx",
                        new Pair<String, String>("hairColorHex", hairColorHex(hairC)),
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("hairColor", hairColor(hairC, "dread_mask2")),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case longHairFrida:
                return Util.getSvg("tops/top/longhairfrida.svgx",
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case longHairFro:
                return Util.getSvg("tops/top/longhairfro.svgx",
                        new Pair<String, String>("hairColorHex", hairColorHex(hairC)),
                        new Pair<String, String>("hairColor", hairColor(hairC, "fro_mask2")),
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case longHairFroBand:
                return Util.getSvg("tops/top/longhairfroband.svgx",
                        new Pair<String, String>("hairColorHex", hairColorHex(hairC)),
                        new Pair<String, String>("hairColor", hairColor(hairC, "band_mask2")),
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case longHairNotTooLong:
                return Util.getSvg("tops/top/longhairnottoolong.svgx",
                        new Pair<String, String>("hairColorHex", hairColorHex(hairC)),
                        new Pair<String, String>("hairColor", hairColor(hairC, "long_mask2")),
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case longHairShavedSides:
                return Util.getSvg("tops/top/longhairshavedsides.svgx",
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case longHairMiaWallace:
                return Util.getSvg("tops/top/longhairmiawallace.svgx",
                        new Pair<String, String>("hairColorHex", hairColorHex(hairC)),
                        new Pair<String, String>("hairColor", hairColor(hairC, "wall_mask2")),
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case longHairStraight:
                return Util.getSvg("tops/top/longhairstraight.svgx",
                        new Pair<String, String>("hairColorHex", hairColorHex(hairC)),
                        new Pair<String, String>("hairColor", hairColor(hairC, "long_mask2")),
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case longHairStraight2:
                return Util.getSvg("tops/top/longhairstraight2.svgx",
                        new Pair<String, String>("hairColorHex", hairColorHex(hairC)),
                        new Pair<String, String>("hairColor", hairColor(hairC, "long_mask2")),
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case longHairStraightStrand:
                return Util.getSvg("tops/top/longhairstraightstrand.svgx",
                        new Pair<String, String>("hairColorHex", hairColorHex(hairC)),
                        new Pair<String, String>("hairColor", hairColor(hairC, "strand_mask2")),
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case shortHairDreads01:
                return Util.getSvg("tops/top/shorthairdreads01.svgx",
                        new Pair<String, String>("hairColorHex", hairColorHex(hairC)),
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("hairColor", hairColor(hairC, "1_mask_1")),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case shortHairDreads02:
                return Util.getSvg("tops/top/shorthairdreads02.svgx",
                        new Pair<String, String>("hairColorHex", hairColorHex(hairC)),
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("hairColor", hairColor(hairC, "short_mask1")),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case shortHairFrizzle:
                return Util.getSvg("tops/top/shorthairfrizzle.svgx",
                        new Pair<String, String>("hairColorHex", hairColorHex(hairC)),
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("hairColor", hairColor(hairC, "fizzle_mask1")),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case shortHairShaggyMullet:
                return Util.getSvg("tops/top/shorthairshaggymullet.svgx",
                        new Pair<String, String>("hairColorHex", hairColorHex(hairC)),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc)),
                        new Pair<String, String>("hairColor", hairColor(hairC, "mullet_mask2")),
                        new Pair<String, String>("facialHair", facialHair(fh, fhc))
                );
            case shortHairShortCurly:
                return Util.getSvg("tops/top/shorthairshortcurly.svgx",
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("hairColor", hairColor(hairC, "curly_mask1")),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case shortHairShortFlat:
                return Util.getSvg("tops/top/shorthairshortflat.svgx",
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("hairColor", hairColor(hairC, "flat_mask1")),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case shortHairShortRound:
                return Util.getSvg("tops/top/shorthairshortround.svgx",
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("hairColor", hairColor(hairC, "round_mask1")),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case shortHairShortWaved:
                return Util.getSvg("tops/top/shorthairshortwaved.svgx",
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("hairColor", hairColor(hairC, "waved_mask1")),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case shortHairSides:
                return Util.getSvg("tops/top/shorthairsides.svgx",
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("hairColor", hairColor(hairC, "side_mask1")),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case shortHairTheCaesar:
                return Util.getSvg("tops/top/shorthairthecaesar.svgx",
                        new Pair<String, String>("hairColorHex", hairColorHex(hairC)),
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("hairColor", hairColor(hairC, "caesar_mask2")),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            case shortHairTheCaesarSidePart:
                return Util.getSvg("tops/top/shorthairthecaesarsidepart.svgx",
                        new Pair<String, String>("facialHair", facialHair(fh, fhc)),
                        new Pair<String, String>("hairColor", hairColor(hairC, "caesar_mask2")),
                        new Pair<String, String>("accessorySvg", accessorySvg(acc))
                );
            default:
                return "";
        }
    }

    private static String facialHair(Enums.FacialHair hair, Enums.FacialHairColor color) {
        switch (hair) {
            case blank:
                return "";
            case beardMedium:
                return Util.getSvg("tops/facialhair/beardmedium.svgx");
            case beardLight:
                return Util.getSvg("tops/facialhair/beardlight.svgx",
                        new Pair<String, String>("facialHairColorHex", facialHairColorHex(color)),
                        new Pair<String, String>("facialHairColor", facialHairColor(color, "light_mask"))
                );
            case beardMajestic:
                return Util.getSvg("tops/facialhair/beardmagestic.svgx",
                        new Pair<String, String>("facialHairColorHex", facialHairColorHex(color)),
                        new Pair<String, String>("facialHairColor", facialHairColor(color, "magestic_mask"))
                );
            case moustacheFancy:
                return Util.getSvg("tops/facialhair/moustachefancy.svgx",
                        new Pair<String, String>("facialHairColor", facialHairColor(color, "fancy_mask"))
                );
            case moustacheMagnum:
                return Util.getSvg("tops/facialhair/moustachemagnum.svgx",
                        new Pair<String, String>("facialHairColor", facialHairColor(color, "magnum_mask"))
                );
            default:
                return "";
        }
    }

}
