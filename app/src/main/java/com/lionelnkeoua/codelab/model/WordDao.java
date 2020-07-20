package com.lionelnkeoua.codelab.model;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface WordDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Word word);

    @Query("select * from table_word order by word asc")
    LiveData<List<Word>> getAllWord();

    @Query("delete  from table_word")
    void deleteAll();

}
