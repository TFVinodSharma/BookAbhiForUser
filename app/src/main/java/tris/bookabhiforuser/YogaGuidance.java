package tris.bookabhiforuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class YogaGuidance extends AppCompatActivity {
Button  YogaBooking;
TextView YogaFilter,YogaAccount;

RecyclerView yogaRecyclerview;
    public  String[] YogaName={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] YogaRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] YogaWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] YogaRating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] YogaReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] Yogafee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga_guidance);
        YogaBooking=findViewById(R.id.yogaBooking);
        YogaFilter=findViewById(R.id.yogaFilter);
        YogaAccount=findViewById(R.id.yogaAccount);

        yogaRecyclerview=findViewById(R.id.yogarecyclerview);
        yogaRecyclerview.setLayoutManager(new LinearLayoutManager(this));
        yogaRecyclerview.setAdapter(new YogaAdapter(YogaName,YogaRank,YogaWork,YogaRating,YogaReview,Yogafee));


        YogaAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(YogaGuidance.this,Account_Profile.class);
                startActivity(i);
            }
        });

        YogaBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(YogaGuidance.this,MyBooking.class);
                startActivity(i);
            }
        });
        YogaFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(YogaGuidance.this, FilterActivty.class);
                startActivity(i);
            }
        });

    }

}
