package com.example.ex7_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnToastShow;
    ImageView imgeView1;
    Toast mToast;
    View view1;
    int index =0;
    Integer img[] = {R.drawable.nougat,R.drawable.oreo,R.drawable.pie};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToastShow=(Button)findViewById(R.id.btnToastShow);

        btnToastShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                imgeView1=(ImageView)findViewById(R.id.imgeView1);

                Display display = ((WindowManager) getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
                int x = (int) (Math.random() * display.getWidth());
                int y = (int) (Math.random() * display.getHeight());
                mToast= new Toast(MainActivity.this);
                view1=(View)View.inflate(MainActivity.this,R.layout.toast,null);
                imgeView1=(ImageView)view1.findViewById(R.id.imgeView1);
                if(index==3) {
                    index=0;
                }
                imgeView1.setImageResource(img[index]);
                index++;
                mToast.setView(view1);
                mToast.setGravity(Gravity.TOP | Gravity.LEFT, x,y);
                mToast.show();

                    }



        });

    }
}
