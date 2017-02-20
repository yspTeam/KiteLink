package com.kitelink.primary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by ming on 2017/2/20.
 */

public class Map extends KLObject {

    private HashMap<KLObject, KLObject> value;


    public Map() {
        value = new HashMap<>();
    }

    public int size() {
        return value.size();
    }

    public boolean containsKey(KLObject key) {
        return value.containsKey(key);
    }

    public KLObject get(KLObject key) {
        return value.get(key);
    }

    public KLObject remove(KLObject key) {
        return value.remove(key);
    }

    public void clear() {
        value.clear();
    }

    public Array keys() {
        Set<KLObject> keySet =  value.keySet();
        KLObject[] objArray = (KLObject[]) keySet.toArray();
        Array array = new Array(objArray.length);
        for (int i = 0; i < objArray.length; i++) {
            array.set(i, objArray[i]);
        }
        return array;
    }

    public Array values() {
        Collection<KLObject> cValues = value.values();
        
        KLObject[] objArray = (KLObject[]) cValues.toArray();
        Array array = new Array(objArray.length);
        for (int i = 0; i < objArray.length; i++) {
            array.set(i, objArray[i]);
        }
        return array;
    }

}
