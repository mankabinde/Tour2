package com.example.admin.tour;

/**
 * Created by Admin on 7/31/2017.
 */
public interface RecyclerView {
    void setHasFixedSize(boolean b);

    void setLayoutManager(Object linearLayoutManager);

    void setAdapter(main2.FirebaseRecyclerAdapter<Blog, main2.BlogViewHolder> adapter);
}
