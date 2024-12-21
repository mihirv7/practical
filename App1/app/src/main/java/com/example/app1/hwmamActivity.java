package com.example.app1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class hwmamActivity extends AppCompatActivity {

    Button btncl;
    EditText etAge;
    TextView tvAge;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hwmam);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btncl=findViewById(R.id.btncl);
        etAge=findViewById(R.id.etAge);
        tvAge=findViewById(R.id.tvAge);

        btncl.setOnClickListener(view -> {

            String age=etAge.getText().toString();
            tvAge.setText("The Age is"+age);
            Toast.makeText(this, "The Age is"+age, Toast.LENGTH_SHORT).show();
            etAge.setText("");
        });
    }
}