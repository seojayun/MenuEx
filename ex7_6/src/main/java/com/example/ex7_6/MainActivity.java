package com.example.ex7_6;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdoG;
    RadioButton rdo1,rdo2,rdo3,rdo4;
    Button btnanswer;
    ImageView  img1;
    TextView text11;
    View dlgView;
    RatingBar rat1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnanswer=(Button)findViewById(R.id.btnanswer);
        rdoG=(RadioGroup)findViewById(R.id.rdoG);
        rdo1=(RadioButton)findViewById(R.id.rdo1) ;
        rdo2=(RadioButton)findViewById(R.id.rdo2) ;
        rdo3=(RadioButton)findViewById(R.id.rdo3) ;
        rdo4=(RadioButton)findViewById(R.id.rdo4) ;



        btnanswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg=new AlertDialog.Builder(MainActivity.this);
                dlgView=(View)View.inflate(MainActivity.this, R.layout.dialong1,null);
                img1=(ImageView)dlgView.findViewById(R.id.img1);
                text11=(TextView)dlgView.findViewById(R.id.text11);
                rat1=(RatingBar)dlgView.findViewById(R.id.rat1);



                switch (rdoG.getCheckedRadioButtonId()) {
                    case R.id.rdo1:
                       img1.setImageResource(R.drawable.mov01);
                       rat1.setRating(2);
                       text11.setText("이 영화는\n재미없습니다.");
                       dlg.setTitle(rdo1.getText().toString());

                        break;

                    case R.id.rdo2:
                        img1.setImageResource(R.drawable.mov02);
                        rat1.setRating(4);
                        text11.setText("이 영화는\n재미있습니다.");
                        dlg.setTitle(rdo2.getText().toString());
                        break;

                    case R.id.rdo3:
                        img1.setImageResource(R.drawable.mov03);
                        rat1.setRating(3);
                        text11.setText("이 영화는\n그저그렇습니다.");
                        dlg.setTitle(rdo3.getText().toString());
                        break;

                    case R.id.rdo4:
                        img1.setImageResource(R.drawable.mov04);
                        rat1.setRating(1);
                        text11.setText("이 영화는\n보지마세요.");
                        dlg.setTitle(rdo4.getText().toString());
                        break;


                }

                dlg.setIcon(R.drawable.map36);
                dlg.setView(dlgView);
                dlg.setPositiveButton("닫기",null);
                dlg.show();
            }
        });


    }
}
