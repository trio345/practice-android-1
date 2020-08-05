package id.co.mdd.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn_submit = (Button) findViewById(R.id.btn_go_result);

        if ( getIntent().getExtras() != null ) {
            Bundle bundle = getIntent().getExtras();
            AlertDialog.Builder dialog=new AlertDialog.Builder(SecondActivity.this);
            dialog.setMessage("Data kamu : " + bundle.getString("data1"));
            dialog.setTitle("Data Berhasil dikirim!");
            dialog.setPositiveButton("YES",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,
                                            int which) {
                            Toast.makeText(getApplicationContext(),"Yes is clicked",Toast.LENGTH_LONG).show();
                        }
                    });
            dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                }
            });
            AlertDialog alertDialog=dialog.create();
            alertDialog.show();
        } else {
            System.out.println(getIntent().getStringExtra("data1"));
        }

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, ResultActivity.class);
                startActivity(intent);
            }
        });

    }
}