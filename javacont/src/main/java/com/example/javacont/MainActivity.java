package com.example.javacont;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout linear1;
    Button btn1,btn2;
    static final int itemR=1,itemG=2,itemB=3,itemW=4;
    static final int item1=5,item2=6, item3=7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linear1=(LinearLayout)findViewById(R.id.linear1);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);



        registerForContextMenu(btn1);
        registerForContextMenu(btn2);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater minflater = getMenuInflater();
        if(v==btn1) {
          menu.add(0,itemR,0,"배경색(빨강)");
            menu.add(0,itemG,0,"배경색(초록)");
            menu.add(0,itemB,0,"배경색(파랑)");
            menu.add(0,itemW,0,"배경색(흰색)");

        }else if(v==btn2) {
            menu.add(0,item1,0,"45도회전");
            menu.add(0,item2,0,"버튼2배확대");
            menu.add(0,item3,0,"버튼원래대로");
        }


    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case itemR:
                linear1.setBackgroundColor(Color.RED);
            break;
            case itemG:
                linear1.setBackgroundColor(Color.GREEN);
                break;
            case itemB:
                linear1.setBackgroundColor(Color.BLUE);
                break;
            case itemW:
                linear1.setBackgroundColor(Color.WHITE);
                break;
            case item1:
                btn2.setRotation(45);
                break;
            case item2:
                btn2.setScaleX(2);
                btn2.setScaleY(2);
                break;
            case item3:
                btn2.setRotation(0);
                btn2.setScaleX(1);
                btn2.setScaleY(1);
                break;
        }

        return super.onContextItemSelected(item);
    }
}
