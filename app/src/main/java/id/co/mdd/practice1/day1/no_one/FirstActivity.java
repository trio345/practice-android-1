package id.co.mdd.practice1.day1.no_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import id.co.mdd.practice1.R;

public class FirstActivity extends AppCompatActivity {
    Button btn_send;
    EditText field_1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        final EditText data1 = (EditText) findViewById(R.id.field_text_1);
        final Button button1 = (Button) findViewById(R.id.btn_send);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("data1", data1.getText().toString());

                Intent intent = new Intent(FirstActivity.this, DetailActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });



    }
}