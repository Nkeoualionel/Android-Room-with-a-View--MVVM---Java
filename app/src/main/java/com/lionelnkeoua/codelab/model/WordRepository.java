package com.lionelnkeoua.codelab.model;

import android.app.Application;

import java.util.List;

import androidx.lifecycle.LiveData;

public class WordRepository {

    private WordDao wordDao;
    private LiveData<List<Word>> listLiveData;

    WordRepository(Application application){
        WordRoomDatabase db = WordRoomDatabase.getDatabase(application);
        wordDao = db.wordDao();
        listLiveData = wordDao.getAllWord();
    }

    LiveData<List<Word>> getWord(){
        return  listLiveData;
    }


    void insert(Word word){
        WordRoomDatabase.databaseWriteExecutor.execute(() -> {
            wordDao.insert(word);
        });
    }

}
