package com.example.contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout linear1;
    Button btnBackground,btnMyChange;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linear1=(LinearLayout)findViewById(R.id.linear1);
        btnBackground=(Button)findViewById(R.id.btnBackground);
        btnMyChange=(Button)findViewById(R.id.btnMyChange);

        registerForContextMenu(btnBackground);
        registerForContextMenu(btnMyChange);
//        8.메뉴를 사용할 위젯 을 등록할 준비  (버튼별로 등록했기 때문에 2개 생성하였다.)

    }

//      9. 2개의 메소드를 추가하기 위해 오버라이드 메소드에서 추가  onCreateContextMenu  와 onContextItemSelected 를 추가한다.


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater minflater=getMenuInflater();

//        10. if 문을 통해 버튼별로 꾹 눌렀을 때 의 상황을 만들어준다.
        if(v==btnBackground) {
//        11. menu.setHeaderTitle() context에 제목(타이틀)을 줄 수 있다.
            menu.setHeaderTitle("배경색 변경");

//            12.  버튼별로 적용 시켜준다.
            minflater.inflate(R.menu.contextmenubeck,menu);
        }else if (v==btnMyChange){
            minflater.inflate(R.menu.cbuttonmenu,menu);

        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
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
            case R.id.itemRotate:
                btnMyChange.setRotation(45);
                break;
            case R.id.itemSize:
                btnMyChange.setScaleX(2);
                btnMyChange.setScaleY(2);
                break;
            case R.id.itemInit:
                btnMyChange.setRotation(0);
                btnMyChange.setScaleX(1);
                btnMyChange.setScaleY(1);
                break;

        }
        return super.onContextItemSelected(item);
    }
}
