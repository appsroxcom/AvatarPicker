package get.avatar.android;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import get.avatar.android.svg.Enums;
import get.avatar.android.svg.Generator;

import static get.avatar.android.AvatarUtil.AVATAR_SCHEME;

public class AvatarDialog extends DialogFragment implements AdapterView.OnItemSelectedListener {

    private ImageView avatar;
    private ProgressBar progress;
    private Spinner topTypeSpinner, accessoriesTypeSpinner, hatColorSpinner, hairColorSpinner, facialHairTypeSpinner, facialHairColorSpinner, clotheTypeSpinner, clotheColorSpinner, clotheGraphicSpinner, eyeTypeSpinner, eyebrowTypeSpinner, mouthTypeSpinner, skinColorSpinner;
    private boolean isReady;

    private String avatarUri;
    private Bitmap avatarBitmap;
    private String avatarStyle, topType, accessoriesType, hatColor, hairColor, facialHairType, facialHairColor, clotheType, clotheColor, clotheGraphic, eyeType, eyebrowType, mouthType, skinColor;

    /**
     * Avatar dialog listener
     */
    public interface AvatarDialogListener {
        void onAvatarUpdate(String avatarUri, Bitmap avatarBitmap);
    }

    public AvatarDialog() {
        // Empty constructor is required for DialogFragment
    }

    public static AvatarDialog newInstance(String avatarUri) {
        AvatarDialog frag = new AvatarDialog();
        Bundle args = new Bundle();
        args.putString("avatarUri", avatarUri);
        frag.setArguments(args);
        return frag;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        avatarUri = getArguments().getString("avatarUri");
        initValues();

        View view = getActivity().getLayoutInflater().inflate(R.layout.dialog_avatar, null);
        avatar =  view.findViewById(R.id.avatar);
        progress =  view.findViewById(R.id.progress);
        topTypeSpinner = view.findViewById(R.id.top_type_spinner);
        accessoriesTypeSpinner = view.findViewById(R.id.accessories_type_spinner);
        hatColorSpinner = view.findViewById(R.id.hat_color_spinner);
        hairColorSpinner = view.findViewById(R.id.hair_color_spinner);
        facialHairTypeSpinner = view.findViewById(R.id.facial_hair_type_spinner);
        facialHairColorSpinner = view.findViewById(R.id.facial_hair_color_spinner);
        clotheTypeSpinner = view.findViewById(R.id.clothe_type_spinner);
        clotheColorSpinner = view.findViewById(R.id.clothe_color_spinner);
        clotheGraphicSpinner = view.findViewById(R.id.clothe_graphic_spinner);
        eyeTypeSpinner = view.findViewById(R.id.eye_type_spinner);
        eyebrowTypeSpinner = view.findViewById(R.id.eyebrow_type_spinner);
        mouthTypeSpinner = view.findViewById(R.id.mouth_type_spinner);
        skinColorSpinner = view.findViewById(R.id.skin_color_spinner);

        initSpinners();

        topTypeSpinner.setOnItemSelectedListener(this);
        accessoriesTypeSpinner.setOnItemSelectedListener(this);
        hatColorSpinner.setOnItemSelectedListener(this);
        hairColorSpinner.setOnItemSelectedListener(this);
        facialHairTypeSpinner.setOnItemSelectedListener(this);
        facialHairColorSpinner.setOnItemSelectedListener(this);
        clotheTypeSpinner.setOnItemSelectedListener(this);
        clotheColorSpinner.setOnItemSelectedListener(this);
        clotheGraphicSpinner.setOnItemSelectedListener(this);
        eyeTypeSpinner.setOnItemSelectedListener(this);
        eyebrowTypeSpinner.setOnItemSelectedListener(this);
        mouthTypeSpinner.setOnItemSelectedListener(this);
        skinColorSpinner.setOnItemSelectedListener(this);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                isReady = true;
                progress.setVisibility(View.GONE);
                renderAvatar();
            }
        }, 1000);

        Dialog dialog = new AlertDialog.Builder(getActivity())
                .setView(view)
                .setPositiveButton(android.R.string.ok,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                if (getActivity() instanceof AvatarDialogListener) {
                                    ((AvatarDialogListener) getActivity()).onAvatarUpdate(getAvatarUri(), avatarBitmap);
                                }
                            }
                        }
                )
                .setNegativeButton(android.R.string.cancel,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }
                )
                .create();
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        return dialog;
    }

    private void initValues() {
        Generator.Options options = AvatarUtil.getOptions(avatarUri);
        avatarStyle = options.style.name();
        topType = options.top.name();
        accessoriesType = options.accessories.name();
        hatColor = options.hatColor.name();
        hairColor = options.hairColor.name();
        facialHairType = options.facialHair.name();
        facialHairColor = options.facialHairColor.name();
        clotheType = options.clothes.name();
        clotheColor = options.clothColor.name();
        clotheGraphic = options.graphic.name();
        eyeType = options.eyes.name();
        eyebrowType = options.eyebrow.name();
        mouthType = options.mouth.name();
        skinColor = options.skin.name();
    }

    private void initSpinners() {
        initSpinner(topTypeSpinner, topType, getStringArray(Enums.Top.values()));
        initSpinner(accessoriesTypeSpinner, accessoriesType, getStringArray(Enums.Accessories.values()));
        initSpinner(hatColorSpinner, hatColor, getStringArray(Enums.HatColor.values()));
        initSpinner(hairColorSpinner, hairColor, getStringArray(Enums.HairColor.values()));
        initSpinner(facialHairTypeSpinner, facialHairType, getStringArray(Enums.FacialHair.values()));
        initSpinner(facialHairColorSpinner, facialHairColor, getStringArray(Enums.FacialHairColor.values()));
        initSpinner(clotheTypeSpinner, clotheType, getStringArray(Enums.Cloth.values()));
        initSpinner(clotheColorSpinner, clotheColor, getStringArray(Enums.ClothColor.values()));
        initSpinner(clotheGraphicSpinner, clotheGraphic, getStringArray(Enums.Graphic.values()));
        initSpinner(eyeTypeSpinner, eyeType, getStringArray(Enums.Eyes.values()));
        initSpinner(eyebrowTypeSpinner, eyebrowType, getStringArray(Enums.Eyebrow.values()));
        initSpinner(mouthTypeSpinner, mouthType, getStringArray(Enums.Mouth.values()));
        initSpinner(skinColorSpinner, skinColor, getStringArray(Enums.Skin.values()));
    }

    private void initSpinner(Spinner spinner, String value, String[] values) {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, values);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        for (int i=0; i<values.length; i++) {
            if (values[i].equals(value)) {
                spinner.setSelection(i);
                break;
            }
        }
    }

    private String[] getStringArray(Enum<?>[] enums) {
        String[] array = new String[enums.length];
        for (int i=0; i<enums.length; i++) {
            array[i] = enums[i].name();
        }
        return array;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getSelectedItem().toString();
        int viewId = parent.getId();

        if (viewId == R.id.top_type_spinner) topType = item;
        else if (viewId == R.id.accessories_type_spinner) accessoriesType = item;
        else if (viewId == R.id.hat_color_spinner) hatColor = item;
        else if (viewId == R.id.hair_color_spinner) hairColor = item;
        else if (viewId == R.id.facial_hair_type_spinner) facialHairType = item;
        else if (viewId == R.id.facial_hair_color_spinner) facialHairColor = item;
        else if (viewId == R.id.clothe_type_spinner) clotheType = item;
        else if (viewId == R.id.clothe_color_spinner) clotheColor = item;
        else if (viewId == R.id.clothe_graphic_spinner) clotheGraphic = item;
        else if (viewId == R.id.eye_type_spinner) eyeType = item;
        else if (viewId == R.id.eyebrow_type_spinner) eyebrowType = item;
        else if (viewId == R.id.mouth_type_spinner) mouthType = item;
        else if (viewId == R.id.skin_color_spinner) skinColor = item;

        if (isReady) renderAvatar();
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // TODO Auto-generated method stub
    }

    private void refreshTable() {
        refreshRow(clotheColorSpinner, clotheType.startsWith("blazer") ? View.GONE : View.VISIBLE);
        refreshRow(clotheGraphicSpinner, clotheType.startsWith("graphic") ? View.VISIBLE : View.GONE);
        refreshRow(facialHairColorSpinner, facialHairType.equals("blank") || topType.equals("hijab") ? View.GONE : View.VISIBLE);
        refreshRow(accessoriesTypeSpinner, topType.equals("eyepatch") ? View.GONE : View.VISIBLE);
        refreshRow(hairColorSpinner, topType.contains("hair") && !topType.equals("nohair") ? View.VISIBLE : View.GONE);
        refreshRow(hatColorSpinner, (topType.contains("hat") && !topType.equals("hat")) || topType.equals("hijab") || topType.equals("turban") ? View.VISIBLE : View.GONE);
    }

    private void refreshRow(View spinner, int visibility) {
        ((View)spinner.getParent()).setVisibility(visibility);
    }

    private void renderAvatar() {
        refreshTable();

        Bitmap newBM = AvatarUtil.getAvatarBitmap(getContext(), getAvatarUri(), Color.TRANSPARENT);
        avatar.setImageBitmap(newBM);
        if (avatarBitmap != null && !avatarBitmap.isRecycled()) {
            avatarBitmap.recycle();
        }
        avatarBitmap = newBM;
    }

    private String getAvatarUri() {
        StringBuilder sb = new StringBuilder(String.format("%s://svg?avatarStyle=%s", AVATAR_SCHEME, !TextUtils.isEmpty(avatarStyle) ? avatarStyle : Enums.AvatarStyle.circle.name()));
        if (!TextUtils.isEmpty(topType)) sb.append("&topType=").append(topType);
        if (!TextUtils.isEmpty(accessoriesType)) sb.append("&accessoriesType=").append(accessoriesType);
        if (!TextUtils.isEmpty(hatColor)) sb.append("&hatColor=").append(hatColor);
        if (!TextUtils.isEmpty(hairColor)) sb.append("&hairColor=").append(hairColor);
        if (!TextUtils.isEmpty(facialHairType)) sb.append("&facialHairType=").append(facialHairType);
        if (!TextUtils.isEmpty(facialHairColor)) sb.append("&facialHairColor=").append(facialHairColor);
        if (!TextUtils.isEmpty(clotheType)) sb.append("&clotheType=").append(clotheType);
        if (!TextUtils.isEmpty(clotheColor)) sb.append("&clotheColor=").append(clotheColor);
        if (!TextUtils.isEmpty(clotheGraphic)) sb.append("&graphicType=").append(clotheGraphic);
        if (!TextUtils.isEmpty(eyeType)) sb.append("&eyeType=").append(eyeType);
        if (!TextUtils.isEmpty(eyebrowType)) sb.append("&eyebrowType=").append(eyebrowType);
        if (!TextUtils.isEmpty(mouthType)) sb.append("&mouthType=").append(mouthType);
        if (!TextUtils.isEmpty(skinColor)) sb.append("&skinColor=").append(skinColor);
        return sb.toString();
    }

}