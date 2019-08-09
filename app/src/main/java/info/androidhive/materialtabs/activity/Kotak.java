package info.androidhive.materialtabs.activity;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;

public class Kotak extends AppCompatActivity {
    EditText s;
    Button Luas;
    Button Keliling;
    TextView hasil;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotak);

        setTitle("Persegi");
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        s = (EditText)findViewById(R.id.sisi);
        Luas = (Button) findViewById(R.id.button);
        Keliling = (Button)findViewById(R.id.keliling);
        hasil = (TextView)findViewById(R.id.txt_hasil);
        Luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.length()==0){
                    Toast.makeText(getApplication(),"sisi tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String isisisi = s.getText().toString();
                    double s = Double.parseDouble(isisisi);
                    double hs = LuasPersegi(s);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });

        Keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.length()==0 ){
                    Toast.makeText(getApplication(),"sisi tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String isisisi = s.getText().toString();
                    double s = Double.parseDouble(isisisi);
                    double hs = KelilingPersegi(s);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double LuasPersegi(double s){return s*s;}
    public double KelilingPersegi(double s){return 4*s;}

    public boolean onSupportNavigateUp(){
        finish();
        return  true;
    }
            }

