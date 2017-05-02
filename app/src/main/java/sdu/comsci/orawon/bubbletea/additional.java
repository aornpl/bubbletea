package sdu.comsci.orawon.bubbletea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class additional extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additional);
    }
    public void onClickhomemenu (View view) {
        Intent loginintent = new Intent(additional.this, homemenu.class);
        startActivity(loginintent);
    }
    public void onClickorderlist (View view) {
        Intent loginintent = new Intent(additional.this, showlist.class);
        startActivity(loginintent);
    }
    public void onClickother(View view) {
        Intent loginintent = new Intent(additional.this, additional.class);
        startActivity(loginintent);
    }
    public void onClickreturnregister (View view) {
        Intent loginintent = new Intent(additional.this, register.class);
        startActivity(loginintent);
    }
    public void onClickbranch (View view) {
        Intent loginintent = new Intent(additional.this, branch.class);
        startActivity(loginintent);
    }
    public void onClickaboutshop(View view) {
        Intent loginintent = new Intent(additional.this, aboutshop.class);
        startActivity(loginintent);
    }
}
