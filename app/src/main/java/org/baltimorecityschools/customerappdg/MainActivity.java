package org.baltimorecityschools.customerappdg;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    ImageButton leftBTN,rightBTN;
    FloatingActionButton addBTN;
    TextView fNTV, lNTV, pHTV, adsTV,emTV;
    Intent GoToMenu;

    int Index;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leftBTN = (ImageButton) findViewById(R.id.leftButton);
        rightBTN = (ImageButton) findViewById(R.id.rightButton);

        addBTN = (FloatingActionButton) findViewById(R.id.floatingActionButton);

        fNTV = (TextView) findViewById(R.id.FNtextView);
        lNTV = (TextView) findViewById(R.id.LNtextView);

        pHTV = (TextView) findViewById(R.id.phoneTextView);
        adsTV = (TextView) findViewById(R.id.adstextView);
        emTV = (TextView) findViewById(R.id.emtextView);


        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                GoToMenu = new Intent(MainActivity.this, AddCustomerActivity.class);
                startActivity(GoToMenu);

            }
        });

    }
}