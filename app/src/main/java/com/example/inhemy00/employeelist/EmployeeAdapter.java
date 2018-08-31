package com.example.inhemy00.employeelist;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EmployeeAdapter extends ArrayAdapter<Employee> {

    public  EmployeeAdapter(Activity context, ArrayList<Employee> words){
        super(context,0,words);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
        }

        // Get the  object located at this position in the list
        Employee currentEmployee = getItem(position);

        // Find the TextView in the list_view.xml layout with the ID emp_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.emp_name);
        // Get the version name from the current currentEmployee object and
        // set this text on the name TextView
        nameTextView.setText(currentEmployee.getEmployeename());

        // Find the TextView in the list_view.xml layout with the ID emp_designation
        TextView designationTextView = (TextView) listItemView.findViewById(R.id.emp_designation);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        designationTextView.setText(currentEmployee.getEmployeeDesignation());

        // Find the TextView in the list_view.xml layout with the ID emp_id
        TextView idTextView = (TextView) listItemView.findViewById(R.id.emp_id);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        idTextView.setText(currentEmployee.getEmployeeID());

        // Return the whole list item layout (containing 3 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
