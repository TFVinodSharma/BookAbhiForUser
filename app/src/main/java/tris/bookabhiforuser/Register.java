package tris.bookabhiforuser;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    String[] data = {"---Select Gender---", "Male", "Female",};
    public EditText Emails, Password, Phone, Lastname, Fname;
    TextView DateofBirth;
    Spinner Gender;
    Button register;
    private static String TAG = "Details";
    private DatePickerDialog.OnDateSetListener mDateSetListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // find id's
        Gender = findViewById(R.id.gender);
        Emails = findViewById(R.id.email);
        Password = findViewById(R.id.password);
        DateofBirth = findViewById(R.id.dob);
        Phone = findViewById(R.id.phone);
        Lastname = findViewById(R.id.lname);
        Fname = findViewById(R.id.fname);
        register = findViewById(R.id.signup);


        // for date picker
        DateofBirth.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int date = cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dialog;
                dialog = new DatePickerDialog(Register.this,
                        mDateSetListener,
                        year, month, date);

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FDD7E4")));
                dialog.show();

            }
        });
        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                Log.d(TAG, "onDateSet:mm/dd/yy:" + month + "/" + day + "/" + year);
                String date = month + 1 + "/" + day + "/" + year;
                DateofBirth.setText(date);
            }
        };


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Register.this, android.R.layout.simple_dropdown_item_1line, data);
        Gender.setAdapter(adapter);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String DateofBirths= DateofBirth.getText().toString();
                String Phones= Phone.getText().toString();
                String Lastnames= Lastname.getText().toString();
                String Fnames= Fname.getText().toString();
                String Email= Emails.getText().toString();
                String Pass=Password.getText().toString();



                if (!Email.isEmpty()&& !Pass.isEmpty()&& !DateofBirths.isEmpty()&& !Phones.isEmpty()&& !Lastnames.isEmpty()&& !Fnames.isEmpty())
                {
                    SharedPreferences sp=getSharedPreferences("My_Data",MODE_PRIVATE);
                    SharedPreferences.Editor et=sp.edit();
                    et.putString("A",Email);
                    et.putString("B",Pass);
                  //  et.putString("c",Fnames);

                    et.commit();

                    Intent i=new Intent(Register.this,SendSms.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(Register.this, "Fill complete values", Toast.LENGTH_SHORT).show();
                }

            }

        });



    }
}
