package id.co.mdd.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.Validator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity{
    EditText emailField = (EditText) findViewById(R.id.email);
    EditText passwordField = (EditText) findViewById(R.id.password);
    Button loginButton = (Button) findViewById(R.id.btn_login);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

//        loginButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                String email = emailField.getText().toString();
////                String password = passwordField.getText().toString();
////
////                if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
////                    emailField.setError("enter a valid email address");
////                } else {
////                    emailField.setError(null);
////                }
////
////                if (password.isEmpty() || password.length() < 8 || password.length() > 20) {
////                    passwordField.setError("between 8 and 20 alphanumeric characters");
//////            valid = false;
////                } else {
////                    passwordField.setError(null);
////                }
//            }
//        });
    }
}