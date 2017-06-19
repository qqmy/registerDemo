package com.example.testing.registerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.widget.TextView;



public class Main2Activity extends Activity {
    private TextView tv_age,tv_name;
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //获取Intent对象
        Intent intent=getIntent();
        //取出key对应的value值
        String age=intent.getStringExtra("age");
        String name=intent.getStringExtra("name");
        tv_age=(TextView) findViewById(R.id.tv_age);
        tv_name=(TextView) findViewById(R.id.name);
        tv_name.setText("恭喜"+name+"!");
        tv_age.setText("来到这个世界"+age+"年");

    }
}