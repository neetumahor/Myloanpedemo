package com.example.myloanpedemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class MainAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private String[] loans;
    private int[] imageno;

    public MainAdapter(Context c, String[] loans, int[] imageno)
    {
        context=c;
        this.loans=loans;
        this.imageno=imageno;

    }

    @Override
    public int getCount() {
        return loans.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (inflater==null)
        {
            inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(view==null) {
            view = inflater.inflate(R.layout.row_item, null);
        }
        ImageView imageView=view.findViewById(R.id.img4);
        TextView textView=view.findViewById(R.id.textrow);

        imageView.setImageResource(imageno[i]);
        textView.setText(loans[i]);
        return view;
    }
}
