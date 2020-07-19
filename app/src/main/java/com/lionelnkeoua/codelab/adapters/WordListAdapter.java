package com.lionelnkeoua.codelab.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lionelnkeoua.codelab.R;
import com.lionelnkeoua.codelab.model.Word;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.ViewHolder> {

    LayoutInflater inflater;
    private List<Word> wordList;

    public WordListAdapter(Context context) {
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public WordListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.ViewHolder holder, int position) {
        if(wordList != null){
            Word word = wordList.get(position);
            holder.textView.setText(word.getWord());
        }else{
            holder.textView.setText("Nothing to show");
        }
    }

    @Override
    public int getItemCount() {
        if (wordList != null){
            return wordList.size();
        }
        return 0;
    }

    void setWord(List<Word> words){
        wordList = words;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
