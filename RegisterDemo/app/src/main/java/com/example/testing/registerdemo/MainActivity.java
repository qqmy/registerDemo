package com.example.testing.registerdemo;

import android.app.Activity;
import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.RadioButton;

public class MainActivity extends Activity {
    private Button btn_send;
    private EditText et_name;


    private EditText et_age;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_name = (EditText) findViewById(R.id.et_name);
        et_age = (EditText) findViewById(R.id.et_age);
        btn_send = (Button) findViewById(R.id.btn_send);

        //点击发送按钮进行数据传递
        btn_send.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                passDate();
            }
        });
    }
    //传递数据
    public void passDate() {
        //创建Intent对象，启动Activity02
        Intent intent = new Intent(this, Main2Activity.class);
        //将数据存入Intent对象
        intent.putExtra("name", et_name.getText().toString().trim());
        intent.putExtra("age",et_age.getText().toString().trim());
        String str = "";


        startActivity(intent);
    }
}
