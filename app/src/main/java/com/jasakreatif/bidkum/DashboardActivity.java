package com.jasakreatif.bidkum;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
/**
 * Created by Hadiana on 3/21/2018.
 */
public class DashboardActivity extends AppCompatActivity {

    Button LogOut;
    TextView EmailShow;
    String EmailHolder;

    TextView YourName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
//        setContentView(R.layout.activity_main2);


        LogOut = (Button) findViewById(R.id.button);
        EmailShow = (TextView) findViewById(R.id.EmailShow);
        YourName = (TextView)findViewById(R.id.YourName);


        Intent intent = getIntent();
        EmailHolder = intent.getStringExtra(UserLoginActivity.UserNrp);
//        YourName = intent.getStringExtra(UserLoginActivity);

        EmailShow.setText(EmailHolder);
//        YourName.setText();


        LogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

                Intent intent = new Intent(DashboardActivity.this, UserLoginActivity.class);
//                Intent intent = new Intent(MainActivity2.this, UserLoginActivity.class);

                startActivity(intent);

                Toast.makeText(DashboardActivity.this, "Anda Telah Keluar Aplikasi", Toast.LENGTH_LONG).show();


            }
        });
    }
}
