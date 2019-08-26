package com.example.projeto_bimpo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Produtos> lstProdutos;
    List<ProdutosDois> lstProdutosDois;

    Toolbar toolbar;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.id_ToobarCarrinho);
        setSupportActionBar(toolbar);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");


        lstProdutos = new ArrayList<>();
        lstProdutos.add(new Produtos("Nescafé","420g","420g",R.drawable.imgnescafe));
        lstProdutos.add(new Produtos("Banana", "1 Duzia","Descrição do Produto",R.drawable.banana));



        RecyclerView recyclerView =(RecyclerView) findViewById(R.id.id_recycleView);
        ProdutosAdapter mAdapter = new ProdutosAdapter(getApplicationContext(),lstProdutos);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(mAdapter);

        //Novo RecycleView

        lstProdutosDois = new ArrayList<>();
        lstProdutosDois.add(new ProdutosDois("Ades","500ml","500ml",R.drawable.imgades));
        lstProdutosDois.add(new ProdutosDois("Nescau","420g","420g",R.drawable.imgnescau));
        lstProdutosDois.add(new ProdutosDois("Ades", "500ml", "500ml", R.drawable.imgades));
        lstProdutosDois.add(new ProdutosDois("Nescau", "420g", "420g", R.drawable.imgnescau));

        RecyclerView recyclerView1 = (RecyclerView) findViewById(R.id.id_recycleViewDois);
        ProdutoDoisAdapter mAdapterDois = new ProdutoDoisAdapter(getApplicationContext(),lstProdutosDois);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView1.setAdapter(mAdapterDois);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_carrinho,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.id_menuCarrinho:
                Toast.makeText(getApplicationContext(),"Cliquei no Carrinho",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

}
