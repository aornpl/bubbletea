package sdu.comsci.orawon.bubbletea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    String nameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);





        Button button = (Button) findViewById(R.id.button2);
        final EditText editText = (EditText) findViewById(R.id.editText);
        final EditText editText1 = (EditText) findViewById(R.id.editText2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText.length()==0) { //ถ้า edittext ว่างคือยังไม่กรอกชื่อ
                    Toast.makeText(getApplicationContext(), "Please Enter your name!!", Toast.LENGTH_SHORT).show();
                }
                    if (editText1.length()==0) { //ถ้า edittext ว่างคือยังไม่กรอกชื่อ
                        Toast.makeText(getApplicationContext(), "Please Enter your password!!", Toast.LENGTH_SHORT).show();
                    }
                else {

                    Intent startIntent = new Intent(login.this, homemenu.class);
                    startIntent.putExtra("name",nameString);
                    startActivity(startIntent);
                }
            }
        });
    }


    public void onClickregister (View view) {
        Intent loginintent = new Intent(login.this, register.class);
        startActivity(loginintent);
    }
}
