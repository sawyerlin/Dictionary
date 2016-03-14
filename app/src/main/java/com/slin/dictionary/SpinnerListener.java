package com.slin.dictionary;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.slin.dictionary.data.DictionarySource;

import java.util.Arrays;

public class SpinnerListener implements AdapterView.OnItemSelectedListener{
    private Activity currentActivity;
    private DictionarySource currentSource;
    private AutoCompleteTextView currentTextView;

    public SpinnerListener(Activity activity, DictionarySource source, AutoCompleteTextView textView) {
        this.currentActivity = activity;
        this.currentSource = source;
        this.currentTextView = textView;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (parent.getId() == R.id.spinnerTo) {
            Object[] orig = this.currentSource.get(parent.getSelectedItem()).values().toArray();
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this.currentActivity, R.layout.support_simple_spinner_dropdown_item, Arrays.copyOf(orig, orig.length, String[].class));
            this.currentTextView.setAdapter(adapter);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
