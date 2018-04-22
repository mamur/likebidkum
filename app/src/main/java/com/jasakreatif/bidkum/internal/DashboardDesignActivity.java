package com.jasakreatif.bidkum.internal;

/**
 * Created by Hadiana on 4/8/2018.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jasakreatif.bidkum.R;


public class DashboardDesignActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_layout);

        /**
         * Creating all buttons instances
         * */
        // Dashboard News feed button
        Button btn_pendampingan = (Button) findViewById(R.id.btn_pendampingan);

        // Dashboard Friends button
        Button btn_saran_pendapat_umum = (Button) findViewById(R.id.btn_saran_pendapat_umum);

        // Dashboard Messages button
        Button btn_advokasi = (Button) findViewById(R.id.btn_advokasi);

        // Dashboard Places button
        Button btn_pembuatan_sopmou = (Button) findViewById(R.id.btn_pembuatan_sopmou);

        // Dashboard Events button
        Button btn_kumpulan_peraturan = (Button) findViewById(R.id.btn_kumpulan_peraturan);



        /**
         * Handling all button click events
         * */

        // Listening to News Feed button click
        btn_pendampingan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching News Feed Screen
                Intent i = new Intent(getApplicationContext(), PendampinganActivity.class);
                startActivity(i);
            }
        });

        // Listening Friends button click
        btn_saran_pendapat_umum.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching News Feed Screen
                Intent i = new Intent(getApplicationContext(), SaranPendapatHukumActivity.class);
                startActivity(i);
            }
        });

        // Listening Messages button click
        btn_advokasi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching News Feed Screen
                Intent i = new Intent(getApplicationContext(), AdvokasiActivity.class);
                startActivity(i);
            }
        });

        // Listening to Places button click
        btn_pembuatan_sopmou.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching News Feed Screen
                Intent i = new Intent(getApplicationContext(), PembuatanSopMouActivity.class);
                startActivity(i);
            }
        });

        // Listening to Events button click
        btn_kumpulan_peraturan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching News Feed Screen
                Intent i = new Intent(getApplicationContext(), KumpulanPeraturanActivity.class);
                startActivity(i);
            }
        });

    }
}