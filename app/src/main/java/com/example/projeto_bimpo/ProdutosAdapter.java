package com.example.projeto_bimpo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
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
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.nProduto.setText(mData.get(position).getnProduto());
        holder.dProduto.setText(mData.get(position).getdProduto());
        holder.imgProduto.setImageResource(mData.get(position).getImgProduto());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext,Recebe_Prod_Activity.class);

                intent.putExtra("nProduto",mData.get(position).getnProduto());
                intent.putExtra("dProduto",mData.get(position).getdProduto());
                intent.putExtra("cProduto",mData.get(position).getcProduto());
                intent.putExtra("imgProduto",mData.get(position).getImgProduto());
                mContext.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView nProduto,dProduto;
        Button btnProduto;
        ImageView imgProduto;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nProduto = (TextView)itemView.findViewById(R.id.nProduto);
            dProduto = (TextView)itemView.findViewById(R.id.dProduto);
            btnProduto = (Button)itemView.findViewById(R.id.btnProduto);
            imgProduto = (ImageView)itemView.findViewById(R.id.imgProduto);
            cardView = (CardView)itemView.findViewById(R.id.idCardView);

        }
    }
}
