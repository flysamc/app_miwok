package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by flysamc on 23/2/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {




    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    /**
     * Create a new {@link WordAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words is the list of {@link Word}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word wordMiwok = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokTextView.setText(wordMiwok.getMiwokTranslation());


        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(wordMiwok.getDefaultTranslation());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        if (wordMiwok.hadImage()) {
                       // If an image is available, display the provided image based on the resource ID
                               iconView.setImageResource(wordMiwok.getImageResourceId());
                       // Make sure the view is visible
                                iconView.setVisibility(View.VISIBLE);
                   } else {
                        // Otherwise hide the ImageView (set visibility to GONE)

                            iconView.setVisibility(View.GONE);
                   }


        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        /*
        Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        the ListView.
        */


        return listItemView;

    }
}
