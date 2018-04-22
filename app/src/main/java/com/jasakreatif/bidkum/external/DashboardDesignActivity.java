package com.jasakreatif.bidkum.external;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jasakreatif.bidkum.R;


/**
 * Created by Hadiana on 4/8/2018.
 */

public class DashboardDesignActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_layout_external);

        /**
         * Creating all buttons instances
         * */

        Button btn_lembaga = (Button) findViewById(R.id.btn_lembaga);


        Button btn_masyarakat = (Button) findViewById(R.id.btn_masyarakat);




        /**
         * Handling all button click events
         * */

        // Listening to News Feed button click
        btn_lembaga.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching News Feed Screen
                Intent i = new Intent(getApplicationContext(), LembagaActivity.class);
                startActivity(i);
            }
        });

        // Listening Friends button click
        btn_masyarakat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching News Feed Screen
                Intent i = new Intent(getApplicationContext(), MasyarakatActivity.class);
                startActivity(i);
            }
        });


    }
}