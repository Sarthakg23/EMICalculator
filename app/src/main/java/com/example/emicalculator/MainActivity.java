package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.WindowDecorActionBar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b=(Button)findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText p=(EditText)findViewById(R.id.p);
                EditText r=(EditText)findViewById(R.id.r);
                EditText t=(EditText)findViewById(R.id.t);
                if(p.getText().toString()==""||r.getText().toString()==""||t.getText().toString()=="")
                {
                    Toast.makeText(getApplicationContext(),"All Fields Are Mandatory!",Toast.LENGTH_SHORT).show();
                }
                else {
                    TextView res = (TextView) findViewById(R.id.res);
                    double pr = Double.parseDouble(p.getText().toString());
                    double ra = Double.parseDouble(r.getText().toString());
                    int ti = Integer.parseInt(t.getText().toString());
                    ra = ra / 1200;
                    double emi = (pr * ra * Math.pow(1 + ra, ti)) / (Math.pow(1 + ra, ti )- 1);
                    String result = "EMI is "+Double.toString(emi);
                    res.setText(result);
                }
            }
        });
    }
}
