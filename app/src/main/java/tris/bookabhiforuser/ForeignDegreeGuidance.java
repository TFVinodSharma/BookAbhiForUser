package tris.bookabhiforuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ForeignDegreeGuidance extends AppCompatActivity {
TextView ForeFilter;
Button ForeignBooking,ForeignAccount;

RecyclerView ForeignRecyclerview;
    public  String[] ForeignName={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] ForeignRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] ForeignWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] ForeignRating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] ForeignReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] Foreignfee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foreign_degree_guidance);
        ForeFilter=findViewById(R.id.foreFilter);
        ForeignAccount=findViewById(R.id.foreignAccount);
        ForeignRecyclerview=findViewById(R.id.foreginrecyclerview);
        ForeignRecyclerview.setLayoutManager(new LinearLayoutManager(this));
        ForeignRecyclerview.setAdapter(new ForeginAdapter(ForeignName,ForeignRank,ForeignWork,ForeignRating,ForeignReview,Foreignfee));

        ForeignAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ForeignDegreeGuidance.this,Account_Profile.class);
                startActivity(i);
            }
        });

        ForeignBooking=findViewById(R.id.foreignBooking);
        ForeFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ForeignDegreeGuidance.this, FilterActivty.class);
                startActivity(i);
            }
        });
        ForeignBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ForeignDegreeGuidance.this, MyBooking.class);
                startActivity(i);
            }
        });


    }
}
