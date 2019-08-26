package com.example.projeto_bimpo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Recebe_Prod_Activity extends AppCompatActivity {

    private TextView txtProduto,txtDescricao;
    private ImageView imgProduto;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recebe_prod_layout);

        txtProduto = (TextView)findViewById(R.id.txtRecProd);
        txtDescricao = (TextView)findViewById(R.id.txtProduct);
        imgProduto = (ImageView)findViewById(R.id.id_imgProd);

        Intent intent = getIntent();
        String nProduto = intent.getExtras().getString("nProduto");
        String dProduto = intent.getExtras().getString("dProduto");
        String nProdDois = intent.getExtras().getString("nProdDois");
        String dProdDois = intent.getExtras().getString("dProdDois");
        int imgProdudo = intent.getExtras().getInt("imgProduto");
        int imgProdDois = intent.getExtras().getInt("imgProdDois");

        txtProduto.setText(nProduto);
        txtDescricao.setText(dProduto);
        imgProduto.setImageResource(imgProdudo);
        txtProduto.setText(nProdDois);
        txtDescricao.setText(dProdDois);
        imgProduto.setImageResource(imgProdDois);
    }
}
