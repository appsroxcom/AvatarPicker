package com.appsrox.avatarpicker;

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
        AvatarDialog avatarDialog = AvatarDialog.newInstance(avatarUri);
        avatarDialog.show(getSupportFragmentManager(), "fragment_avatar");
    }

    @Override
    public void onAvatarUpdate(String avatarUri, Bitmap avatarBitmap) {
        this.avatarUri = avatarUri;
        avatar.setImageBitmap(avatarBitmap);
    }
}
