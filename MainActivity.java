package com.minich.hellolistview;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class HelloListViewActivity extends ListActivity 
{

    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, FRIENDS));
        getListView().setTextFilterEnabled(true);
    }
    
    static final String[] FRIENDS = new String[]{"Alfred", "Barb", "Chris", "Diane"};
    
    protected void onListItemClick(ListView l, View v, int position, long id) 
    {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String friend = o.toString();
        Toast.makeText(this, "You have chosen the friend: " + " " + friend, Toast.LENGTH_LONG).show();
    }
    
}
