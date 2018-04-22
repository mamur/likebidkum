package com.jasakreatif.bidkum;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.HashMap;
/**
 * Created by Hadiana on 3/21/2018.
 */
public class UserLoginActivity extends AppCompatActivity {

    EditText Nrp, Password;
    Button LogIn;
    String PasswordHolder, NrpHolder;
    String finalResult;
//    http://sislapgk.com/bidkum/UserLogin.php
//    http://192.168.42.19/login/UserLogin.php
String HttpURL = "http://sislapgk.com/bidkum/UserLogin.php";
//    String HttpURL = "http://192.168.42.52/bidkum/UserLogin.php";
    Boolean CheckEditText;
    ProgressDialog progressDialog;
    HashMap<String, String> hashMap = new HashMap<>();
    HttpParse httpParse = new HttpParse();
    public static final String UserNrp = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        Nrp = (EditText) findViewById(R.id.nrp);
        Password = (android.widget.EditText) findViewById(R.id.password);
        LogIn = (Button) findViewById(R.id.Login);

        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CheckEditTextIsEmptyOrNot();

                if (CheckEditText) {

                    UserLoginFunction(NrpHolder, PasswordHolder);

                } else {

                    Toast.makeText(UserLoginActivity.this, "Mohon Isi Data Dengan Lengkap.", Toast.LENGTH_LONG).show();

                }

            }
        });
    }

    public void CheckEditTextIsEmptyOrNot() {

        NrpHolder = Nrp.getText().toString();
        PasswordHolder = Password.getText().toString();

        if (TextUtils.isEmpty(NrpHolder) || TextUtils.isEmpty(PasswordHolder)) {
            CheckEditText = false;
        } else {

            CheckEditText = true;
        }
    }

    public void UserLoginFunction(final String nrp, final String password) {

        class UserLoginClass extends AsyncTask<String, Void, String> {

            @Override
            protected void onPreExecute() {
                super.onPreExecute();

                progressDialog = ProgressDialog.show(UserLoginActivity.this, "Loading Data", null, true, true);
            }

            @Override
            protected void onPostExecute(String httpResponseMsg) {

                super.onPostExecute(httpResponseMsg);

                progressDialog.dismiss();

                if (httpResponseMsg.equalsIgnoreCase("Data Matched")) {

                    finish();

//                    Intent intent = new Intent(UserLoginActivity.this, DashboardActivity.class);
                    Intent intent = new Intent(UserLoginActivity.this, MainActivity.class);

                    intent.putExtra(UserNrp, nrp);
//                    intent.putExtra(String.valueOf(Password), password);

                    startActivity(intent);

                } else {

                    Toast.makeText(UserLoginActivity.this, httpResponseMsg, Toast.LENGTH_LONG).show();
                }

            }

            @Override
            protected String doInBackground(String... params) {

                hashMap.put("nrp", params[0]);

                hashMap.put("password", params[1]);

                finalResult = httpParse.postRequest(hashMap, HttpURL);

                return finalResult;
            }
        }

        UserLoginClass userLoginClass = new UserLoginClass();

        userLoginClass.execute(nrp, password);
    }

}
