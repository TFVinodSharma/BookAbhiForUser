package tris.bookabhiforuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FamilyMatters extends AppCompatActivity {
TextView FamilyFilter;
Button FamilyBooking,FamilyAccount;

RecyclerView FamilyList;
    public  String[] FamilyListName={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] FamilyListRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] FamilyListWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[]FamilyListRating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] FamilyListReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] FamilyListfee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_matters);
        FamilyFilter=findViewById(R.id.familyMatterFilter);
        FamilyBooking=findViewById(R.id.familyBooking);

        FamilyAccount=findViewById(R.id.familyAccount);
        FamilyList=findViewById(R.id.familylist);
        FamilyList.setLayoutManager(new LinearLayoutManager(this));
        FamilyList.setAdapter(new FamilyAdapter(FamilyListName,FamilyListRank,FamilyListWork,FamilyListRating,FamilyListReview,FamilyListfee));

        FamilyAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FamilyMatters.this,Account_Profile.class);
                startActivity(i);
            }
        });

        FamilyFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FamilyMatters.this,FilterActivty.class);
                startActivity(i);
            }
        });
             FamilyBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FamilyMatters.this, MyBooking.class);
                startActivity(i);
            }
        });

    }
}
