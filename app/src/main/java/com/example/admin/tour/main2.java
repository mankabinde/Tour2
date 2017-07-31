
package com.example.admin.tour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class main2 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DatabaseReference myRef;

    // https://www.youtube.com/watch?v=0QnvFYsKl4U
    //https://www.youtube.com/watch?v=sbsuYCiBJvk


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        myRef = FirebaseDatabase.getInstance().getReference().child("/blog");

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerAdapter<Blog,BlogViewHolder> adapter =new FirebaseRecyclerAdapter<Blog, BlogViewHolder>(
                Blog.class,
                R.layout.individual_row,
                BlogViewHolder.class,
                myRef
        ) {
            @Override
            protected void populateViewHolder(BlogViewHolder viewHolder, Blog model, int position) {
                viewHolder.setName(model.getName());
                viewHolder.setAddress(model.getAddress());
                viewHolder.setImage(model.getImage());

            }
        };


        recyclerView.setAdapter(adapter);

    }

    public static class BlogViewHolder extends ViewHolder {
        TextView text_name,text_address;
        ImageView imageview;
        public BlogViewHolder(View itemView) {
            super(itemView);
            text_name=(TextView) text_name.findViewById();
            text_address=(TextView) text_address.findViewById();
            imageview=(ImageView) imageview.findViewById();
        }

        public void setName(String name) {
            text_name.setText(name);
        }

        public void setAddress(String address) {
            text_address.setText(address);
        }

        public void setImage(String image) {
            View itemView;
            Picasso.with(itemView.getContext())
                    .load(image)
                    .resize(400, 400)
                    .centerCrop()
                    .into(imageview);

        }

        private class Picasso {
        }
    }

    private static class ViewHolder {
        public ViewHolder(View itemView) {

        }
    }

    private class LinearLayoutManager {
        public LinearLayoutManager(main2 main2) {
        }
    }

    class FirebaseRecyclerAdapter<T, T1> {
    }
}


}
}
