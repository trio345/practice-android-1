package id.co.mdd.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.Validator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity{
    String correctPwd = "12345678";
    String correctEmail = "trios@gmail.com"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        final EditText emailField = (EditText) findViewById(R.id.email);
        final EditText passwordField = (EditText) findViewById(R.id.password);
        final Button loginButton = (Button) findViewById(R.id.btn_login);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailField.getText().toString();
                String password = passwordField.getText().toString();

                if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    emailField.setError("enter a valid email address");
                } else {
                    emailField.setError(null);
                }

                if (email != correctEmail && password != correctPwd){
                    emailField.setError("Your email and password didn't registed");
                } else {
                    Intent intent = new Intent(ThirdActivity.this, HomeActivity.class);
                    startActivity(intent);
                }

                if (password.isEmpty() || password.length() < 8 || password.length() > 20) {
                    passwordField.setError("between 8 and 20 alphanumeric characters");
//            valid = false;
                } else {
                    passwordField.setError(null);
                }
            }
        });
    }
}