package co.mtaindia.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Debaditya on 6/5/2018.
 */

public class LoggedInActivity extends AppCompatActivity {

    TextView someText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        someText = (TextView)findViewById(R.id.someText);

        String username = getIntent().getStringExtra("username");

        someText.setText("Hello "+username+"!");

        someText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoggedInActivity.this, TodoAddActivity.class);
                startActivity(intent);
            }
        });
    }
}
