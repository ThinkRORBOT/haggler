package com.example.ming.haggler;

/**
 * Created by Ming on 3/05/2017.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomAdapter extends BaseAdapter{
    String [] result;
    Context context;
    int [] imageId;
    private static LayoutInflater inflater=null;
    //Constructors to initialise data depending on the activity that called it
    public CustomAdapter(EssentialCitiesActivity essentialCitiesActivity, String[] cities, int[] cityImages) {

        result=cities;
        context= essentialCitiesActivity;
        imageId=cityImages;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    public CustomAdapter(MarketCitiesActivity marketCitiesActivity, String[] cities, int[] cityImages) {

        result=cities;
        context= marketCitiesActivity;
        imageId=cityImages;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView tv;
        ImageView img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        //new holder object
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.cities_list, null);
        //sets the attributes of holder to values in array
        //returns a view so it can be used in the list view of the previous object
        holder.tv=(TextView) rowView.findViewById(R.id.textView1);
        holder.img=(ImageView) rowView.findViewById(R.id.imageView1);
        holder.tv.setText(result[position]);
        holder.img.setImageResource(imageId[position]);

        return rowView;
    }

}