package sdu.comsci.orawon.bubbletea;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by macbookair on 5/1/17.
 */

public class Myadapter extends BaseAdapter {
    private Context context ;
    private  int [] ints;
    private String[] titleStrings ,detailStrings;

    public Myadapter (Context context,int[] ints, String[] titleStrings,String[] detailStrings){
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;

    }

    @Override
    public int getCount() {
        return ints.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.activity_menu,parent,false);

        ImageView imageView = (ImageView) view.findViewById(R.id.imvpicmenu);
        TextView titleTextView = (TextView) view.findViewById(R.id.txtMenuName);
        TextView detailTextView = (TextView) view.findViewById(R.id.txtMenuPrice);

        imageView.setImageResource(ints[position]);
        titleTextView.setText(titleStrings[position]);
        detailTextView.setText(detailStrings[position]);

        return view;

    }
}
