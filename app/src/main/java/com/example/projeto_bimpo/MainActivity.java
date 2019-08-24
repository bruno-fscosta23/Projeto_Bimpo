package com.example.projeto_bimpo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Produtos> lstProdutos;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstProdutos = new ArrayList<>();
        lstProdutos.add(new Produtos("Nescafé","Descrição do Produto","Descrição do Produts",R.drawable.imgnescafe));
        lstProdutos.add(new Produtos("Banana", "Descrição do Produto","Descrição do Produto",R.drawable.banana));

        RecyclerView recyclerView =(RecyclerView) findViewById(R.id.id_recycleView);
        ProdutosAdapter mAdapter = new ProdutosAdapter(getApplicationContext(),lstProdutos);
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        recyclerView.setAdapter(mAdapter);
    }
}
