package sdu.comsci.orawon.bubbletea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {
    String nameString;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);



        Button button = (Button) findViewById(R.id.button13);
        final EditText editText = (EditText) findViewById(R.id.editText3);
        final EditText editText1 = (EditText) findViewById(R.id.editText5);
        final EditText editText2 = (EditText) findViewById(R.id.editText7);
        final EditText editText3 = (EditText) findViewById(R.id.editText8);
        final EditText editText4 = (EditText) findViewById(R.id.editText9);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText.length()==0){ //ถ้า edittext ว่างคือยังไม่กรอกชื่อ
                    Toast.makeText(getApplicationContext(),"Please Enter your name!!",Toast.LENGTH_SHORT).show();

                }
                else if (editText1.length()==0){ //ถ้า edittext ว่างคือยังไม่กรอกชื่อ
                    Toast.makeText(getApplicationContext(),"Please Enter your lastname!!",Toast.LENGTH_SHORT).show();

                }
                else if (editText2.length()==0){ //ถ้า edittext ว่างคือยังไม่กรอกชื่อ
                    Toast.makeText(getApplicationContext(),"Please Enter your e-mail!!",Toast.LENGTH_SHORT).show();

                }
                else if (editText3.length()==0){ //ถ้า edittext ว่างคือยังไม่กรอกชื่อ
                    Toast.makeText(getApplicationContext(),"Please Enter your password!!",Toast.LENGTH_SHORT).show();

                }
                else if (editText4.length()==0){ //ถ้า edittext ว่างคือยังไม่กรอกชื่อ
                    Toast.makeText(getApplicationContext(),"Please Enter your phone number!!",Toast.LENGTH_SHORT).show();

                }else {

                    Intent startIntent = new Intent(register.this, login.class);
                    startIntent.putExtra("name",nameString);
                    startActivity(startIntent);
                }
            }
        });



                }
    public void onClickLogin (View view) {
        Intent loginintent = new Intent(register.this, login.class);
        startActivity(loginintent);
    }
    public void onClickhomemenu (View view) {
        Intent loginintent = new Intent(register.this, homemenu.class);
        startActivity(loginintent);
    }
            }//main method




