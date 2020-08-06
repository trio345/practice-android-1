package id.co.mdd.practice1.day1.no_two;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import id.co.mdd.practice1.R;

public class ResultActivity extends AppCompatActivity {
    Button btn_submit;
    TextView data_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        btn_submit = (Button) findViewById(R.id.btn_submit);
        data_send = (TextView) findViewById(R.id.field_text_2);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("data1", data_send.getText().toString());

                Intent intent = new Intent(ResultActivity.this, SecondActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}