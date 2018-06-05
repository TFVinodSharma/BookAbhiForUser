package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Astrology extends AppCompatActivity  implements View.OnClickListener{
TextView AstroFilter;
Button AstrologyBooking,AstrologyAccount;
 RecyclerView recyclerView;
LinearLayoutManager linearLayoutManager;
    public  String[] PanditjiName={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] PanditjiRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] PanditjiWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] PanditjiRating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] PanditjiReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] Panditjifee={"Rs 500","Rs 300","Rs 200"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_astrology);
        AstroFilter=findViewById(R.id.astroloFilter);
        AstrologyBooking=findViewById(R.id.astrologyBooking);
        AstrologyAccount=findViewById(R.id.astrologerAccount);
        recyclerView=findViewById(R.id.recyview);

       recyclerView.setLayoutManager(new LinearLayoutManager(this));
       recyclerView.setAdapter(new SimpleAdpter(PanditjiName,PanditjiWork,PanditjiRank,PanditjiRating,PanditjiReview,Panditjifee));

        AstrologyBooking.setOnClickListener(this);
        AstrologyAccount.setOnClickListener(this);
        AstroFilter.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v==AstroFilter)
        {
            Intent i=new Intent(Astrology.this,FilterActivty.class);
            startActivity(i);

        }
        else if (v==AstrologyAccount)
        {
            Intent i=new Intent(Astrology.this,Account_Profile.class);
            startActivity(i);

        }
        else if (v==AstrologyBooking)
        {
            Intent i=new Intent(Astrology.this,MyBooking.class);
            startActivity(i);

        }
    }


}