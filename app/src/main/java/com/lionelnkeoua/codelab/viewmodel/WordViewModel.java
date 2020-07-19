package com.lionelnkeoua.codelab.viewmodel;

import android.app.Application;

import com.lionelnkeoua.codelab.model.Word;
import com.lionelnkeoua.codelab.model.WordRepository;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class WordViewModel extends AndroidViewModel {

    private WordRepository mWordRepository;
    private LiveData<List<Word>> listLiveWordData;

    public WordViewModel(@NonNull Application application) {
        super(application);
        mWordRepository = new WordRepository(application);
        listLiveWordData = mWordRepository.getWords();

    }

    public LiveData<List<Word>> getAllWord(){
        return listLiveWordData;
    }

    public void insertWord(Word word){
        mWordRepository.insert(word);
    }
}
