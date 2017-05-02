package sdu.comsci.orawon.bubbletea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clicklogin (View view){
        Intent loginintent =new Intent(MainActivity.this,login.class);
        startActivity(loginintent);
    }
    public void clickwebsite (View view) {
        Intent loginintent = new Intent(MainActivity.this, homemenu.class);
        startActivity(loginintent);
    }
}
