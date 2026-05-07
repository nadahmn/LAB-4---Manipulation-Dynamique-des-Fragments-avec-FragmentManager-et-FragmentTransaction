package com.example.lab4_fragmentslab;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private FragmentTwo fragmentTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btnFragment1);
        Button btn2 = findViewById(R.id.btnFragment2);

        // Créer le fragment
        fragmentTwo = new FragmentTwo();

        // Charger le fragment
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragmentTwo)
                .commit();

        // Bouton Fragment 1 → Valeur 0
        btn1.setOnClickListener(v -> {
            if (fragmentTwo != null) {
                fragmentTwo.setValeur(0);
            }
        });

        // Bouton Fragment 2 → Valeur 37
        btn2.setOnClickListener(v -> {
            if (fragmentTwo != null) {
                fragmentTwo.setValeur(37);
            }
        });
    }
}