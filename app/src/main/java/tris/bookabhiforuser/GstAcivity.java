package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GstAcivity extends AppCompatActivity {
TextView GstFilter;

Button GstBooking,GstAccount;
RecyclerView GstRecyclerView;


    String[] GstExpert={"Vinod ","Prabhakar","Raja","Swami"};
    String[] GstRank={"Gst Guru","Gst Guru","Gst Guru","Gst Guru"};
    String[] GstWork={"All Type of Gst Work","New Gst Generate","Gst Return","Gst File"};
    String[] GstRating={"4.6 Rating","4.7 Rating","5.0 Rating","4.0 Rating"};
    String[] GstReview={"24 Reviews","26 Reviews","54 Reviews","20 Reviews"};
    String[] GstRupee={"Rs 500","Rs 550","Rs 600","Rs 400"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gst_acivity);
        GstFilter=findViewById(R.id.gstFilter);
        GstBooking=findViewById(R.id.gstBooking);
        GstAccount=findViewById(R.id.gstAccount);

        GstRecyclerView=findViewById(R.id.gstrecyclerview);
        GstRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        GstRecyclerView.setAdapter(new GstAdapter(GstExpert,GstRank,GstWork,GstRating,GstReview,GstRupee));

        GstAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(GstAcivity.this,Account_Profile.class);
                startActivity(i);
            }
        });

        GstFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(GstAcivity.this, FilterActivty.class);
                startActivity(i);
            }
        });
        GstBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(GstAcivity.this, MyBooking.class);
                startActivity(i);
            }
        });




    }
}
