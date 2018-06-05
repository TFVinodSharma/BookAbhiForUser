package tris.bookabhiforuser;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CivilGuidance extends AppCompatActivity {
TextView CivilFilter;
Button CivilBooking,CivilAccount;

RecyclerView CivilGuidanceRecyclerView;
    public  String[] CivilGuidanceName={"Mathura Prasad","Jagannath Sharma","Ramdayal Sharma"};
    public  String[] CivilGuidanceRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] CivilGuidanceWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] CivilGuidanceRating={"4.3 Rating","4.1 Rating","4.3 Rating"};
    public  String[] CivilGuidanceReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] CivilGuidancefee={"Rs 500","Rs 300","Rs 200"};

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_guidance);

        CivilGuidanceRecyclerView=findViewById(R.id.civilrecycler);
        CivilGuidanceRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        CivilGuidanceRecyclerView.setAdapter(new CivilGuidanceAdapter(CivilGuidanceName,CivilGuidanceRank,CivilGuidanceWork,CivilGuidanceRating,CivilGuidanceReview,CivilGuidancefee));

        CivilFilter=findViewById(R.id.civilFilter);
        CivilBooking=findViewById(R.id.civilBooking);
        CivilAccount=findViewById(R.id.civilAccount);
        CivilFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CivilGuidance.this, FilterActivty.class);
                startActivity(i);
            }
        });
        CivilBooking.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i=new Intent(CivilGuidance.this, MyBooking.class);
                startActivity(i);
            }
        });
        CivilAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CivilGuidance.this,Account_Profile.class);
                startActivity(i);
            }
        });



    }
}
