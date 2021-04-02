package com.example.clickmyemotion;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView btn_1 = findViewById(R.id.btn_1);
        final TextView btn_2 = findViewById(R.id.btn_2);
        final TextView btn_3 = findViewById(R.id.btn_3);


        Button add_emo = findViewById(R.id.add_emo);

        btn_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                clickButton(btn_1);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                clickButton(btn_2);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                clickButton(btn_3);
            }
        });

    }

    //button click시 원하는 감정 edit
    protected void clickButton(final TextView btn){
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                showDialog(btn);
            }
        });
    }
    private void showDialog(final TextView btn) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("원하는 감정을 입력하세요");

        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_TEXT);
        builder.setView(input);

        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String newEmotion = input.getText().toString();
                btn.setText(newEmotion);
            }
        });

        builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.show();
    }
}