package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LawGuidance extends AppCompatActivity {
TextView LawFilter;
Button LawBooking,LawAccount;
RecyclerView LawRecyclerview;
    public  String[] LawName={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] LawRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] LawWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] LawRating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] LawReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] Lawfee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law_guidance);
        LawFilter=findViewById(R.id.lowFilter);
        LawBooking=findViewById(R.id.lawBooking);
        LawAccount=findViewById(R.id.lawAccount);

        LawRecyclerview=findViewById(R.id.lawrecyclerview);
        LawRecyclerview.setLayoutManager(new LinearLayoutManager(this));
        LawRecyclerview.setAdapter(new LAWAdapter(LawName,LawRank,LawWork,LawRating,LawReview,Lawfee));

        LawFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LawGuidance.this, FilterActivty.class);
                startActivity(i);
            }
        });
        LawBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LawGuidance.this, MyBooking.class);
                startActivity(i);
            }
        });
        LawAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LawGuidance.this, Account_Profile.class);
                startActivity(i);
            }
        });


    }
}
