package com.example.harisatdevrec.smdassignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button conButton;
    private Button relButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        conButton = findViewById(R.id.conButton);
        relButton = findViewById(R.id.relButton);


        conButton.setOnClickListener(this);
        relButton.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        if(view == relButton)
        {
            finish();
            startActivity(new Intent(this, SignupRelative.class));
        }
        else if(view == conButton)
        {
            finish();
            startActivity(new Intent (this, SignupConstraint.class));

        }
    }
}
