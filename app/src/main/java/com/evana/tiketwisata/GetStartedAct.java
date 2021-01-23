package com.evana.tiketwisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.evana.tiketwisata.R;
import com.evana.tiketwisata.SignInAct;

public class GetStartedAct extends AppCompatActivity {

    Button btn_signin;
    Button btn_new_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        btn_signin = findViewById(R.id.btn_signin);
        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotosign = new Intent(GetStartedAct.this, SignInAct.class);
                startActivity(gotosign);
            }
        });

        btn_new_account = findViewById(R.id.btn_new_account);
        btn_new_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoregister1 = new Intent(GetStartedAct.this, com.evana.tiketwisata.RegisterOneAct.class);
                startActivity(gotoregister1);
                finish();
            }
        });
    }
}