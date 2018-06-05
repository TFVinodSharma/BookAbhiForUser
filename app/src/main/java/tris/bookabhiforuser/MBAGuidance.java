package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MBAGuidance extends AppCompatActivity {
TextView MbaFilter;
Button MbaBooking;

RecyclerView MBARecyclerview;
    public  String[] MBAName={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] MBARank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] MBAWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] MBARating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] MBAReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] MBAFee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbaguidance);
        MbaBooking=findViewById(R.id.mbaBooking);
        MbaFilter=findViewById(R.id.mbaFilter);


        MBARecyclerview=findViewById(R.id.mbareccylerview);

        MBARecyclerview.setLayoutManager(new LinearLayoutManager(this));
        MBARecyclerview.setAdapter(new MBAAdapter(MBAName,MBARank,MBAWork,MBARating,MBAReview,MBAFee));

        MbaFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MBAGuidance.this, FilterActivty.class);
                startActivity(i);
            }
        });
        MbaBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MBAGuidance.this, MyBooking.class);
                startActivity(i);
            }
        });


    }
}
