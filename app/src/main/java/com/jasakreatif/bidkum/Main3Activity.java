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
public class Main3Activity extends AppCompatActivity {

    Button register, log_in;
    EditText Nama,Email,Telp, Password;
    String NamaHolder,EmailHolder, TelpHolder, PasswordHolder;
    String finalResult;
    //    http://192.168.42.19/login/UserRegistration.php
//    http://sislapgk.com/bidkum/UserRegistration.php
    String HttpURL = "http://sislapgk.com/bidkum/UserRegistrationExternal.php";
//    String HttpURL = "http://192.168.42.52/bidkum/UserRegistrationExternal.php";
    Boolean CheckEditText;
    ProgressDialog progressDialog;
    HashMap<String, String> hashMap = new HashMap<>();
    HttpParse httpParse = new HttpParse();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //Assign Id'S
        Nama = (EditText) findViewById(R.id.editTextNama);
        Email = (EditText) findViewById(R.id.editTextEmail);
        Telp = (EditText) findViewById(R.id.editTextTelp);
        Password = (EditText) findViewById(R.id.editTextPassword);

        register = (Button) findViewById(R.id.Submit);
        log_in = (Button) findViewById(R.id.Login);

        //Adding Click Listener on button.
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Checking whether EditText is Empty or Not
                CheckEditTextIsEmptyOrNot();

                if (CheckEditText) {

                    // If EditText is not empty and CheckEditText = True then this block will execute.

                    UserRegisterFunction(NamaHolder, EmailHolder, TelpHolder, PasswordHolder);

                } else {

                    // If EditText is empty then this block will execute .
                    Toast.makeText(Main3Activity.this, "Mohon Isi Data Dengan Lengkap.", Toast.LENGTH_LONG).show();

                }


            }
        });

        log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Main3Activity.this, UserLoginActivity3.class);
                startActivity(intent);

            }
        });

    }

    public void CheckEditTextIsEmptyOrNot() {

        NamaHolder = Nama.getText().toString();
        EmailHolder = Email.getText().toString();
        TelpHolder = Telp.getText().toString();
        PasswordHolder = Password.getText().toString();


        if (TextUtils.isEmpty(NamaHolder) || TextUtils.isEmpty(EmailHolder) || TextUtils.isEmpty(TelpHolder)  || TextUtils.isEmpty(PasswordHolder)) {

            CheckEditText = false;

        } else {

            CheckEditText = true;
        }

    }

    public void UserRegisterFunction(final String nama,final String email,  final String telp, final String password) {

        class UserRegisterFunctionClass extends AsyncTask<String, Void, String> {

            @Override
            protected void onPreExecute() {
                super.onPreExecute();

                progressDialog = ProgressDialog.show(Main3Activity.this, "Sedang Memuat Data", null, true, true);
            }

            @Override
            protected void onPostExecute(String httpResponseMsg) {

                super.onPostExecute(httpResponseMsg);

                progressDialog.dismiss();

                Toast.makeText(Main3Activity.this, httpResponseMsg.toString(), Toast.LENGTH_LONG).show();

            }

            @Override
            protected String doInBackground(String... params) {

                hashMap.put("nama", params[0]);

                hashMap.put("email", params[1]);

                hashMap.put("telp", params[2]);

                hashMap.put("password", params[3]);

                finalResult = httpParse.postRequest(hashMap, HttpURL);

                return finalResult;
            }
        }

        UserRegisterFunctionClass userRegisterFunctionClass = new UserRegisterFunctionClass();

        userRegisterFunctionClass.execute(nama, email, telp, password);
    }

}