package com.tct.myapplication.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.tct.myapplication.R;
import com.tct.myapplication.mode.CategoriesDomain;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    ArrayList<CategoriesDomain> arrayList = new ArrayList<>();

    public CategoryAdapter(ArrayList<CategoriesDomain> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(arrayList.get(position).getTile());
        holder.imageView.setImageResource(R.drawable.cat_1);
//        Log.d("THanhkhie", arrayList.get(position).getImg()+"");
//        Glide.with(holder.itemView.getContext())
//                .load(R.drawable.cat_1)
//                .into(holder.imageView);
        if (position % 2 == 0)
            holder.constraintLayout.setBackground(ContextCompat.getDrawable(holder.textView.getContext(), R.drawable.cart_background));
        else
            holder.constraintLayout.setBackground(ContextCompat.getDrawable(holder.textView.getContext(), R.drawable.cart_background_xanh));

//        int drawResourId = holder.itemView.getContext().getResources().getIdentifier()

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView imageView;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView6);
            imageView = itemView.findViewById(R.id.imageView5);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}
