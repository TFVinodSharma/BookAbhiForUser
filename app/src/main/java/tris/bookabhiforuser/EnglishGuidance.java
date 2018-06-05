package tris.bookabhiforuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EnglishGuidance extends AppCompatActivity {
TextView EnglishFilter;
Button EnglishBooking,EnglishAccount;

RecyclerView  EnglishRecyclerview;
    public  String[] EnglishName={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] EnglishRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] EnglishWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] EnglishRating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] EnglishReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] Englishfee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_guidance);
        EnglishBooking=findViewById(R.id.englishBooking);
        EnglishFilter=findViewById(R.id.englishfilter);
        EnglishAccount=findViewById(R.id.englishAccount);


        EnglishRecyclerview=findViewById(R.id.englishrecyclerview);

        EnglishRecyclerview.setLayoutManager(new LinearLayoutManager(this));
        EnglishRecyclerview.setAdapter(new EnglishAdapter(EnglishName,EnglishRank,EnglishWork,EnglishRating,EnglishReview,Englishfee));


        EnglishAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(EnglishGuidance.this,Account_Profile.class);
                startActivity(i);
            }
        });

        EnglishBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(EnglishGuidance.this, MyBooking.class);
                startActivity(i);
            }
        });

        EnglishFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(EnglishGuidance.this,FilterActivty.class);
                startActivity(i);
            }
        });
    }
}
