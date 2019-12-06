package com.example.dialogex;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

//대화상자를 생성하기 위해  대화상자 생성 -> 용도 설정 -> 대화상자 화면 설정

public class MainActivity extends AppCompatActivity {

    Button btnInfo;

//    4.배열생성 및 스트링 생성
    String pet[]={"강아지","고양이","말"};
    String choicePat;
    int position;
    Integer img[] = {R.drawable.dog,R.drawable.cat,R.drawable.horse};
    ImageView ivPat;
    boolean check[] = {true,false,false};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInfo=(Button)findViewById(R.id.btnInfo);
        ivPat=(ImageView)findViewById(R.id.ivPat);


        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                1. 대화상자 생성 AlertDialog.Builder 아이디=new AlertDialog.Builder(MainActivity.this)
                final AlertDialog.Builder exitdlg=new AlertDialog.Builder(MainActivity.this);


 //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~` 기본 위젯 연습
////                2.용도설정  exitdlg.setTitle("공지사항"); 다이얼로그에 보이는 제목
////                .setPositiveButton .setNegativeButton 이 두가지는 버튼 위치의 차이일뿐이다.
//                exitdlg.setTitle("공지사항");
//                exitdlg.setIcon(R.drawable.wonderwoman_archigraphss);
//                exitdlg.setMessage("내일까지만 수업합니다.(이전주는...)\n(확인버튼을 누르면 앱이 종료됩니다.)");
//                exitdlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        finish();
//                    }
//                });
//                exitdlg.setNegativeButton("취소", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(getApplicationContext(),"취소버튼을누르셔서 화면으로 돌아갑니다.",Toast.LENGTH_SHORT).show();
//                    }
//                });
////                3.대화상자 화면 설정 및 출력.show();
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`기본 위젯 연습
                exitdlg.setTitle("좋아하는 동물은?");
                exitdlg.setIcon(R.drawable.wonderwoman_archigraphss);

                //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`기본 위젯 연습2
//                exitdlg.setItems(pet, new DialogInterface.OnClickListener() {
//                    //5..setItems()
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
////                                                                int which  팻 값의 위치를 돌려주는 역할
//                        btnInfo.setText(pet[which]);  //btnInfo.setText(pet[which]);  버튼에 글자를 세팅시켰다. which값을
//                    }
//                });
//                exitdlg.setPositiveButton("닫기",null);

                //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`기본 위젯 연습2
                //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`기본 위젯 연습3  배열을 이용한 이미지 선택하여 보이게 하기(라디오버튼)
                exitdlg.setSingleChoiceItems(pet, -1, new DialogInterface.OnClickListener() {
                    //                        Single  : 라디오 버튼으로 생성 (여러개중에 한개를 고르는 것)   checkeditem을 -1로 설정하면 아무것도 설정 되있지 않음
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        btnInfo.setText("선택중...");
                        position=which;

                    }
                });
                exitdlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        btnInfo.setText("선택완료 : "+pet[position]);
                        ivPat.setImageResource(img[position]);




                    }
                });
                //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`기본 위젯 연습3 배열을 이용한 이미지 선택하여 보이게 하기

////~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 이 부분은 체크박스에 관련된 구문이다.  상단에서 boolean으로 배열을 작성 한 후에 제작한다.
//                exitdlg.setMultiChoiceItems(pet, check, new DialogInterface.OnMultiChoiceClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
//
//                    }
//                });
//
////~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  이 부분은 체크박스에 관련된 구문이다.  상단에서 boolean으로 배열을 작성 한 후에 제작한다.
                exitdlg.show();
            }
        });
    }
}
