package com.example.broadcastbestpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    private EditText nameEdit;
    private EditText passwordEdit;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEdit = findViewById(R.id.user_name);
        passwordEdit = findViewById(R.id.user_password);
        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = nameEdit.getText().toString();
                String password = passwordEdit.getText().toString();
                // 账号admin 密码123456
                if (userName.equals("admin") && password.equals("123456")){
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);
                    finish();
                }else {
                    Toast.makeText(MainActivity.this,"请输入正确的用户名或密码",Toast.LENGTH_SHORT).show();
                    nameEdit.setText("");
                    passwordEdit.setText("");
                }
            }
        });
    }
}
