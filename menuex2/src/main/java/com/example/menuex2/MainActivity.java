package com.example.menuex2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.security.acl.Group;

public class MainActivity extends AppCompatActivity {


    EditText editText1;
    ImageView imageView1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText1=(EditText)findViewById(R.id.editText1);
        imageView1=(ImageView)findViewById(R.id.imageView1) ;


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        super.onCreateOptionsMenu(menu);
        MenuInflater minfiater = getMenuInflater();
        minfiater.inflate(R.menu.menu1,menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.botton1:
//                imageView1.setRotation(Integer.parseInt(editText1.getText().toString()));
                imageView1.setRotation(Float.parseFloat(editText1.getText().toString()));
                break;

            case R.id.rdo1:
                imageView1.setImageResource(R.drawable.jeju);
                item.setChecked(true);


//                 item.setChecked(true); 이 부분을 작성해줘야 한다.
                break;
            case R.id.rdo2:
                imageView1.setImageResource(R.drawable.jeju1);
                item.setChecked(true);
                break;
            case R.id.rdo3:
                imageView1.setImageResource(R.drawable.jeju4);
                item.setChecked(true);
                break;





        }

        return super.onOptionsItemSelected(item);
    }
}
