package sdu.comsci.orawon.bubbletea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }//main method







    public void onClickorder (View view) {
        Intent loginintent = new Intent(menu.this, login.class);
        startActivity(loginintent);

    }



}
