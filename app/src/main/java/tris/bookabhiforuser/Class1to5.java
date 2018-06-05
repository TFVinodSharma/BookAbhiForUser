package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Class1to5 extends AppCompatActivity {
TextView Class1to5;
Button Class1to5Booking,Class1to5Account;
RecyclerView Class1to5Recycler;

    public  String[] Class1to5Name={"Mr. Mathura Prasad","Mr. Jagannath Sharma","Mr.Ramdayal Sharma"};
    public  String[] Class1to5Rank={"10years  ex ","6 years exp","3 years exp"};
    public String[] Class1to5Work={"All Type Of Work","English","Hindi"};
    public  String[] Class1to5Rating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] Class1to5Review={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] Class1to5fee={"Rs 500","Rs 300","Rs 200"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class1to5);
        Class1to5=findViewById(R.id.class1to5Filter);
        Class1to5Booking=findViewById(R.id.class1to5Booking);
        Class1to5Account=findViewById(R.id.class1to5Account);

        Class1to5Recycler=findViewById(R.id.class1to5recycler);
        Class1to5Recycler.setLayoutManager(new LinearLayoutManager(this));
        Class1to5Recycler.setAdapter(new Class1to5Adapter(Class1to5Name,Class1to5Rank,Class1to5Work,Class1to5Rating,Class1to5Review,Class1to5fee));

        Class1to5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Class1to5.this, FilterActivty.class);
                startActivity(i);
            }
        });
        Class1to5Booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Class1to5.this, MyBooking.class);
                startActivity(i);
            }
        });
        Class1to5Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Class1to5.this,Account_Profile.class);
                startActivity(i);
            }
        });



    }
}
