package tris.bookabhiforuser;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Dell on 6/4/2018.
 */

public class GstAdapter extends RecyclerView.Adapter<GstAdapter.Versionview> {
    private String [] data1;
    private String [] data2;
    private String [] data3;
    private String [] data4;
    private String [] data5;
    private String [] data6;

    public GstAdapter(String[]data1,String[]data2,String[]data3,String[]data4,String[]data5,String[]data6){
        this.data1=data1;
        this.data2=data2;
        this.data3=data3;
        this.data4=data4;
        this.data5=data5;
        this.data6=data6;

    }

    @Override
    public GstAdapter.Versionview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.new_gst,parent,false);


        return new Versionview(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GstAdapter.Versionview holder, int position) {
        String pnd=data1[position];
        holder.tv.setText(pnd);
        String rnk=data2[position];
        holder.tv1.setText(rnk);
        String wrk=data3[position];
        holder.tv2.setText(wrk);
        String rtg=data4[position];
        holder.tv3.setText(rtg);
        String rev=data5[position];
        holder.tv4.setText(rev);
        String fee=data6[position];
        holder.tv5.setText(fee);


    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class Versionview extends RecyclerView.ViewHolder {
        TextView tv,tv1,tv2,tv3,tv4,tv5;


        public Versionview(View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.gstName);
            tv1=itemView.findViewById(R.id.gstRank);
            tv2=itemView.findViewById(R.id.gstWork);
            tv3=itemView.findViewById(R.id.gstRating);
            tv4=itemView.findViewById(R.id.gstReview);
            tv5=itemView.findViewById(R.id.gstFee);

        }
    }
}
