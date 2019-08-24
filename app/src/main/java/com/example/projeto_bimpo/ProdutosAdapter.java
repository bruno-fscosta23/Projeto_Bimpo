package com.example.projeto_bimpo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProdutosAdapter extends RecyclerView.Adapter<ProdutosAdapter.MyViewHolder> {

    private Context mContext;
    private List<Produtos> mData;

    public ProdutosAdapter(Context mContext,List<Produtos>mData){
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater mInflate = LayoutInflater.from(mContext);
        view = mInflate.inflate(R.layout.card_view_produtos,parent,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textProduto.setText(mData.get(position).getnProduto());
        holder.imgProduto.setImageResource(mData.get(position).getImgProduto());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textProduto;
        ImageView imgProduto;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textProduto = (TextView)itemView.findViewById(R.id.nProduto);
            imgProduto = (ImageView)itemView.findViewById(R.id.imgProduto);

        }
    }
}
