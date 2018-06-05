package tris.bookabhiforuser;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class InvestmentActivity extends AppCompatActivity {
    ListView list;
    String[] Name;
    String[] Rank;
    String[] Work;
    String[] Rating;
    String[] Review;
    String[] Rupees;
TextView InvestFilter;
Button InvestmentBooking,InvestmentAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_investment);

        InvestFilter=findViewById(R.id.investmentFilter);
        InvestmentBooking=findViewById(R.id.investmentBooking);
        InvestmentAccount=findViewById(R.id.investmentAccount);
        InvestFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(InvestmentActivity.this, FilterActivty.class);
                startActivity(i);
            }
        });
        InvestmentBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(InvestmentActivity.this, MyBooking.class);
                startActivity(i);
            }
        });
        InvestmentAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(InvestmentActivity.this, Account_Profile.class);
                startActivity(i);
            }
        });




        Resources res = getResources();// this method returns the object type.

        Name = res.getStringArray(R.array.Name);
        Rank = res.getStringArray(R.array.Rank);

        Work = res.getStringArray(R.array.Work);
        Rating = res.getStringArray(R.array.Rating);
        Review = res.getStringArray(R.array.Reviews);
        Rupees = res.getStringArray(R.array.Rupees);


        list = findViewById(R.id.list);

        Adapter adapter = new Adapter(this, Name, Rank, Work, Rating, Review, Rupees);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(InvestmentActivity.this,BookActivity.class);
                intent.putExtra("title",list.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });
/*
        Button btn=findViewById(R.id.book);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(InvestmentActivity.this, BookActivity.class);
                InvestmentActivity.this.startActivity(myIntent);

            }
        });
*/



        /*list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(InvestmentActivity.this,BookActivity.class);
                intent.putExtra("title",list.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });
*/


    }


     public class Adapter extends ArrayAdapter<String> {
        Context context;
        String[] nameArray;
        String[] workArray;
        String[] rankArray;
        String[] ratingArray;
        String[] reviewArray;
        String[] rsArray;


        public Adapter(@NonNull Context context, String[] names,
                       String[] rank, String[] work, String[] rating, String[] review, String[] rupee) {
            super(context, R.layout.new_list, R.id.name, names);
            this.context = context;
            this.nameArray = names;
            this.rankArray = rank;
            this.workArray = work;
            this.ratingArray = rating;
            this.reviewArray = review;
            this.rsArray = rupee;

        }


    /*    @RequiresApi(api = Build.VERSION_CODES.M)
        @NonNull
    */    @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.new_list, parent, false);// row represent relative layout.

            TextView myTitles = row.findViewById(R.id.name);
            TextView Ranks = row.findViewById(R.id.rank);
            TextView Works = row.findViewById(R.id.work);
            TextView Ratings = row.findViewById(R.id.rating);
            TextView Reviews = row.findViewById(R.id.reviews);
            TextView Rupees = row.findViewById(R.id.rupee);

            myTitles.setText(nameArray[position]);
            Ranks.setText(rankArray[position]);
            Works.setText(workArray[position]);
            Ratings.setText(ratingArray[position]);
            Reviews.setText(reviewArray[position]);
            Rupees.setText(rsArray[position]);

            return row;

        }

    }

}