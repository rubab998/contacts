package com.example.contacts;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
public class ListViewAdapter extends BaseAdapter {
    //variable
    Context mContext;
    LayoutInflater inflater;
    List<Model> modelList;
    ArrayList<Model> arrayList;
    public ListViewAdapter(Context context, List<Model> modelList) {
        this.mContext = context;
        this.modelList = modelList;
        inflater = LayoutInflater.from(mContext);
        this.arrayList= new ArrayList<Model>();
        this.arrayList.addAll(modelList);
    }
    public class ViewHolder{
        TextView jtitletv, jdesctv;
        ImageView jiconIv;
    }
    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public Object getItem(int position) {
        return modelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView==null)
        {
            holder=new ViewHolder();
            convertView = inflater.inflate(R.layout.rows,null);

            //locate the views in rows.xml;
            holder.jtitletv = convertView.findViewById(R.id.jobtitle);
            holder.jiconIv = convertView.findViewById(R.id.jobicon);
            holder.jdesctv = convertView.findViewById(R.id.jobdesc);
            convertView.setTag(holder);


        }
        else
        {
            holder = (ViewHolder)convertView.getTag();
        }
        //set the results into text views
        holder.jtitletv.setText(modelList.get(position).getTitle());
        holder.jdesctv.setText(modelList.get(position).getDesc());
        //set result on image view
        holder.jiconIv.setImageResource(modelList.get(position).getIcon());
        convertView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View convertView )
            {
                if(modelList.get(position).getTitle().equals("colleague")) {
                    //start new activity with title for actionbar and text for text view
                    Intent intent = new Intent(mContext, Main2Activity.class);
                    intent.putExtra("actionBarTitle", " ");
                    intent.putExtra("name", " Colleague");
                    intent.putExtra("cphone", " +92 32377565");
                    intent.putExtra("phtype", " Mobile");
                    intent.putExtra("add", " 123@gmail.com");
                    intent.putExtra("addr", " Personal");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTitle().equals("teacher")) {
                    //start new activity with title for actionbar and text for text view
                    Intent intent = new Intent(mContext, Main2Activity.class);
                    intent.putExtra("actionBarTitle", " ");
                    intent.putExtra("name", " Teacher");
                    intent.putExtra("cphone", " +92 32377565");
                    intent.putExtra("phtype", " Mobile");
                    intent.putExtra("add", " 123@gmail.com");
                    intent.putExtra("addr", " Personal");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTitle().equals("friend")) {
                    //start new activity with title for actionbar and text for text view
                    Intent intent = new Intent(mContext, Main2Activity.class);
                    intent.putExtra("actionBarTitle", " ");
                    intent.putExtra("name", " Friend");
                    intent.putExtra("cphone", " +92 32377565");
                    intent.putExtra("phtype", " Mobile");
                    intent.putExtra("add", " 123@gmail.com");
                    intent.putExtra("addr", " Personal");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTitle().equals("brother")) {
                    //start new activity with title for actionbar and text for text view
                    Intent intent = new Intent(mContext, Main2Activity.class);
                    intent.putExtra("actionBarTitle", " ");
                    intent.putExtra("name", " Brother");
                    intent.putExtra("cphone", " +92 32377565");
                    intent.putExtra("phtype", " Mobile");
                    intent.putExtra("add", " 123@gmail.com");
                    intent.putExtra("addr", " Personal");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTitle().equals("mother")) {
                    //start new activity with title for actionbar and text for text view
                    Intent intent = new Intent(mContext, Main2Activity.class);
                    intent.putExtra("actionBarTitle", " ");
                    intent.putExtra("name", " Mother");
                    intent.putExtra("cphone", " +92 32377565");
                    intent.putExtra("phtype", " Mobile");
                    intent.putExtra("add", " 123@gmail.com");
                    intent.putExtra("addr", " Personal");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTitle().equals("father")) {
                    //start new activity with title for actionbar and text for text view
                    Intent intent = new Intent(mContext, Main2Activity.class);
                    intent.putExtra("actionBarTitle", " ");
                    intent.putExtra("name", " Father");
                    intent.putExtra("cphone", " +92 32377565");
                    intent.putExtra("phtype", " Mobile");
                    intent.putExtra("add", " 123@gmail.com");
                    intent.putExtra("addr", " Personal");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTitle().equals("sister")) {
                    //start new activity with title for actionbar and text for text view
                    Intent intent = new Intent(mContext, Main2Activity.class);
                    intent.putExtra("actionBarTitle", " ");
                    intent.putExtra("name", " Sister");
                    intent.putExtra("cphone", " +92 32377565");
                    intent.putExtra("phtype", " Mobile");
                    intent.putExtra("add", " 123@gmail.com");
                    intent.putExtra("addr", " Personal");
                    mContext.startActivity(intent);
                }

                if(modelList.get(position).getTitle().equals("contact8")) {
                    //start new activity with title for actionbar and text for text view
                    Intent intent = new Intent(mContext, Main2Activity.class);
                    intent.putExtra("actionBarTitle", " ");
                    intent.putExtra("name", " Contact8");
                    intent.putExtra("cphone", " +92 32377565");
                    intent.putExtra("phtype", " Mobile");
                    intent.putExtra("add", " 123@gmail.com");
                    intent.putExtra("addr", " Personal");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTitle().equals("contact7")) {
                    //start new activity with title for actionbar and text for text view
                    Intent intent = new Intent(mContext, Main2Activity.class);
                    intent.putExtra("actionBarTitle", " ");
                    intent.putExtra("name", " Contact7");
                    intent.putExtra("cphone", " +92 32377565");
                    intent.putExtra("phtype", " Mobile");
                    intent.putExtra("add", " 123@gmail.com");
                    intent.putExtra("addr", " Personal");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTitle().equals("contact1")) {
                    //start new activity with title for actionbar and text for text view
                    Intent intent = new Intent(mContext, Main2Activity.class);
                    intent.putExtra("actionBarTitle", " ");
                    intent.putExtra("name", " Contact1");
                    intent.putExtra("cphone", " +92 32377565");
                    intent.putExtra("phtype", " Mobile");
                    intent.putExtra("add", " 123@gmail.com");
                    intent.putExtra("addr", " Personal");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTitle().equals("contact2")) {
                    //start new activity with title for actionbar and text for text view
                    Intent intent = new Intent(mContext, Main2Activity.class);
                    intent.putExtra("actionBarTitle", " ");
                    intent.putExtra("name", " Contact2");
                    intent.putExtra("cphone", " +92 32377565");
                    intent.putExtra("phtype", " Mobile");
                    intent.putExtra("add", " 123@gmail.com");
                    intent.putExtra("addr", " Personal");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTitle().equals("contact3")) {
                    //start new activity with title for actionbar and text for text view
                    Intent intent = new Intent(mContext, Main2Activity.class);
                    intent.putExtra("actionBarTitle", " ");
                    intent.putExtra("name", " Contact3");
                    intent.putExtra("cphone", " +92 32377565");
                    intent.putExtra("phtype", " Mobile");
                    intent.putExtra("add", " 123@gmail.com");
                    intent.putExtra("addr", " Personal");
                    mContext.startActivity(intent);
                }


                if(modelList.get(position).getTitle().equals("contact4")) {
                    //start new activity with title for actionbar and text for text view
                    Intent intent = new Intent(mContext, Main2Activity.class);
                    intent.putExtra("actionBarTitle", " ");
                    intent.putExtra("name", " Contact4");
                    intent.putExtra("cphone", " +92 32377565");
                    intent.putExtra("phtype", " Mobile");
                    intent.putExtra("add", " 123@gmail.com");
                    intent.putExtra("addr", " Personal");
                    mContext.startActivity(intent);
                }
                if(modelList.get(position).getTitle().equals("contact5")) {
                    //start new activity with title for actionbar and text for text view
                    Intent intent = new Intent(mContext, Main2Activity.class);
                    intent.putExtra("actionBarTitle", " ");
                    intent.putExtra("name", " Contact5");
                    intent.putExtra("cphone", " +92 32377565");
                    intent.putExtra("phtype", " Mobile");
                    intent.putExtra("add", " 123@gmail.com");
                    intent.putExtra("addr", " Personal");
                    mContext.startActivity(intent);
                }

                if(modelList.get(position).getTitle().equals("contact6")) {
                    //start new activity with title for actionbar and text for text view
                    Intent intent = new Intent(mContext, Main2Activity.class);
                    intent.putExtra("actionBarTitle", " ");
                    intent.putExtra("name", " Contact6");
                    intent.putExtra("cphone", " +92 32377565");
                    intent.putExtra("phtype", " Mobile");
                    intent.putExtra("add", " 123@gmail.com");
                    intent.putExtra("addr", " Personal");
                    mContext.startActivity(intent);
                }

            }
        });
        return convertView;
    }
    //filter
    public void filter(String charText)
    {
        charText = charText.toLowerCase(Locale.getDefault());
        modelList.clear();
        if(charText.length()==0)
        {
            modelList.addAll(arrayList);
        }
        else
        {
            for(Model model : arrayList)
            {
                if(model.getTitle().toLowerCase(Locale.getDefault())
                        .contains(charText)){
                    modelList.add(model);
                }


            }
        }
        notifyDataSetChanged();
    }
    }
