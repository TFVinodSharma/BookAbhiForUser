package tris.bookabhiforuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IncomeTaxActivity extends AppCompatActivity implements View.OnClickListener {
TextView IncomeFilter;
Button IncomeBooking,IncomeTaxAccount;

RecyclerView IncomeRecyclerView;

    public  String[] IncomeName={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] IncomeRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] IncomeWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] IncomeRating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] IncomeReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] Incomefee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_tax);
        IncomeFilter=findViewById(R.id.incomeFilter);
        IncomeBooking=findViewById(R.id.incomeBooking);
        IncomeTaxAccount=findViewById(R.id.incomeAccount);

        IncomeRecyclerView=findViewById(R.id.incomerecyclerview);

        IncomeRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        IncomeRecyclerView.setAdapter(new IncomeTaxAdapter(IncomeName,IncomeRank,IncomeWork,IncomeRating,IncomeReview,Incomefee));

        IncomeTaxAccount.setOnClickListener(this);
        IncomeBooking.setOnClickListener(this);
        IncomeFilter.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if (v==IncomeBooking)
        {
            Intent i=new Intent(IncomeTaxActivity.this, MyBooking.class);
            startActivity(i);
        }
        else if (v==IncomeFilter)
        {
            Intent i=new Intent(IncomeTaxActivity.this, FilterActivty.class);
            startActivity(i);

        }
        else if (v==IncomeTaxAccount)
        {
            Intent i=new Intent(IncomeTaxActivity.this, Account_Profile.class);
            startActivity(i);

        }



    }
}
