package co.mtaindia.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button login;

    final String usernameText = "mtaindia";
    final String passwordText = "coerroorkee";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);

        login = (Button)findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userInput = username.getText().toString();
                String passInput = password.getText().toString();

                if(userInput.equals("") || passInput.equals("")){
                    Toast.makeText(MainActivity.this,"Enter some credentials!",Toast.LENGTH_SHORT).show();
                }
                else{
                    if(userInput.equals(usernameText) && passInput.equals(passwordText)){
                        Toast.makeText(MainActivity.this, "Login Success!", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(MainActivity.this, LoggedInActivity.class);
                        intent.putExtra("username",userInput);
                        startActivity(intent); //switch between the activities
                    }
                }
            }
        });

    }
}
