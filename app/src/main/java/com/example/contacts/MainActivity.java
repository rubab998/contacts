package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    ListView listView;
    ListViewAdapter adapter;
    String[] title;
    String[] description;
    int[]  icon;
    ArrayList<Model> arrayList=new ArrayList<Model>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("My Contacts");


        title = new String[]{"mother","father","brother","sister","colleague","friend","teacher","contact1","contact2","contact3","contact4","contact5","contact6","contact7","contact8"};
        description= new String[] {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};
        icon= new int []{R.drawable.mother,R.drawable.father,R.drawable.brother,R.drawable.sister,R.drawable.friend,R.drawable.colleague,R.drawable.contact7,R.drawable.contact4,R.drawable.contact3,R.drawable.contact5,R.drawable.contact8,R.drawable.contact4,R.drawable.contact7,R.drawable.contact3,R.drawable.contact4};
        listView = findViewById(R.id.listView);
        for(int i=0;i<title.length;i++)
        {
            Model model= new Model(title[i],description[i],icon[i]);
            //bind all strings in an array
            arrayList.add(model);

        }
        //pass results to list view
        adapter=new ListViewAdapter(this, arrayList);
        //bind the adapter to the list view
        listView.setAdapter(adapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView)myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if(TextUtils.isEmpty(newText))
                {
                    adapter.filter("");
                    listView.clearTextFilter();
                }
                else
                {
                    adapter.filter(newText);
                }
                return true;
            }
        });

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.action_settings)
        {

            return true;
        }                                                                         //do functionality here
        return super.onOptionsItemSelected(item);
    }
}
