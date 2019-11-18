package com.yoppi.weaponspubg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static final String WEAPON_NAME = "weapon_name";
    public static final String WEAPON_DETAIL = "weapon_detail";
    public static final String WEAPON_IMAGE = "weapon_image";

    private String title = "Weapon Detail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.img_item_photo);
        TextView weaponName = findViewById(R.id.tv_item_name);
        TextView weaponDetail = findViewById(R.id.tv_item_description);

        String name = getIntent().getStringExtra(WEAPON_NAME);
        String detail = getIntent().getStringExtra(WEAPON_DETAIL);
        int image = getIntent().getIntExtra(WEAPON_IMAGE, 0);

        setActionBarTitle(title);
        imageView.setBackgroundResource(image);
        weaponName.setText(name);
        weaponDetail.setText(detail);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);

        }
    }
}
