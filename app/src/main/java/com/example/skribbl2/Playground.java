package com.example.skribbl2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.facebook.drawee.view.SimpleDraweeView;

public class Playground extends AppCompatActivity {
    private RelativeLayout keyboardRl;
    private EditText et;
//    private SimpleDraweeView wb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playground);
        keyboardRl = findViewById(R.id.keyboardRl);
        et = findViewById(R.id.et);
    //    wb = (SimpleDraweeView) findViewById(R.id.wb);


        keyboardRl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKeyboard();
            }
        });
    }

    private void openKeyboard() {

        et.requestFocus();
        InputMethodManager imm = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(et, InputMethodManager.SHOW_IMPLICIT);
    }
}