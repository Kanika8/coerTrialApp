package co.mtaindia.firstapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Debaditya on 6/6/2018.
 */

public class TodoAddActivity extends AppCompatActivity {

    DatePicker datePicker;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_todo);

        datePicker = (DatePicker)findViewById(R.id.datePicker);
//lorem
        Calendar calendar = Calendar.getInstance();

        calendar.setTimeInMillis(System.currentTimeMillis());

        datePicker.init(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                        Toast.makeText(TodoAddActivity.this, "Date is: "+i1+"/"+i2+"/"+i, Toast.LENGTH_SHORT).show();
                    }
                });


    }
}
