package com.example.aar_modify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.taobao.weex.InitConfig;

/**
 *
 * https://www.jianshu.com/p/f0a267551493
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitConfig config=new InitConfig.Builder()
                .build();


//        com.taobao.weex.adapter.ClassLoaderAdapter adapter;
    }
}
