package com.androidtalk.atzcomputerfullform.adaptor;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.androidtalk.atzcomputerfullform.R;
import com.androidtalk.atzcomputerfullform.models.AbbreviationModel;

import java.util.ArrayList;

public class AbbreviationAdaptor extends RecyclerView.Adapter<AbbreviationAdaptor.MyViewHolder> {
    private Context mContext;
    private ArrayList<AbbreviationModel> mAbbreviationModelArrayList;

    public AbbreviationAdaptor(Context context, ArrayList<AbbreviationModel> mAbbreviationModelArrayList) {
        this.mContext = context;
        this.mAbbreviationModelArrayList = mAbbreviationModelArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // infalte the item Layout
        View v = LayoutInflater.from(mContext).inflate(R.layout.child_view, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        if (mAbbreviationModelArrayList.get(position).getAbbreviation().length() == 1) {
            holder.abbreviationTV.setText(mAbbreviationModelArrayList.get(position).getAbbreviation());
            holder.fullFormTV.setText(mAbbreviationModelArrayList.get(position).getFullForm());
            holder.fullFormTV.setTypeface(null, Typeface.BOLD);
            holder.fullFormTV.setBackgroundColor(mAbbreviationModelArrayList.get(position).getColorCode());
            holder.abbreviationTV.setBackgroundColor(mAbbreviationModelArrayList.get(position).getColorCode());
        } else {
            holder.abbreviationTV.setText(mAbbreviationModelArrayList.get(position).getAbbreviation());
            holder.fullFormTV.setText(mAbbreviationModelArrayList.get(position).getFullForm());
            holder.fullFormTV.setTypeface(null, Typeface.NORMAL);
            holder.fullFormTV.setBackgroundColor(mContext.getResources().getColor(R.color.white));
            holder.abbreviationTV.setBackgroundColor(mContext.getResources().getColor(R.color.white));
        }
    }

    @Override
    public int getItemCount() {
        return mAbbreviationModelArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView abbreviationTV;
        TextView fullFormTV;

        public MyViewHolder(View itemView) {
            super(itemView);
            // get the reference of item view's
            abbreviationTV = (TextView) itemView.findViewById(R.id.tv_abbreviation);
            fullFormTV = (TextView) itemView.findViewById(R.id.tv_fullform);
        }
    }
}