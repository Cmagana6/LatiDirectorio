package com.m00061016.latidirectorio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Login_Activity extends AppCompatActivity {
    private Button btn_entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        btn_entrar = (Button) findViewById(R.id.btn_entrar);
    }

    @Override
    protected void onResume() {
        super.onResume();
        btn_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(v.getContext(), Menu_Activity.class);
                startActivity(intent);
            }
        });
    }

}
