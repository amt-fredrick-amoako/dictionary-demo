package com.amalitech.dictionary;

import com.amalitech.spi.Dictionary;

import java.util.SortedMap;
import java.util.TreeMap;

public class GeneralDictionary implements Dictionary {

    private SortedMap<String, String> map;

    /** Creates a new instance of GeneralDictionary */
    public GeneralDictionary() {
        map = new TreeMap<String, String>();
        map.put(
                "book",
                "a set of written or printed pages, usually bound with " +
                        "a protective cover");
        map.put(
                "editor",
                "a person who edits");
    }

    @Override
    public String getDefinition(String word) {
        return map.get(word);
    }

}
//java -Djava.ext.dirs=../DictionaryServiceProvider/dist:../ExtendedDictionary/dist -cp dist/DictionaryDemo.jar dictionary.DictionaryDemo