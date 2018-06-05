package tris.bookabhiforuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Class6to10 extends AppCompatActivity {
TextView Class6to10Filter;
Button Class6to10Booking,Class6to10Account;
    public  String[] Class6to10Name={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] Class6to10Rank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] Class6to10Work={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] Class6to10Rating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] Class6to10Review={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] Class6to10fee={"Rs 500","Rs 300","Rs 200"};


RecyclerView Class6to10Recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class6to10);

        Class6to10Filter=findViewById(R.id.class6to10Filter);
        Class6to10Booking=findViewById(R.id.class6to10Booking);
        Class6to10Account=findViewById(R.id.class6to10Account);
        Class6to10Recycler=findViewById(R.id.class6to10recylcer);
        Class6to10Recycler.setLayoutManager(new LinearLayoutManager(this));
        Class6to10Recycler.setAdapter(new Class6to10Adapter(Class6to10Name,Class6to10Rank,Class6to10Work,Class6to10Rating,Class6to10Review,Class6to10fee));



        Class6to10Filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Class6to10.this, FilterActivty.class);
                startActivity(i);
            }
        });
        Class6to10Booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Class6to10.this, MyBooking.class);
                startActivity(i);
            }
        });
        Class6to10Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Class6to10.this,Account_Profile.class);
                startActivity(i);
            }
        });



    }
}
