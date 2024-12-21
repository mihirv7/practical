package com.example.app1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HwToastActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hw_toast);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);


        btn1.setOnClickListener(view -> {

            Toast.makeText(this, "Button 1 Clicked" , Toast.LENGTH_SHORT).show();
        });

        btn2.setOnClickListener(view -> {

            Toast.makeText(this, "Button 2 Clicked" , Toast.LENGTH_SHORT).show();
        });

        btn3.setOnClickListener(view -> {

            Toast.makeText(this, "Button 3 Clicked" , Toast.LENGTH_SHORT).show();
        });

        btn4.setOnClickListener(view -> {

            Toast.makeText(this, "Button 4 Clicked" , Toast.LENGTH_SHORT).show();
        });


    }
}