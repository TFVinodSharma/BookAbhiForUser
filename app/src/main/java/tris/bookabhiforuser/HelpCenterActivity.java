package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class HelpCenterActivity extends AppCompatActivity implements View.OnClickListener{
ImageView Help1, Help2,Help3,Help4,Help5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_center2);
        Help1=findViewById(R.id.help1);
        Help2=findViewById(R.id.help2);
        Help3=findViewById(R.id.help3);
        Help4=findViewById(R.id.help4);
        Help5=findViewById(R.id.help5);

        Help1.setOnClickListener(this);
        Help2.setOnClickListener(this);
      /*  Help3.setOnClickListener(this);
        Help4.setOnClickListener(this);
      */  Help5.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v==Help1)
        {
            Intent i=new Intent(this,IssueWithPreviousAppointment.class);
            startActivity(i);
        }
        else if (v==Help2)
        {
            Intent i=new Intent(this,HowItsWork.class);
            startActivity(i);
        }
        else if (v==Help3)
        {

        }
        else if (v==Help4)
        {

        }
        else if (v==Help5)
        {
            Intent i=new Intent(this,ContactBookAhi.class);
            startActivity(i);
        }


    }
}
