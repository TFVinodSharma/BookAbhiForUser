package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BookActivity extends AppCompatActivity implements View.OnClickListener
{
    Button LaterButton,AvailableButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        LaterButton=findViewById(R.id.latertimingbutton);
        AvailableButton=findViewById(R.id.avilnowbutton);
        LaterButton.setOnClickListener(this);
        AvailableButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v==LaterButton)
        {

            Intent i=new Intent(this,LaterBooking.class);
            startActivity(i);
           /*// LinearLayout ln=(LinearLayout)findViewById(R.id.cantainer1);
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.add(R.id.cantainer1, new LaterFragment());
            ft.commit();
          //  ln .setVisibility(View.VISIBLE);*/

        }
        else if (v==AvailableButton)
        {
            Intent i=new Intent(this,AvailableNow.class);
            startActivity(i);
/*
           // LinearLayout ln=(LinearLayout)findViewById(R.id.cantainer1);
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.add(R.id.cantainer1, new AvailableNowFragment());
            ft.commit();
          //  ln .setVisibility(View.VISIBLE);
*/


        }
    }
}
