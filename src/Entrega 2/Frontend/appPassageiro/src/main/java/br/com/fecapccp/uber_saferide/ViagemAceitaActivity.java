package br.com.fecapccp.uber_saferide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ViagemAceitaActivity extends AppCompatActivity {

    private Button btnTViagemAceitaSet;
    private Button btnCancelarViagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_viagem_aceita);

        btnTViagemAceitaSet = findViewById(R.id.btnTViagemAceitaSet);
        btnCancelarViagem = findViewById(R.id.btnCancelarViagem);

        btnTViagemAceitaSet.setOnClickListener(view -> {
            Intent intent = new Intent(this, MetodoPagamento.class);
            startActivity(intent);
        });
        btnCancelarViagem.setOnClickListener(view -> {
            finish();
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
