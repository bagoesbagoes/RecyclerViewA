package com.chrisantusbagus202102312.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class NegaraViewHolder extends RecyclerView.ViewHolder
{
    public ImageView _ImageView1;
    public TextView _DeskripsiTextView;
    public TextView _NamaTextView;

    public NegaraViewHolder(View itemView)
    {
        super(itemView);

        _ImageView1 = (ImageView) itemView.findViewById(R.id.ImageView1);
        _NamaTextView = (TextView) itemView.findViewById(R.id.NamaTextView);
        _DeskripsiTextView = (TextView) itemView.findViewById(R.id.DeskripsiTextView);
    }
}
