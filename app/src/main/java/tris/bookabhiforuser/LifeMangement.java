package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LifeMangement extends AppCompatActivity {
TextView LifeFilter;
Button LifeBooking,LifeAccount;
RecyclerView recyclerViewLife;

    public  String[] LifeName={" Ad.Mathura Prasad","Ad.Jagannath Sharma","Ad. Ramdayal Sharma"};
    public  String[] LifeRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] LifeWork={"All Type Of Work","Settelemnet","Divorce"};
    public  String[] LifeRating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] LifeReviews={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] LifeFee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_mangement);
        LifeBooking=findViewById(R.id.lifeBooking);
        LifeFilter=findViewById(R.id.lifeFilter);
        LifeAccount=findViewById(R.id.lifeAccount);
        recyclerViewLife=findViewById(R.id.lifeRecylerview);
        recyclerViewLife.setLayoutManager(new LinearLayoutManager(this));

        recyclerViewLife.setAdapter(new LifeManagementAdapter(LifeName,LifeRank,LifeWork,LifeRating,LifeReviews,LifeFee));

        LifeFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LifeMangement.this, FilterActivty.class);
                startActivity(i);
            }
        });
        LifeBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LifeMangement.this, MyBooking.class);
                startActivity(i);
            }
        });
        LifeAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LifeMangement.this, Account_Profile.class);
                startActivity(i);
            }
        });



    }
}
