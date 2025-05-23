package br.com.fecapccp.uber_saferide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TelaLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Ocultar a barra de status e colocar o app em tela cheia
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_login);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView txtCriarConta = findViewById(R.id.tvCriarConta);
        txtCriarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaLogin.this, TelaCadastro.class);
                startActivity(intent);
            }
        });

        Button btnIniciarViagem = findViewById(R.id.btnLogin);
        btnIniciarViagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaLogin.this, IniciarViagem.class);
                startActivity(intent);
            }
        });

    }

    public void onInputClick(View view) {
        Toast.makeText(this, "Campo selecionado!", Toast.LENGTH_SHORT).show();
    }

    public void onLoginClick(View view) {
        Toast.makeText(this, "Botão de Login pressionado!", Toast.LENGTH_SHORT).show();
    }
    /*    public void onCriarContaClick(View view) {
        Toast.makeText(this, "Criar Conta clicado!", Toast.LENGTH_SHORT).show();
    }*/
}
