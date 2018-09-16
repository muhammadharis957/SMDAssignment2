package com.example.harisatdevrec.smdassignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SignupConstraint extends AppCompatActivity implements View.OnClickListener{

    private EditText email;
    private EditText password;
    private RadioGroup radioSexGroup;
    private RadioButton radioSexButton;
    private Button registerButton;
    private CheckBox checkBox;

    private String emailString;
    private String passwordString;
    private String gender;
    private String checkBoxString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_constraint);

        email = findViewById(R.id.emailEditText2);
        password = findViewById(R.id.passwordEditText2);
        registerButton = findViewById(R.id.registerButton2);
        registerButton.setOnClickListener(this);

        radioSexGroup = findViewById(R.id.radioGrp2);
        int selectedId = radioSexGroup.getCheckedRadioButtonId();
        radioSexButton = findViewById(selectedId);
        gender = radioSexButton.getText().toString().trim();

        emailString = email.getText().toString();
        passwordString = password.getText().toString();

        checkBox = findViewById(R.id.checkBox2);
    }

    @Override
    public void onClick(View view) {
        if (view == registerButton)
        {
            if(checkBox.isChecked()) {
                Toast.makeText(this, email.getText() + "\n" + password.getText() + "\n" + gender + "\n", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(this, "Please Accept Terms and Conditions before Registering ", Toast.LENGTH_SHORT).show();
            }
        }

    }
}
