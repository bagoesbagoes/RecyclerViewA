package com.chrisantusbagus202102312.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class NegaraAdapter extends RecyclerView.Adapter<NegaraViewHolder>
{
    private Context _context;
    private List<NegaraModel> _negaraModellist;

    public NegaraAdapter(Context context, List<NegaraModel> negaraModelList)
    {
        this._context = context;
        this._negaraModellist = negaraModelList;
    }

    @NonNull
    @Override
    public NegaraViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.layout_negara, parent, false);
        return new NegaraViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NegaraViewHolder holder, int position)
    {
        NegaraModel nm = _negaraModellist.get(position);
        Picasso.with(_context).load(nm.getUrl()). into(holder._ImageView1);
        holder._NamaTextView.setText(nm.getNama());
        holder._DeskripsiTextView.setText(nm.getDeskripsi());
    }

    @Override
    public int getItemCount()
    {
        int itemCount = 0;

        if (_negaraModellist!= null)
        {
            itemCount = _negaraModellist.size();
        }
        return itemCount;
    }
}
