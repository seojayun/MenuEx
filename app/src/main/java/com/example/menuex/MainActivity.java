package com.example.menuex;
// 안그로이드 프로그래밍 7장

// 메뉴의 종류

// (1) 옵션메뉴    ... 세로로 되어있는것
// (2) 컨텍스트메뉴  해당 위젯을 꾹 눌렀다 떼면 나오는 메뉴

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    LinearLayout linear1;
    Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linear1 = (LinearLayout) findViewById(R.id.linear1);
        btn1 = (Button) findViewById(R.id.btn1);


    }
//    8. code  오버라이딩 메소드 에서 onCreateOptionsMenu 선택

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        super.onCreateOptionsMenu(menu);
//        10.super.onCreateOptionsMenu(menu); 부모의 메뉴를 쓴다.
        MenuInflater minfiater = getMenuInflater();
        minfiater.inflate(R.menu.menu1, menu);


//     9.   return true;  옵션 메뉴를 내 것으로 등록
        return true;
    }

    //    11. code 오버라이딩 메소드 에서 onOptionsItemSelected 선택
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        12.switch (item.getItemId()) 스위치 문을 이용한다.
        switch (item.getItemId()) {
            case R.id.itemRad:
                linear1.setBackgroundColor(Color.RED);
                break;
            case R.id.itemGreen:
                linear1.setBackgroundColor(Color.GREEN);
                break;
            case R.id.itemBlue:
                linear1.setBackgroundColor(Color.BLUE);
                break;
            case R.id.itemWhite:
                linear1.setBackgroundColor(Color.WHITE);
                break;
            case R.id.subRotate:
                btn1.setRotation(45);
                break;
            case R.id.subSize:
                btn1.setScaleX(2);
                btn1.setScaleY(2);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
