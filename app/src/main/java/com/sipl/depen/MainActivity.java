package com.sipl.depen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sipl.flashmessage.FlashMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FlashMessage.showCaramelOverDarkFlash(this,"Hello World", false);
    }
}