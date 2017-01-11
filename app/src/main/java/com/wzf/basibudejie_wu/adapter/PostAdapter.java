package com.wzf.basibudejie_wu.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import static android.support.v7.widget.RecyclerView.ViewHolder;

/**
 * 根据不同的的数据显示不同url获得的数据
 * 分别有视频，文本，图片，音频，gif，其他
 */

public class PostAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public static final int VIDEO = 0;

    public static final int AUDIO = 1;

    public static final int GIF = 2;

    public static final int TXT = 3;

    public static final int IMAGE = 4;


    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class VideoViewHolder extends RecyclerView.ViewHolder{

        public VideoViewHolder(View itemView) {
            super(itemView);
        }
    }
    static class AudioViewHolder extends RecyclerView.ViewHolder{

        public AudioViewHolder(View itemView) {
            super(itemView);
        }
    }
}
