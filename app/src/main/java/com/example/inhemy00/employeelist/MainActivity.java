package com.example.inhemy00.employeelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee("Prince Mehra","Software developer Trainee","11110"));
        employeeList.add(new Employee("Aubrey Watson","Software developer Trainee","11111"));
        employeeList.add(new Employee("Jennie Scott","Software developer Trainee","11112"));
        employeeList.add(new Employee("Aubrey Watson","Software developer Trainee","11113"));
        employeeList.add(new Employee("Sidney Poole","Software developer Trainee","11114"));
        employeeList.add(new Employee("Rakesh Ranker","Software developer Trainee","11115"));
        employeeList.add(new Employee("Priya Damm","Software Design Head","31110"));
        employeeList.add(new Employee("Becky Ortega","Software Design Coordinater","31111"));
        employeeList.add(new Employee("Liam Nation","Software Design Coordinater","31112"));
        employeeList.add(new Employee("Irma Stevens","Human Resource","41110"));
        employeeList.add(new Employee("Rosemary Simon","Human Resource","41111"));
        employeeList.add(new Employee("Carlos Mcbride","Support Engineer","21110"));
        employeeList.add(new Employee("John Romaro","Support Engineer","21111"));
        employeeList.add(new Employee("Michael Scott","Manager","10000"));
        //LinearLayout empView = (LinearLayout)findViewById(R.id.rootView);

//        for (int i=0;i<employeeList.size();i++){
//            TextView empList = new TextView(this);
//            empList.setText(employeeList.get(i));
//            empView.addView(empList);
//
//        }
//

        //ArrayAdapter<Employee> itemsAdapter = new ArrayAdapter<Employee>(this, R.layout.list_view, employeeList);

        EmployeeAdapter adapter = new EmployeeAdapter(this,employeeList);
        ListView empView = (ListView)findViewById(R.id.rootView);

        empView.setAdapter(adapter);


    }


}
