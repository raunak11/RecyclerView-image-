package Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.raunak.recyclerview.NextActivity;
import com.example.raunak.recyclerview.R;
import java.util.List;
import Model.User;

public class Myadapter extends RecyclerView.Adapter<Myadapter.ViewHolder> {
    private Context context;
    private List<User> list;
    private final Integer image_ids[] = {
            R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5,
            R.drawable.image6, R.drawable.image7, R.drawable.image8, R.drawable.image9, R.drawable.image0
    };

    public Myadapter(Context context, List<User> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public Myadapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_row,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        User user = list.get(i);
        viewHolder.name.setText(user.getName());
        viewHolder.desc.setText(user.getDesc());
        viewHolder.imageView.setImageResource(user.getImage_id());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView name, desc;
        private ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            name = itemView.findViewById(R.id.textView1);
            desc = itemView.findViewById(R.id.textView2);
            imageView = itemView.findViewById(R.id.image);
        }

        @Override
        public void onClick(View v) {
            int pos = getAdapterPosition();
            User user = list.get(pos);

            Intent intent = new Intent(context, NextActivity.class);
            intent.putExtra("name",user.getName());
            intent.putExtra("desc",user.getDesc());
            intent.putExtra("id",user.getImage_id());
            context.startActivity(intent);
        }
    }
}
