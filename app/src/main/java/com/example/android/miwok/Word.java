package com.example.android.miwok;

import static android.view.View.VISIBLE;

/**
 * Created by flysamc on 22/2/17.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId;
    private boolean check = false;


    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        check = true;
    }

    public Word(String miwokTranslation, String defaultTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
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
}