package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;


public class OneFragment extends Fragment{
    EditText txtAngka1, txtAngka2;
    Button btnTambah, btnKali, btnKurang, btnBagi;
    TextView txtHasil;
    double angkaPertama, angkaKedua, hasil;
    String sAngkaPertama, sAngkaKedua;
    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        // Inflate the layout for this fragment

                super.onCreate(savedInstanceState);
        txtAngka1 = view.findViewById(R.id.txtAngka1);
        txtAngka2 = view.findViewById(R.id.txtAngka2);
        btnTambah = view.findViewById(R.id.btntambah);
        btnKali = view.findViewById(R.id.btnkali);
        btnKurang = view.findViewById(R.id.btnkurang);
        btnBagi = view.findViewById(R.id.btnbagi);
        txtAngka1 = view.findViewById(R.id.txtAngka1);
        txtAngka2 = view.findViewById(R.id.txtAngka2);
        txtHasil = view.findViewById(R.id.text_view_hasil);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = txtAngka1.getText().toString();
                String angka2 = txtAngka2.getText().toString();

                if (angka1.equalsIgnoreCase("") || angka1.trim().isEmpty() || angka2.equalsIgnoreCase("") || angka2.trim().isEmpty()) {
                    Toast.makeText(getContext(), "no acces", Toast.LENGTH_LONG).show();
                } else {
                    double angkas1, angkas2, hasill;
                    angkas1 = Double.parseDouble(txtAngka1.getText().toString());
                    angkas2 = Double.parseDouble(txtAngka2.getText().toString());
                    hasill = angkas1 + angkas2;
                    txtHasil.setText("hasil dari " + angka1 + "+" + angka2 + "=" + hasill);
                }
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = txtAngka1.getText().toString();
                String angka2 = txtAngka2.getText().toString();

                if (angka1.equalsIgnoreCase("") || angka1.trim().isEmpty() || angka2.equalsIgnoreCase("") || angka2.trim().isEmpty()) {
                    Toast.makeText(getContext(), "no acces", Toast.LENGTH_LONG).show();

                }
                else {
                    double angkas1, angkas2, hasill;
                    angkas1 = Double.parseDouble(txtAngka1.getText().toString());
                    angkas2 = Double.parseDouble(txtAngka2.getText().toString());
                    hasill = angkas1 / angkas2;
                    if (angkas2 != 0) {

                        txtHasil.setText("hasil dari " + angka1 + ":" + angka2 + "=" + hasill);
                    }
                    else
                    {
                        Toast.makeText(getContext(), ": dilarang 0", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = txtAngka1.getText().toString();
                String angka2 = txtAngka2.getText().toString();

                if (angka1.equalsIgnoreCase("") || angka1.trim().isEmpty() || angka2.equalsIgnoreCase("") || angka2.trim().isEmpty()) {
                    Toast.makeText(getContext(), "no acces", Toast.LENGTH_LONG).show();

                } else {
                    double angkas1, angkas2, hasill;
                    angkas1 = Double.parseDouble(txtAngka1.getText().toString());
                    angkas2 = Double.parseDouble(txtAngka2.getText().toString());
                    hasill = angkas1 * angkas2;
                    txtHasil.setText("hasil dari " + angka1 + "x" + angka2 + "=" + hasill);
                }
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = txtAngka1.getText().toString();
                String angka2 = txtAngka2.getText().toString();

                if (angka1.equalsIgnoreCase("") || angka1.trim().isEmpty() || angka2.equalsIgnoreCase("") || angka2.trim().isEmpty()) {
                    Toast.makeText(getContext(), "no acces", Toast.LENGTH_LONG).show();

                } else {
                    double angkas1, angkas2, hasill;
                    angkas1 = Double.parseDouble(txtAngka1.getText().toString());
                    angkas2 = Double.parseDouble(txtAngka2.getText().toString());
                    hasill = angkas1 - angkas2;
                    txtHasil.setText("hasil dari " + angka1 + "-" + angka2 + "=" + hasill);
                }

            }
        });

        return view;
    }

}
