package tris.bookabhiforuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class IssueWithPreviousAppointment extends AppCompatActivity
implements View.OnClickListener{

    TextView IssueHelp1,IssueHelp2,IssueHelp3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issue_with_previous_appointment);
        IssueHelp1=findViewById(R.id.issuehelp1);
        IssueHelp2=findViewById(R.id.issuehelp2);
        IssueHelp3=findViewById(R.id.issuehelp3);
        IssueHelp3.setOnClickListener(this);
        IssueHelp1.setOnClickListener(this);
        IssueHelp2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==IssueHelp1)
        {
            Intent i=new Intent(this,HelpActivity.class);
            startActivity(i);
        }
        else if (v==IssueHelp2)
        {
            Intent i=new Intent(this,HelpActivity.class);
            startActivity(i);
        }
        else  if (v==IssueHelp3)
        {
            Intent i=new Intent(this,HelpActivity.class);
            startActivity(i);
        }

    }
}
