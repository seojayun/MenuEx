package com.example.dialogex2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtName,edtEmail;
    Button btnInfo;
    EditText dlgEdtName,dlgEdtEmail;
    View dlgView;
    Toast to1;
//   diglog.xml를 담기 위한 View 변수를 만든다.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtName=(EditText)findViewById(R.id.edtName);
        edtEmail=(EditText)findViewById(R.id.edtEmail);
        btnInfo=(Button)findViewById(R.id.btnInfo);


//        기본적으로  토스트 확장하는 것과 동일하기 때문에, 반복연습할것.

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                AlertDialog.Builder dlg=new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("사용자 정보 입력");
                dlg.setIcon(R.drawable.aass);
                dlgView=(View)View.inflate(MainActivity.this,R.layout.dialog,null);
                dlgEdtName=(EditText)dlgView.findViewById(R.id.dlgEdtName);
                dlgEdtEmail=(EditText)dlgView.findViewById(R.id.dlgEdtEmail);
                dlgEdtName.setText(edtName.getText().toString());
                dlgEdtEmail.setText(edtEmail.getText().toString());
                //                이 선언 부분이 중요한데,해당 2개의 EditText는  메인엑티비티.xml 에 있는 것이 아니기 때문에 위에 선언하면 실행할때 이 부분을 찾을 수 없어서 오류가 발생한다.
//                따라서 View 변수로 선언한 dlgView 안에 있는 dlgEdtName 와 dlgEdtEmail 를 선언한다.
                dlg.setView(dlgView);
                dlg.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        to1 = Toast.makeText(getApplicationContext(), "취소되었습니다.", Toast.LENGTH_SHORT);
                        Display display = ((WindowManager) getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
                        int x = (int) (Math.random() * display.getWidth());
                        int y = (int) (Math.random() * display.getHeight());
                        to1.setGravity(Gravity.TOP | Gravity.LEFT, x, y);
                        to1.show();
                    }
                });
                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                        edtName.setText(dlgEdtName.getText().toString());
                        edtEmail.setText(dlgEdtEmail.getText().toString());
                    }
                });
                dlg.show();
            }
        });

    }
}
