package id.co.mdd.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textView1 = (TextView) findViewById(R.id.text_view_1);

        if ( getIntent().getExtras() != null ) {
            Bundle bundle = getIntent().getExtras();
            textView1.setText(bundle.getString("data1"));
        } else {
            textView1.setText(getIntent().getStringExtra("data1"));
        }
    }
}