package tris.bookabhiforuser;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Account_Profile extends AppCompatActivity
implements View.OnClickListener{
ImageView Right1,Right2,Right3,Right4,Right5,Right6,Right7,Right8,Right9;
Button Logout;
ImageView SelectImage;
    Uri picUri;
    private static final int CAMERA_REQUEST = 1888;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account__profile);
        Right1=findViewById(R.id.right1);
        Right2=findViewById(R.id.right2);
        Right3=findViewById(R.id.right3);
        Right4=findViewById(R.id.right4);
        Right5=findViewById(R.id.right5);
        Right6=findViewById(R.id.right6);
        Right7=findViewById(R.id.right7);
        Right8=findViewById(R.id.right8);
        Right9=findViewById(R.id.right9);
        Logout=findViewById(R.id.logout);
        SelectImage=findViewById(R.id.selectImage);

        SelectImage.setOnClickListener(this);
        Logout.setOnClickListener(this);
        Right1.setOnClickListener(this);
        Right2.setOnClickListener(this);
        Right3.setOnClickListener(this);
     //   Right4.setOnClickListener(this);
        Right5.setOnClickListener(this);
        Right6.setOnClickListener(this);
        Right7.setOnClickListener(this);
        Right8.setOnClickListener(this);
        Right9.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if (v == Right1) {
            Intent i = new Intent(this, Account_Profile.class);
            startActivity(i);
        } else if (v == Right2) {
            Intent i = new Intent(this, MyWallet.class);
            startActivity(i);

        } else if (v == Right3) {
            Intent i = new Intent(this, HelpCenterActivity.class);
            startActivity(i);

        }
/*
        else if (v==Right4)
        {
            Intent i=new Intent(this,Suggestion.class);
            startActivity(i);

        }
*/
        else if (v == Right5) {
            Intent i = new Intent(this, Suggestion.class);
            startActivity(i);

        } else if (v == Right6) {
            Intent i = new Intent(this, AboutBookAbhi.class);
            startActivity(i);

        } else if (v == Right7) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_TEXT, "https://www.aadityajain.com/");
            intent.setType("text/plain");
            startActivity(Intent.createChooser(intent, "choose app to share link or text"));

        } else if (v == Right8) {
            Intent i = new Intent(this, RateBookAbhi.class);
            startActivity(i);

        } else if (v == Right9) {
            Intent i = new Intent(this, MyWallet.class);
            startActivity(i);

        } else if (v == Logout) {
            Intent i = new Intent(this, LoginActivity.class);
            startActivity(i);

        } else if (v == SelectImage) {
            Intent I1 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(I1, CAMERA_REQUEST);

        }
    }
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAMERA_REQUEST && resultCode == RESULT_OK) {
            Bitmap b1 = (Bitmap) data.getExtras().get("data");
            SelectImage.setImageBitmap(b1);


        }




}
}
