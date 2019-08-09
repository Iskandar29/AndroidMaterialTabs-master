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

public class lingkaran extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    EditText r;
    Button Luas;
    Button Keliling;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        setTitle("Lingkaran");
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        r = (EditText)findViewById(R.id.jari);
        Luas = (Button) findViewById(R.id.button);
        Keliling = (Button)findViewById(R.id.keliling);
        hasil = (TextView)findViewById(R.id.txt_hasil);
        Luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r.length()==0){
                    Toast.makeText(getApplication(),"sisi tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String isisisi = r.getText().toString();
                    double r = Double.parseDouble(isisisi);
                    double hs = LuasPersegi(r);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });

        Keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r.length()==0 ){
                    Toast.makeText(getApplication(),"sisi tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String isisisi = r.getText().toString();
                    double r = Double.parseDouble(isisisi);
                    double hs = KelilingPersegi(r);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double LuasPersegi(double r){return 3.14*r*r;}
    public double KelilingPersegi(double r){return 2*3.14*r;}

public boolean onSupportNavigateUp(){
        finish();
        return  true;
}
}



