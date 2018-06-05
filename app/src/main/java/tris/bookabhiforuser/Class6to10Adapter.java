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

public class Class6to10Adapter extends RecyclerView.Adapter<Class6to10Adapter.Versionview> {
    private String [] data1;
    private String [] data2;
    private String [] data3;
    private String [] data4;
    private String [] data5;
    private String [] data6;

    public Class6to10Adapter(String[]data1,String[]data2,String[]data3,String[]data4,String[]data5,String[]data6){
        this.data1=data1;
        this.data2=data2;
        this.data3=data3;
        this.data4=data4;
        this.data5=data5;
        this.data6=data6;

    }

    @Override
    public Class6to10Adapter.Versionview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.new_class6to10,parent,false);
        return new Versionview(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Class6to10Adapter.Versionview holder, int position) {
        String class6to10pnd=data1[position];
        holder.tv.setText(class6to10pnd);
        String class6to10rnk=data2[position];
        holder.tv1.setText(class6to10rnk);
        String class6to10wrk=data3[position];
        holder.tv2.setText(class6to10wrk);
        String class6to10rtg=data4[position];
        holder.tv3.setText(class6to10rtg);
        String class6to10rev=data5[position];
        holder.tv4.setText(class6to10rev);
        String class6to10fee=data6[position];
        holder.tv5.setText(class6to10fee);

    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class Versionview extends RecyclerView.ViewHolder {
        TextView tv,tv1,tv2,tv3,tv4,tv5;


        public Versionview(View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.class6to10Name);
            tv1=itemView.findViewById(R.id.class6to10Rank);
            tv2=itemView.findViewById(R.id.class6to10Work);
            tv3=itemView.findViewById(R.id.class6to10Rating);
            tv4=itemView.findViewById(R.id.class6to10Review);
            tv5=itemView.findViewById(R.id.class6to10Fee);

        }
    }
}
