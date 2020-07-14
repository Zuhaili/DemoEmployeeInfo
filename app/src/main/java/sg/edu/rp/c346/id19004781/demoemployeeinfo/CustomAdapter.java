package sg.edu.rp.c346.id19004781.demoemployeeinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<EmployeeInfo> employeeList;

    public CustomAdapter(Context context, int resource, ArrayList<EmployeeInfo> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        employeeList = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvEmployee1 = rowView.findViewById(R.id.textViewEmployee1);
        TextView tvEmployee2 = rowView.findViewById(R.id.textViewEmployee2);

        // Obtain the Employee information based on the position
        EmployeeInfo currentEmployee = employeeList.get(position);

        // Set values to the TextView to display the corresponding information
        tvEmployee1.setText(currentEmployee.getName() + currentEmployee.getTitle() + currentEmployee.getSalary());
        tvEmployee2.setText(currentEmployee.getName() + currentEmployee.getTitle() + currentEmployee.getSalary());

        return rowView;
    }
}
