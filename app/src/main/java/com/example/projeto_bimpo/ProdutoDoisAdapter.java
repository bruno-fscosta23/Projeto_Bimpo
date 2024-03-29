package com.example.projeto_bimpo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class ProdutoDoisAdapter extends RecyclerView.Adapter<ProdutoDoisAdapter.MyViewHolder> {

    private Context mContextDois;
    private List<ProdutosDois> mData;

    public ProdutoDoisAdapter (Context mContext, List<ProdutosDois> mData){
        this.mContextDois = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater mInflate = LayoutInflater.from(mContextDois);
        view = mInflate.inflate(R.layout.card_view_produtos_dois,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position){

        holder.nProdutoDois.setText(mData.get(position).getnProDois());
        holder.dProdutoDois.setText(mData.get(position).getdProDois());
        holder.imgProdutoDois.setImageResource(mData.get(position).getImgProdDois());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContextDois,Recebe_Prod_Activity.class);

                intent.putExtra("nProdDois",mData.get(position).getnProDois());
                intent.putExtra("dProdDois",mData.get(position).getdProDois());
                intent.putExtra("cProdDois",mData.get(position).getcProDois());
                intent.putExtra("imgProdDois",mData.get(position).getImgProdDois());
                mContextDois.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nProdutoDois,dProdutoDois;
        ImageView imgProdutoDois;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nProdutoDois = (TextView)itemView.findViewById(R.id.nProdutoDois);
            dProdutoDois = (TextView)itemView.findViewById(R.id.dProdutoDois);
            imgProdutoDois = (ImageView)itemView.findViewById(R.id.imgProdutoDois);
            cardView = (CardView)itemView.findViewById(R.id.idCardViewDois);
        }
    }
}
