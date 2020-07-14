package sg.edu.rp.c346.id19004781.demoemployeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvInfo;
//    ArrayList<String> alEmployeeInfo;
    ArrayList<EmployeeInfo> alEmployeeInfo;
//    ArrayAdapter<String> aaItems;
    CustomAdapter caItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvInfo = findViewById(R.id.listViewEmployeeInfo);

        alEmployeeInfo = new ArrayList<>();
//        alEmployeeInfo.add("John Software Technical Leader 3400.0");
//        alEmployeeInfo.add("May Programmer 2200.0");
        EmployeeInfo employee1 = new EmployeeInfo("John", "Software Technical Leader", 3400);
        EmployeeInfo employee2 = new EmployeeInfo("May", "Programmer", 2200);

        alEmployeeInfo.add(employee1);
        alEmployeeInfo.add(employee2);

//        aaItems = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alEmployeeInfo);
        caItems = new CustomAdapter(this, R.layout.row, alEmployeeInfo);
        lvInfo.setAdapter(caItems);
    }
}
