package tris.bookabhiforuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CSGuidance extends AppCompatActivity {
TextView CsFilter;
Button CsBooking,CsAccount;
RecyclerView CSRecycler;
    public  String[] PanditjiName={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] PanditjiRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] PanditjiWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] PanditjiRating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] PanditjiReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] Panditjifee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csguidance);

        CsFilter=findViewById(R.id.csguideFilter);
        CsAccount=findViewById(R.id.csAccount);
      CsBooking=findViewById(R.id.csBooking);


        CSRecycler=findViewById(R.id.csrecycler);
        CSRecycler.setLayoutManager(new LinearLayoutManager(this));

        CSRecycler.setAdapter(new CSAdapter(PanditjiName,PanditjiRank,PanditjiWork,PanditjiRating,PanditjiReview,Panditjifee));
        CsBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CSGuidance.this,MyBooking.class);
                startActivity(i);
            }
        });


        CsAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CSGuidance.this,Account_Profile.class);
                startActivity(i);
            }
        });


        CsFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CSGuidance.this, FilterActivty.class);
                startActivity(i);
            }
        });

    }
}
