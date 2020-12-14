package com.appsrox.getavataaars;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import get.avatar.android.AvatarDialog;

public class MainActivity extends AppCompatActivity implements AvatarDialog.AvatarDialogListener {

    private ImageButton avatar;
    private String avatarUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        avatar = findViewById(R.id.avatar);
    }

    public void showAvatarPicker(View view) {
        //custom background color
        /*String backgroundFill = "red";*/

        //custom background pattern
        /*String customDefs = "<pattern id=\"Triangle\" width=\"10\" height=\"10\" patternUnits=\"userSpaceOnUse\"><polygon points=\"5,0 10,10 0,10\"/></pattern>";
        String backgroundFill = "<g id=\"Circle\" stroke-width=\"1\" fill-rule=\"evenodd\" transform=\"translate(12.000000, 40.000000)\"><mask id=\"mask-2\" fill=\"white\"><use href=\"#path-1\"/></mask><use id=\"Circle-Background\" fill=\"#E6E6E6\" href=\"#path-1\"/><g id=\"Color/Palette/Blue-01\" mask=\"url(#mask-2)\" fill=\"url(#Triangle)\"><rect id=\"pen-Color\" x=\"0\" y=\"0\" width=\"240\" height=\"240\"/></g></g>";*/

        AvatarDialog avatarDialog = AvatarDialog.newInstance(avatarUri/*, backgroundFill, customDefs*/);
        avatarDialog.show(getSupportFragmentManager(), "dialog_avatar");
    }

    @Override
    public void onAvatarUpdate(String avatarUri, Bitmap avatarBitmap) {
        this.avatarUri = avatarUri;
        avatar.setImageBitmap(avatarBitmap);
    }
}
