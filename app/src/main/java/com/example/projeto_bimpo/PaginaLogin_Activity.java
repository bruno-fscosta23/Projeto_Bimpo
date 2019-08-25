package com.example.projeto_bimpo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PaginaLogin_Activity extends AppCompatActivity {

    EditText txtUsuario, txtSenha;
    Button btnEntrar;

    public static final String EXTRA_MESSAGE = "br.sp.senac.appvalidausuario.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_login_layout);

        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtSenha = (EditText) findViewById(R.id.txtSenha);
        btnEntrar = (Button) findViewById(R.id.btnLogin);
        txtUsuario.requestFocus();

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario, senha;
                usuario = txtUsuario.getText().toString();
                senha = txtSenha.getText().toString();

                if (usuario.equals("senac") && (senha.equals("senac"))) {
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);

                    String message = txtUsuario.getText().toString();
                    intent.putExtra(EXTRA_MESSAGE,message);

                    startActivity(intent);
                    finish();
                }else {
                    Toast.makeText(getApplicationContext(),"Usuário Inválido",Toast.LENGTH_SHORT).show();
                    txtUsuario.setText("");
                    txtSenha.setText("");
                    txtUsuario.requestFocus();
                }
            }
        });

    }
}
