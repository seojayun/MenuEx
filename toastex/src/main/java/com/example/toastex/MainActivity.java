package com.example.toastex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    토스트의 위치 변경
    Button btn1;
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//    Toast to1;
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    TextView tvToast;
    Toast mToast;
    View toastView;
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //  1. 토스트의 변수 선언
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//              to1=Toast.makeText(getApplicationContext(),"왜이렇게 렉이 심해",Toast.LENGTH_SHORT);
//
//              // 2. 토스트 입력 후 변수에 대입
//
//
//              //3. 토스트 변수가 실행 될 수 있도록 .show(); 적용
//                //4. to1.setGravity(Gravity.TOP|Gravity.LEFT,150,200); 토스트의 위치 설정 방법  :  Gravity.TOP  기준위치를 TOP 에 놓고 시작함  BOTTOM이면 아래쪽을 기준으로 시작하며 .LEFT는 왼쪽 기준임
//                Display display=((WindowManager) getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
////                5.                                                             .getDefaultDisplay();    내 폰의 width 와 height 를 가져올 수 있다. (화면정보)  이것을 display로 변수 선언하였다.
//                int x  = (int) (Math.random()*display.getWidth());
//                int y  = (int) (Math.random()*display.getHeight());
////                6 . x,y 변수 선언하여 Math.random() 적용시켜 x는 가로 y는 세로로 적용시킴
//                to1.setGravity(Gravity.TOP|Gravity.LEFT,x,y);
//
//
//                to1.show();
////                7. 최종적으로 toast 위치가 렌덤하게 뜨게 된다.
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

                // 8. 내가 직접 토스트를 만들기 위해 toast.xml 을 생성해서 작성하고, 변수 mToast  선언 후, 생성하였다.
                mToast=new Toast(MainActivity.this);
//                9. View 변수 하나를 선언하여, 거기에  toast를 인플레이트 한다.
                toastView=(View)View.inflate(MainActivity.this,R.layout.toast,null);
                tvToast=(TextView)toastView.findViewById(R.id.tvToast);
//             10.   tvToast=(TextView)toastView.findViewById(R.id.tvToast);  매우중요!!!! 왜냐면 이것은 지금 activity main.xml 에서 받는 것이 아닌 toast.xml에서 받는 것이기 때문이다.
                tvToast.setText("야 너무 렉 심한거 아니냐 버그다");
                mToast.setView(toastView);
                mToast.setGravity(Gravity.TOP|Gravity.LEFT,100,200);
//                                mToast.setGravity(Gravity.TOP|Gravity.LEFT,100,200); 토스트의 위치지정
                mToast.show();



            }
        });
    }
}
