package com.jasakreatif.bidkum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageLauncherActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnLogin,btnLoginE,btnPersyaratan,btnPanduan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_launcher);
//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        btnLogin=(Button)findViewById(R.id.btnLogin);
        btnLoginE=(Button)findViewById(R.id.btnLoginE);
        btnPersyaratan=(Button)findViewById(R.id.btnPersyaratan);
        btnPanduan=(Button)findViewById(R.id.btnPanduan);

        btnLogin.setOnClickListener(this);
        btnLoginE.setOnClickListener(this);
        btnPersyaratan.setOnClickListener(this);
        btnPanduan.setOnClickListener(this);

    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnLogin:
                startActivity(new Intent(PageLauncherActivity.this,Main2Activity.class));
                break;
            case R.id.btnLoginE:
                startActivity(new Intent(PageLauncherActivity.this,Main3Activity.class));
                break;
            case R.id.btnPersyaratan:
                startActivity(new Intent(PageLauncherActivity.this,PersyaratanActivity.class));
                break;
            case  R.id.btnPanduan:
                startActivity(new Intent(PageLauncherActivity.this,PanduanActivity.class));;
                break;
        }

    }
}
