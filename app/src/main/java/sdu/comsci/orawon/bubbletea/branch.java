package sdu.comsci.orawon.bubbletea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class branch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);
    }
    public void onClickreturn(View view) {
        Intent loginintent = new Intent(branch.this, additional.class);
        startActivity(loginintent);
    }
    public void onClickhomemenu(View view) {
        Intent loginintent = new Intent(branch.this, homemenu.class);
        startActivity(loginintent);
    }
    public void onClickorderlist (View view) {
        Intent loginintent = new Intent(branch.this, showlist.class);
        startActivity(loginintent);
    }
    public void onClickother(View view) {
        Intent loginintent = new Intent(branch.this, additional.class);
        startActivity(loginintent);
    }

}
