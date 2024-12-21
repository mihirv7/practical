package com.example.app1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AlertActivity extends AppCompatActivity {

    Button btnsub;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_alert);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnsub=findViewById(R.id.btnsub);

        btnsub.setOnClickListener(view -> {

            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setTitle("EXIT")
                    .setMessage("Are You Sure")
                    .setPositiveButton("Yes",(dialogInterface, i) -> {
                        Toast.makeText(this, "Yes Button CLicked", Toast.LENGTH_SHORT).show();
                        finish();
                    })
                    .setNegativeButton("No",(dialogInterface, i) -> {
                        Toast.makeText(this, "No Button Clicked", Toast.LENGTH_SHORT).show();
                    })
                    .show();

        });
    }
}