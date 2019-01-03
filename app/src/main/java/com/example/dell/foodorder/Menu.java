package com.example.dell.foodorder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

public class Menu extends AppCompatActivity {
    ImageView imageView,imageView2,imageView3;
    CheckBox checkBox,checkBox2,checkBox3;
    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eachmenu);
        imageView=(ImageView)findViewById(R.id.imageView);
        imageView2=(ImageView)findViewById(R.id.imageView2);
       // imageView3=(ImageView)findViewById(R.id.imageView3);
        checkBox=(CheckBox)findViewById(R.id.checkbox);
        checkBox2=(CheckBox)findViewById(R.id.checkbox2);
       // checkBox3=(CheckBox)findViewById(R.id.checkbox3);
        button=(Button)findViewById(R.id.button);

      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              int totalamount = 0;
              StringBuilder result = new StringBuilder();
              result.append("Selected Items:");
              if (checkBox.isChecked()) {
                  result.append("\nBiriyani 220Rs");
                  totalamount += 220;
              }
              if (checkBox2.isChecked()) {
                  result.append("\nDosa 2000Rs");
                  totalamount += 200;
              }
              if (checkBox3.isChecked()) {
                  result.append("\nchapati 100Rs");
                  totalamount += 100;
              }
              result.append("\nTotal: " + totalamount + "Rs");
              //Displaying the message on the toast
              Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
          }
          });






    }
    }
