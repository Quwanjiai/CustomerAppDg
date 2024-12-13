package org.baltimorecityschools.customerappdg;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddCustomerActivity extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference myRef;

    Button conBTN;

    EditText fnBT,lnBT,phBT,adsBT,emBT;

    String fn,ls,ph,ads,em;

    Customer newcustomer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_customer);

        fn = " ";

        ls = " ";

        ph = " ";

        ads = " ";

        em = " ";


        conBTN = (Button) findViewById(R.id.confBTN);

        fnBT = (EditText) findViewById(R.id.fnED);

        lnBT = (EditText) findViewById(R.id.lnET);

        database = FirebaseDatabase.getInstance();

        myRef = database.getReference("message");

        phBT = (EditText) findViewById(R.id.phET);

        adsBT = (EditText) findViewById(R.id.adsET);

        emBT = (EditText) findViewById(R.id.emED);

        conBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fn = fnBT.getText().toString();
                ls = lnBT.getText().toString();
                ph = phBT.getText().toString();
                ads = adsBT.getText().toString();
                em = emBT.getText().toString();

                newcustomer = new Customer(fn,ls,ph,ads,em);

                myRef.setValue(newcustomer);
            }
        });
    }
}