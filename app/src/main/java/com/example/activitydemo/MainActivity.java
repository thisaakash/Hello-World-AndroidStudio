package com.example.activitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btnOK);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    editText = (EditText) findViewById(R.id.edtName);
                    String str = editText.getText().toString();
                    result = (TextView) findViewById(R.id.tvResult);
                    result.setText("Welcome " +str);
                Toast.makeText( MainActivity.this, "Yes Notification Comming!!!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

