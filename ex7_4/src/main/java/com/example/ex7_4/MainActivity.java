package com.example.ex7_4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1=(ImageView)findViewById(R.id.img1);


    }


    ImageView img1;
    static  final int ITEM_IMG=1,ITEM_DOG=2,ITEM_DOR=3;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0,ITEM_IMG,0,"그림");
        menu.add(0,ITEM_DOG,0,"등대");
        menu.add(0,ITEM_DOR,0,"숲");
       return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case ITEM_IMG:
                img1.setImageResource(R.drawable.pic1);
                break;
            case ITEM_DOG:
                img1.setImageResource(R.drawable.pic2);
            case  ITEM_DOR:
                img1.setImageResource(R.drawable.seo);
        }

        return super.onOptionsItemSelected(item);
    }


}
