package com.farrush.gw.quiz15jan_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.et);
        btn = (Button) findViewById(R.id.btn);
        txt = (TextView) findViewById(R.id.txt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = et.getText().toString();

                if(n.isEmpty()){
                    et.setError("Input The Number");
                }else{
                    int a = Integer.parseInt(n);
                    if(a > 5){
                        et.setError("Input Only Number 1-5");
                    }else if(a == 1){
                        txt.setText("Jurusan Manajemen Informatika");
                    }else if(a == 2){
                        txt.setText("Jurusan Teknik Komputer");
                    }else if(a == 3){
                        txt.setText("Jurusan Akutansi");
                    }else if(a == 4){
                        txt.setText("Jurusan Sistem Informasi");
                    }else if(a == 5){
                        txt.setText("Jurusan Tekologi Informasi");
                    }
                }
            }
        });
    }
}
