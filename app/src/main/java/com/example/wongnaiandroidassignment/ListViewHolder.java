/**
 * Natapatchara Anuroje (นาย ณัฐพัชร อนุโรจน์)
 * Email: natapatchara.anuroje@gmail.com
 * LINE MAN Wongnai Junior 2022 - Engineering Team
 * Assignment for the Intern-Software Engineer, Android
 */
package com.example.wongnaiandroidassignment;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

import android.content.Context;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.example.wongnaiandroidassignment.Model.CoinsItem;

import java.util.List;

public class ListViewHolder extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private static final String TAG = "ListViewHolder";
    Context context;
    List<CoinsItem> items;
    private RequestBuilder<PictureDrawable> requestBuilder;

    public ListViewHolder(Context context, List<CoinsItem> coins) {
        this.context = context;
        this.items = coins;

        requestBuilder =
                GlideApp.with(context)
                        .as(PictureDrawable.class)
                        .placeholder(R.drawable.image_loading)
                        .error(R.drawable.image_error)
                        .transition(withCrossFade())
                        .listener(new SvgSoftwareLayerSetter());
    }

    @Override
    public int getItemViewType(int position) {
        return (position + 1) % 5;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;

        if (viewType == 0) {
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item2, parent, false);
            return new CoinViewHolder0(v);
        } else {
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item1, parent, false);
            return new CoinViewHolder5(v);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        CoinsItem item = items.get(position);
        int index = item.getIconUrl().lastIndexOf(".");
        String last = item.getIconUrl().substring(index + 1, item.getIconUrl().length());

        if (holder.getItemViewType() == 0){
            CoinViewHolder0 holder0 = (CoinViewHolder0)holder;
            holder0.tvLink.setText(item.getCoinrankingUrl());
            holder0.tvSymbol.setText(item.getSymbol());
            if (last == "svg") {
                requestBuilder.load(Uri.parse(item.getIconUrl())).override(50,50).into(holder0.mImageView);
            } else {
                Glide.with(context)
                    .load(Uri.parse(item.getIconUrl()))
                        .override(50,50)
                    .fitCenter()
                    .centerCrop()
                    .into(holder0.mImageView);
            }

        } else {
            CoinViewHolder5 holder5 = (CoinViewHolder5)holder;
            holder5.tvName.setText(item.getName());
            holder5.tvSymbol.setText(item.getSymbol());
            if (last == "svg") {
                requestBuilder.load(Uri.parse(item.getIconUrl())).override(50,50).into(holder5.mImageView);
            } else {
            Glide.with(context)
                    .load(Uri.parse(item.getIconUrl()))
                    .override(50,50)
                    .fitCenter()
                    .centerCrop()
                    .into(holder5.mImageView);
            }
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

   public static class CoinViewHolder0 extends RecyclerView.ViewHolder {
        TextView tvSymbol;
        TextView tvLink;
        ImageView mImageView;

        public CoinViewHolder0(@NonNull View itemView) {
            super(itemView);
            tvSymbol = itemView.findViewById(R.id.coin_symbol);
            tvLink = itemView.findViewById(R.id.coin_link);
            mImageView = itemView.findViewById(R.id.coin_icon);
        }
    }

    public static class CoinViewHolder5 extends RecyclerView.ViewHolder {
        TextView tvSymbol;
        TextView tvName;
        ImageView mImageView;

        public CoinViewHolder5(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.coin_name);
            tvSymbol = itemView.findViewById(R.id.coin_symbol);
            mImageView = itemView.findViewById(R.id.coin_icon);
        }
    }
}
