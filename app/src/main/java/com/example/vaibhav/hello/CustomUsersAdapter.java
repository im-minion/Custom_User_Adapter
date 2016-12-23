package com.example.vaibhav.hello;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vaibhav on 22/12/16.
 */
public class CustomUsersAdapter extends ArrayAdapter<User>{
    public CustomUsersAdapter(Context context, ArrayList<User> users){
        super(context,0,users);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        User user = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
        }
            TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
            TextView tvHome = (TextView) convertView.findViewById(R.id.tvHomeTown);

            tvName.setText(user.name);
            tvHome.setText(user.hometown);
            return convertView;

    }
}
