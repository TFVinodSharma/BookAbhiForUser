package tris.bookabhiforuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Class11to12 extends AppCompatActivity {
TextView Class11to12Filter;
Button Class11to12Booking,Class11to12Account;
    RecyclerView Class11to12Recyclerview;

    public  String[] Class11to12Name={"Mr.Mathura Prasad","Mr.Jagannath Sharma","Mr.Ramdayal Sharma"};
    public  String[] Class11to12Rank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] Class11to12Work={"Phuysics","Chemsitry","Maths"};
    public  String[] Class11to12Rating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] Class11to12Review={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] Class11to12fee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class11to12);
        Class11to12Filter=findViewById(R.id.class11to12Filter);
        Class11to12Booking=findViewById(R.id.class11to12Booking);
        Class11to12Account=findViewById(R.id.class11to12Account);

        Class11to12Recyclerview=findViewById(R.id.class11to12recycler);

        Class11to12Recyclerview.setLayoutManager(new LinearLayoutManager(this));
        Class11to12Recyclerview.setAdapter(new Class11to12Adapter(Class11to12Name,Class11to12Rank,Class11to12Work,Class11to12Rating,Class11to12Review,Class11to12fee));


        Class11to12Filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Class11to12.this, FilterActivty.class);
                startActivity(i);
            }
        });
        Class11to12Booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Class11to12.this, MyBooking.class);
                startActivity(i);
            }
        });
        Class11to12Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Class11to12.this,Account_Profile.class);
                startActivity(i);
            }
        });



    }
}
