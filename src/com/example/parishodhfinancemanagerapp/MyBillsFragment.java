package com.example.parishodhfinancemanagerapp;

import java.util.ArrayList;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MyBillsFragment  extends Fragment {
	
	ListView listView1;
	ArrayList<String> bills = new ArrayList<String>();
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View mainView = inflater.inflate(R.layout.my_bills_fragment, container, false);
		populateTheList(mainView);
		return mainView;
	}

	private void populateTheList(final View mainView) {
		listView1 = (ListView) mainView.findViewById(R.id.listView1);
		String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
		        "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
		        "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
		        "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
		        "Android", "iPhone", "WindowsMobile" };
		final ArrayList<String> list = new ArrayList<String>();
	    for (int i = 0; i < values.length; ++i) {
	      list.add(values[i]);
	    }
	    
	    final StableArrayAdapter adapter = new StableArrayAdapter(mainView.getContext().getApplicationContext(),
	            android.R.layout.simple_list_item_1, list);
	    listView1.setAdapter(adapter);

	    listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

	        @Override
	        public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
	          final String item = (String) parent.getItemAtPosition(position);
	          Toast.makeText(mainView.getContext().getApplicationContext(), item, Toast.LENGTH_SHORT).show();
	        }

	      });
	}

	
}