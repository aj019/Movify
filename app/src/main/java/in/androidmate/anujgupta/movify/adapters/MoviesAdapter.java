package in.androidmate.anujgupta.movify.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by anujgupta on 26/12/17.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.Movies> {


    @Override
    public Movies onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(Movies holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class Movies extends RecyclerView.ViewHolder {
        public Movies(View itemView) {
            super(itemView);
        }
    }
}
