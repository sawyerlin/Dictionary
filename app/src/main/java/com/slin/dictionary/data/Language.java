package com.slin.dictionary.data;

import java.util.HashMap;

public class Language {
    public LanguageType Type;
    public HashMap<String, String> Source;

    public Language(HashMap<String, String> source, LanguageType type) {
        this.Type = type;
        this.Source = source;
    }
}
