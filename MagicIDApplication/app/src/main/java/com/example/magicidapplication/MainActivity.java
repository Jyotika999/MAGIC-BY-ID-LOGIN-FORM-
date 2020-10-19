package com.example.magicidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etID;
    Button btID;
    TextView tvID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       etID= findViewById(R.id.etID);
       btID= findViewById(R.id.btID);
       tvID= findViewById(R.id.tvID);

       tvID.setVisibility(View.GONE);



       btID.setOnClickListener(new View.OnClickListener() {
           @SuppressLint("SetTextI18n")
           @Override
           public void onClick(View v) {
               String idnumber = etID.getText().toString().trim();
               String dob = idnumber.substring(0,6);
               int gender = Integer.parseInt(Character.toString(idnumber.charAt(6)));
               String resgender;
               if(gender >=0 && gender <5)
               {
                   resgender= "Female\n";
               }
               else
               {
                   resgender= "Male\n";
               }
            int nation=   Integer.parseInt(Character.toString(idnumber.charAt(10)));

               String nationality;
               if(nation==0)nationality= "SA Citizen";
               else nationality = "Permanent Residence";

               tvID.setText("Date of Birth: "+dob+"\n"+"Gender: "+resgender+"\n"+"Nationality: "+nationality+"\n");
               tvID.setVisibility(View.VISIBLE);

           }
       });

    }
}