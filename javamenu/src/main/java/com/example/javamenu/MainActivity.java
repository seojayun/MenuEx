package com.example.javamenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


//   1. 자바로만 메뉴 코딩합니다.
    LinearLayout layout1;
    Button btn1;
    static final int ITEM_RED=1, ITEM_GREEN=2, ITEM_BLUE=3, ITEM_WHITE=4;
    static final int SUB_ROTATE=5, SUB_SIZE=6;
// 2. 이 static final int는  각 메뉴의 버튼의 가독성을 위해 상수 지정 후 배치

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout1=(LinearLayout)findViewById(R.id.linear1);
        btn1=(Button)findViewById(R.id.btn1);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        super.onCreateOptionsMenu(menu);
        menu.add(0,ITEM_RED,0,"배경색(빨강)");
        menu.add(0,ITEM_GREEN,0,"배경색(초록)");
        menu.add(0,ITEM_BLUE,0,"배경색(파랑)");
        menu.add(0,ITEM_WHITE,0,"배경색(기본)");

        SubMenu sMenu =menu.addSubMenu("버튼변경 >>");
        sMenu.add(0,SUB_ROTATE,0,"버튼45도 회전");
        sMenu.add(0,SUB_SIZE,0,"버튼2배 확대");


//                      3.      ▲id 입력부분에 구분을 지어서 관리하기 편하게 만들 수 있다.
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case ITEM_RED:
                // 3. ▲id 입력부분에 구분을 지어서 관리하기 편하게 만들 수 있다.
                layout1.setBackgroundColor(Color.RED);
                break;
            case ITEM_GREEN:
                layout1.setBackgroundColor(Color.GREEN);
                break;
            case ITEM_BLUE:
                layout1.setBackgroundColor(Color.BLUE);
                break;
            case ITEM_WHITE:
                layout1.setBackgroundColor(Color.WHITE);
                break;
            case SUB_ROTATE:
                btn1.setRotation(45);
                break;
            case SUB_SIZE:
                btn1.setScaleX(2);
                btn1.setScaleY(2);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
