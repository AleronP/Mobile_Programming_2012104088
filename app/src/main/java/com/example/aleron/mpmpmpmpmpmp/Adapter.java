package com.example.aleron.mpmpmpmpmpmp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends PagerAdapter {

    Context context;
    List<Drawable> backgrounds;
    ArrayList<TextItems> textItems;

    public Adapter(List<Drawable> res, Context context, ArrayList<TextItems> texts) {
        textItems = new ArrayList<>();

        backgrounds = res;
        this.context = context;
        textItems = texts;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.pager_adapter, null);

        ImageView image_container = (ImageView)v.findViewById(R.id.image_container);
        TextView infoText = (TextView)v.findViewById(R.id.infoText);
        TextView whereText = (TextView)v.findViewById(R.id.whereText);
        ImageButton arrow_button = (ImageButton)v.findViewById(R.id.arrow_button);

        switch (position) {
            case 0:
                infoText.setText(textItems.get(0).getInfoText());
                whereText.setText(textItems.get(0).getWhereText());
                arrow_button.setImageDrawable(textItems.get(0).getArrow_button());
                break;
            case 1:
                infoText.setText(textItems.get(1).getInfoText());
                whereText.setText(textItems.get(1).getWhereText());
                arrow_button.setImageDrawable(textItems.get(1).getArrow_button());
                break;
            case 2:
                infoText.setText(textItems.get(2).getInfoText());
                whereText.setText(textItems.get(2).getWhereText());
                arrow_button.setImageDrawable(textItems.get(2).getArrow_button());
                break;
        }

        Glide.with(context).load(backgrounds.get(position)).into(image_container);
        container.addView(v);

        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(((View)object));
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    public int getCount() {
        return backgrounds.size();
    }
}
