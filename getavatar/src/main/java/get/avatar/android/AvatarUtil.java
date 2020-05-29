package get.avatar.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.TextUtils;

import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParseException;

import get.avatar.android.svg.Enums;
import get.avatar.android.svg.Generator;

public class AvatarUtil {

    public static final String AVATAR_SCHEME = "getavataaars";

    /**
     * Get avatar bitmap
     * @param appContext
     * @param avatarUri
     * @param backgroundColor
     * @return bitmap
     */
    public static Bitmap getAvatarBitmap(Context appContext, String avatarUri, int backgroundColor) {
        if (appContext == null || TextUtils.isEmpty(avatarUri)) return null;
        try {
            Generator generator = new Generator(appContext);
            String xml = generator.getSvg(getOptions(avatarUri));
            SVG svg = SVG.getFromString(xml);
            Bitmap newBM = Bitmap.createBitmap(264, 280, Bitmap.Config.ARGB_8888);
            Canvas bmcanvas = new Canvas(newBM);
            bmcanvas.drawColor(backgroundColor);
            svg.renderToCanvas(bmcanvas);
            return newBM;
        } catch (SVGParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Get avatar svg
     * @param appContext
     * @param avatarUri
     * @return
     */
    public static String getAvatarXml(Context appContext, String avatarUri) {
        if (appContext == null || TextUtils.isEmpty(avatarUri)) return null;
        Generator generator = new Generator(appContext);
        return generator.getSvg(getOptions(avatarUri));
    }

    /**
     * Get options
     * @param avatarUri
     * @return
     */
    public static Generator.Options getOptions(String avatarUri) {
        Generator.Options options = new Generator.Options();
        if (TextUtils.isEmpty(avatarUri)) return options;

        Uri uri = Uri.parse(avatarUri);
        if (!AVATAR_SCHEME.equals(uri.getScheme())) return options;

        for (String param : uri.getQueryParameterNames()) {
            String value = uri.getQueryParameter(param);
            switch(param) {
                case "avatarStyle": options.style = Enums.AvatarStyle.valueOf(value);break;
                case "topType": options.top = Enums.Top.valueOf(value);break;
                case "accessoriesType": options.accessories = Enums.Accessories.valueOf(value);break;
                case "hatColor": options.hatColor = Enums.HatColor.valueOf(value);break;
                case "hairColor": options.hairColor = Enums.HairColor.valueOf(value);break;
                case "facialHairType": options.facialHair = Enums.FacialHair.valueOf(value);break;
                case "facialHairColor": options.facialHairColor = Enums.FacialHairColor.valueOf(value);break;
                case "clotheType": options.clothes = Enums.Cloth.valueOf(value);break;
                case "clotheColor": options.clothColor = Enums.ClothColor.valueOf(value);break;
                case "graphicType": options.graphic = Enums.Graphic.valueOf(value);break;
                case "eyeType": options.eyes = Enums.Eyes.valueOf(value);break;
                case "eyebrowType": options.eyebrow = Enums.Eyebrow.valueOf(value);break;
                case "mouthType": options.mouth = Enums.Mouth.valueOf(value);break;
                case "skinColor": options.skin = Enums.Skin.valueOf(value);break;
            }
        }
        return options;
    }

}
