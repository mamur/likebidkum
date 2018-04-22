package com.jasakreatif.bidkum.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.jasakreatif.bidkum.R;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hadiana on 3/18/2018.
 */

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {

    List<hadiana> mItems;

    public GridAdapter() {
        super();
        mItems = new ArrayList<hadiana>();
        hadiana nama = new hadiana();
        nama.setName("Surat Al-Fatihah Ayat 1-7");
        nama.setThumbnail(R.drawable.icon);
        mItems.add(nama);

        nama = new hadiana();
        nama.setName("Surat Al-Maidah Ayat 1-10");
        nama.setThumbnail(R.drawable.icon);
        mItems.add(nama);

        nama = new hadiana();
        nama.setName("Surat Al-Baqoroh Ayat 1-10");
        nama.setThumbnail(R.drawable.icon);
        mItems.add(nama);

        nama = new hadiana();
        nama.setName("Surat Yasin Ayat 1-100");
        nama.setThumbnail(R.drawable.icon);
        mItems.add(nama);

        nama = new hadiana();
        nama.setName("Surat Al-Maidah Ayat 1-10");
        nama.setThumbnail(R.drawable.icon);
        mItems.add(nama);

        nama = new hadiana();
        nama.setName("Surat Al-Baqoroh Ayat 1-10");
        nama.setThumbnail(R.drawable.icon);
        mItems.add(nama);

        nama = new hadiana();
        nama.setName("Surat Yasin Ayat 1-100");
        nama.setThumbnail(R.drawable.icon);
        mItems.add(nama);

        nama = new hadiana();
        nama.setName("Surat Al-Maidah Ayat 1-10");
        nama.setThumbnail(R.drawable.icon);
        mItems.add(nama);

        nama = new hadiana();
        nama.setName("Surat Al-Baqoroh Ayat 1-10");
        nama.setThumbnail(R.drawable.icon);
        mItems.add(nama);

        nama = new hadiana();
        nama.setName("Surat Yasin Ayat 1-100");
        nama.setThumbnail(R.drawable.icon);
        mItems.add(nama);

        nama = new hadiana();
        nama.setName("Surat Al-Maidah Ayat 1-10");
        nama.setThumbnail(R.drawable.icon);
        mItems.add(nama);

        nama = new hadiana();
        nama.setName("Surat Al-Baqoroh Ayat 1-10");
        nama.setThumbnail(R.drawable.icon);
        mItems.add(nama);

        nama = new hadiana();
        nama.setName("Surat Yasin Ayat 1-100");
        nama.setThumbnail(R.drawable.icon);
        mItems.add(nama);

        nama = new hadiana();
        nama.setName("Surat Al-Maidah Ayat 1-10");
        nama.setThumbnail(R.drawable.icon);
        mItems.add(nama);

        nama = new hadiana();
        nama.setName("Surat Al-Baqoroh Ayat 1-10");
        nama.setThumbnail(R.drawable.icon);
        mItems.add(nama);

        nama = new hadiana();
        nama.setName("Surat Yasin Ayat 1-100");
        nama.setThumbnail(R.drawable.icon);
        mItems.add(nama);

        nama = new hadiana();
        nama.setName("Surat Al-Maidah Ayat 1-10");
        nama.setThumbnail(R.drawable.icon);
        mItems.add(nama);

        nama = new hadiana();
        nama.setName("Surat Al-Baqoroh Ayat 1-10");
        nama.setThumbnail(R.drawable.icon);
        mItems.add(nama);

        nama = new hadiana();
        nama.setName("Surat Yasin Ayat 1-100");
        nama.setThumbnail(R.drawable.icon);
        mItems.add(nama);

        nama = new hadiana();
        nama.setName("Surat Al-Maidah Ayat 1-10");
        nama.setThumbnail(R.drawable.icon);
        mItems.add(nama);

        nama = new hadiana();
        nama.setName("Surat Al-Baqoroh Ayat 1-10");
        nama.setThumbnail(R.drawable.icon);
        mItems.add(nama);

        nama = new hadiana();
        nama.setName("Surat Yasin Ayat 1-100");
        nama.setThumbnail(R.drawable.icon);
        mItems.add(nama);


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_view, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        hadiana nature = mItems.get(i);
        viewHolder.tvspecies.setText(nature.getName());
        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());
    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder  {


        public ImageView imgThumbnail;
        public TextView tvspecies;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            tvspecies = (TextView)itemView.findViewById(R.id.status);

        }
    }
}
