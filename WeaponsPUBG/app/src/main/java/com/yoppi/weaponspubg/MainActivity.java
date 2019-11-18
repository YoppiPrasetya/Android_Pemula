package com.yoppi.weaponspubg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvWeapon;
    private ArrayList<Weapon> list = new ArrayList<>();

    private String title = "PUBG Weapon";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvWeapon = findViewById(R.id.rv_weapon);
        rvWeapon.setHasFixedSize(true);

        list.addAll(WeaponsData.getListData());
        setActionBarTitle(title);
        showRecyclerList();
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
            //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    private void showRecyclerList(){
        rvWeapon.setLayoutManager(new LinearLayoutManager(this));
        ListWeaponAdapter listWeaponAdapter = new ListWeaponAdapter(list);
        rvWeapon.setAdapter(listWeaponAdapter);

        listWeaponAdapter.setOnItemClickCallback(new ListWeaponAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Weapon data) {
                showSelectedHero(data);

            }
        });

    }

    private void showSelectedHero(Weapon weapon){
        Intent moveIntent = new Intent(MainActivity.this, DetailActivity.class);
        moveIntent.putExtra(DetailActivity.WEAPON_NAME, weapon.getName());
        moveIntent.putExtra(DetailActivity.WEAPON_DETAIL, weapon.getDescription());
        moveIntent.putExtra(DetailActivity.WEAPON_IMAGE, weapon.getPhoto());

        startActivity(moveIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menutopbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.about:

                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);

                break;
        }
    }
}
