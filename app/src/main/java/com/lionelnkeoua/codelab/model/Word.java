package com.lionelnkeoua.codelab.model;

import androidx.annotation.NonNull;

public class Word {

    private String word;

    public Word(@NonNull String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
