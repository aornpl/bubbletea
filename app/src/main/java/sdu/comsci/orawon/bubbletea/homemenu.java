package sdu.comsci.orawon.bubbletea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class homemenu extends AppCompatActivity {

    ListView listView;
    private int[] ints={R.drawable.milk, R.drawable.apple, R.drawable.greentea, R.drawable.kokotea, R.drawable.lemontea,
                       R.drawable.milktea, R.drawable.orange, R.drawable.strawberry , R.drawable.tea };

    private String[] nameC ={"Milk","Apple Tea","Green Tea","Coco Tea","LemonTea","Milk Tea","Orange","Strawberry Tea","Tea"};
    private String[] nameP ={"35","40","40","45","35","30","30","35","30"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homemenu);

        listView= (ListView) findViewById(R.id.listdetail);

        Myadapter myadapter=new Myadapter(homemenu.this,ints,nameC,nameP);
        listView.setAdapter(myadapter);

    }
        public void onClickhomemenu (View view) {
        Intent loginintent = new Intent(homemenu.this, homemenu.class);
        startActivity(loginintent);
       }
    }
