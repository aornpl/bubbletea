package sdu.comsci.orawon.bubbletea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class showlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showlist);
    }
    public void onClickhomemenu (View view) {
        Intent loginintent = new Intent(showlist.this, homemenu.class);
        startActivity(loginintent);
    }
    public void onClickorderlist (View view) {
        Intent loginintent = new Intent(showlist.this, additional.class);
        startActivity(loginintent);
    }
}
