package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class FilterActivty extends AppCompatActivity {
    TextView Textlowtohigh,Texthightolow,Textavailablenow,Textavailabletoday,
            Textavailablenext7days,Textmale,Textfemale,Textenglish,Texthindi,Textpunjabhi;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_activty);

            Textlowtohigh=findViewById(R.id.lowtohigh);
            Texthightolow=findViewById(R.id.hightolow);
            Textavailablenow=findViewById(R.id.availablenow);
            Textavailabletoday=findViewById(R.id.availabletoday);
            Textavailablenext7days=findViewById(R.id.availableinnext7days);
            Textmale=findViewById(R.id.male);
            Textfemale=findViewById(R.id.female);
            Textenglish=findViewById(R.id.english);
            Texthindi=findViewById(R.id.hindi);
            Textpunjabhi=findViewById(R.id.punjabhi);


            Textlowtohigh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(FilterActivty.this,BookActivity.class);
                    startActivity(i);
                }
            });



        }
}
