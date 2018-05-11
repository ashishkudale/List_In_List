package com.ashishkudale.list_in_list.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ashishkudale.list_in_list.R;
import com.ashishkudale.list_in_list.models.Chapter;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by ashu on 6/2/17.
 */

public class ChapterAdapter extends RecyclerView.Adapter<ChapterAdapter.CustomViewHolder> {

    private Context context;
    private ArrayList<Chapter> chapters;
    private LayoutInflater inflater;

    public ChapterAdapter(Context context, ArrayList<Chapter> chapters) {
        this.context = context;
        this.chapters = chapters;
        this.inflater = LayoutInflater.from(context);

    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        view = inflater.inflate(R.layout.single_chapter, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        Chapter chapter = chapters.get(position);
        holder.tvChapterName.setText(chapter.chapterName);
        Picasso.get().load(chapter.imageUrl).into(holder.ivChapter);
    }

    @Override
    public int getItemCount() {
        return chapters.size();
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder {

        public ImageView ivChapter;
        public TextView tvChapterName;

        public CustomViewHolder(View itemView) {
            super(itemView);

            tvChapterName = (TextView) itemView.findViewById(R.id.tvChapterName);
            ivChapter = (ImageView) itemView.findViewById(R.id.ivChapter);
        }
    }
}
