package com.example.android.miwok;

import android.util.Log;

import static android.view.View.VISIBLE;

/**
 * Created by flysamc on 22/2/17.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId;
    private boolean check = false;
    private int mMusicResourceId;


    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId, int musicResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        mMusicResourceId = musicResourceId;
        check = true;
    }


    public Word(String miwokTranslation, String defaultTranslation, int musicResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mMusicResourceId = musicResourceId;
        check = false;
    }


    public String getMiwokTranslation() {
        return mMiwokTranslation;

    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;

    }

    public int getImageResourceId() {
        return mImageResourceId;
    }


    public boolean hadImage() {
        return check;
    }

    public int getMusicResourceId(){
        return mMusicResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", check=" + check +
                ", mMusicResourceId=" + mMusicResourceId +
                '}';
    }
}