package get.avatar.android.svg;

import android.content.Context;
import android.util.Log;
import android.util.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Util {

    private static Context context;

    public static void setContext(Context context) {
        Util.context = context;
    }

    public static String loadAssetTextAsString(Context context, String name) {
        BufferedReader in = null;
        try {
            StringBuilder buf = new StringBuilder();
            InputStream is = context.getAssets().open(name);
            in = new BufferedReader(new InputStreamReader(is));

            String str;
            boolean isFirst = true;
            while ( (str = in.readLine()) != null ) {
                if (isFirst)
                    isFirst = false;
                else
                    buf.append('\n');
                buf.append(str);
            }
            return buf.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {}
            }
        }

        return null;
    }

    public static String getSvg(String path, Pair<String, String>... values) {
        String svgx = loadAssetTextAsString(context, path);
        if (values != null) {
            for (Pair<String, String> value : values) {
                svgx = svgx.replace(String.format("{{%s}}", value.first), value.second);
            }
        }
        return svgx;
    }

    public static void largeLog(String tag, String content) {
        if (content.length() > 4000) {
            Log.e(tag, content.substring(0, 4000));
            largeLog(tag, content.substring(4000));
        } else {
            Log.e(tag, content);
        }
    }

}
