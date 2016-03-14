package com.slin.dictionary;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.slin.dictionary.data.DictionarySource;
import com.slin.dictionary.data.LanguageType;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    public static DictionarySource languages = new DictionarySource();
    private AutoCompleteTextView langText;
    private Spinner spinnerFrom;
    private Spinner spinnerTo;
    private SpinnerListener spinnerListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        langText = (AutoCompleteTextView) findViewById(R.id.langText);
        ArrayAdapter<LanguageType> langTypeAdapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, LanguageType.values());
        spinnerFrom = (Spinner)findViewById(R.id.spinnerTo);
        spinnerFrom.setAdapter(langTypeAdapter);
        spinnerTo = (Spinner)findViewById(R.id.spinnerFrom);
        spinnerTo.setAdapter(langTypeAdapter);

        spinnerListener = new SpinnerListener(this, languages, langText);

        spinnerFrom.setOnItemSelectedListener(spinnerListener);
        spinnerTo.setOnItemSelectedListener(spinnerListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void translate(View view) {
        String searchedValue = null;
        HashMap<String, String> fromSource = languages.get(spinnerFrom.getSelectedItem());
        HashMap<String, String> toSource = languages.get(spinnerTo.getSelectedItem());
        System.out.println(spinnerFrom.getSelectedItem());
        System.out.println(spinnerTo.getSelectedItem());
        EditText langText = (EditText) findViewById(R.id.langText);
        for(String key: fromSource.keySet()) {
            if (fromSource.get(key).equals(langText.getText().toString())) {
                searchedValue = toSource.get(key);
                break;
            }
        }
        TextView resultView = (TextView) findViewById(R.id.resultText);
        resultView.setText(searchedValue);
    }
}
