package com.example.app1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalcActivity extends AppCompatActivity {

    Button btnsum,btnsub,btnmul,btndev;
    EditText et1,et2;
    TextView tv1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calc);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnsum=findViewById(R.id.btnsum);
        btnsub=findViewById(R.id.btnsub);
        btnmul=findViewById(R.id.btnmul);
        btndev=findViewById(R.id.btndev);
        et1=findViewById(R.id.edt1);
        et2=findViewById(R.id.edt2);
        tv1=findViewById(R.id.tvAns);

        btnsum.setOnClickListener(view -> {

            if(TextUtils.isEmpty(et1.getText().toString()))
            {
                Toast.makeText(this, "TextBox Required....", Toast.LENGTH_SHORT).show();
                et1.setError("Required.....");
            }
            else if (TextUtils.isEmpty(et2.getText().toString()))
            {
                Toast.makeText(this, "TextBox Required....", Toast.LENGTH_SHORT).show();
                et2.setError("Required.....");
            }else
            {
                int n1=Integer.parseInt(et1.getText().toString());
                int n2=Integer.parseInt(et2.getText().toString());
                int ans=n1+n2;
                tv1.setText("Ans is "+ans);
            }
        });


        btnsub.setOnClickListener(view -> {

            if(TextUtils.isEmpty(et1.getText().toString()))
            {
                Toast.makeText(this, "TextBox Required....", Toast.LENGTH_SHORT).show();
                et1.setError("Required.....");
            }
            else if (TextUtils.isEmpty(et2.getText().toString()))
            {
                Toast.makeText(this, "TextBox Required....", Toast.LENGTH_SHORT).show();
                et2.setError("Required.....");
            }else
            {
                int n2=Integer.parseInt(et1.getText().toString());
                int n1=Integer.parseInt(et2.getText().toString());
                int ans=n2-n1;
                tv1.setText("Ans is "+ans);
            }
        });

        btnmul.setOnClickListener(view -> {

            if(TextUtils.isEmpty(et1.getText().toString()))
            {
                Toast.makeText(this, "TextBox Required....", Toast.LENGTH_SHORT).show();
                et1.setError("Required.....");
            }
            else if (TextUtils.isEmpty(et2.getText().toString()))
            {
                Toast.makeText(this, "TextBox Required....", Toast.LENGTH_SHORT).show();
                et2.setError("Required.....");
            }else
            {
                int n1=Integer.parseInt(et1.getText().toString());
                int n2=Integer.parseInt(et2.getText().toString());
                int ans=n1*n2;
                tv1.setText("Ans is "+ans);
            }
        });

        btndev.setOnClickListener(view -> {

            if(TextUtils.isEmpty(et1.getText().toString()))
            {
                Toast.makeText(this, "TextBox Required....", Toast.LENGTH_SHORT).show();
                et1.setError("Required.....");
            }
            else if (TextUtils.isEmpty(et2.getText().toString()))
            {
                Toast.makeText(this, "TextBox Required....", Toast.LENGTH_SHORT).show();
                et2.setError("Required.....");
            }else
            {
                Double n2=Double.parseDouble(et1.getText().toString());
                Double n1=Double.parseDouble(et2.getText().toString());
                Double ans=n2/n1;
                tv1.setText("Ans is "+ans);
            }
        });


    }
}