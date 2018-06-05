package tris.bookabhiforuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CivilMatters extends AppCompatActivity {
TextView CivilMatterFilter;
Button CivilMattersBooking,CivilMattersAccount;
RecyclerView CivilMattersRecycler;
    public  String[] CivilMattersName={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] CivilMattersRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] CivilMattersWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] CivilMattersRating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] CivilMattersReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] CivilMattersfee={"Rs 500","Rs 300","Rs 200"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_matters);
        CivilMatterFilter=findViewById(R.id.civilMattersFilters);
        CivilMattersBooking=findViewById(R.id.civilMattersBooking);
        CivilMattersAccount=findViewById(R.id.civilmattersAccount);

        CivilMattersRecycler=findViewById(R.id.civilmatterrecycler);
        CivilMattersRecycler.setLayoutManager(new LinearLayoutManager(this));
        CivilMattersRecycler.setAdapter(new CivilMattersAdapter(CivilMattersName,CivilMattersRank,CivilMattersWork,CivilMattersRating,CivilMattersReview,CivilMattersfee));

        CivilMatterFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CivilMatters.this,FilterActivty.class);
                startActivity(i);
            }
        });
        CivilMattersBooking.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i=new Intent(CivilMatters.this, MyBooking.class);
                startActivity(i);
            }
        });
        CivilMattersAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CivilMatters.this,Account_Profile.class);
                startActivity(i);
            }
        });




    }
}
