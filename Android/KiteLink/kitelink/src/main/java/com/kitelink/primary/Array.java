package com.kitelink.primary;

import java.util.ArrayList;

/**
 * Created by ming on 2017/2/20.
 */

public class Array extends KLObject {
    private ArrayList<KLObject> objList;


    public Array(int len) {
        objList = new ArrayList<>(len);
    }

    public Array() {
        objList = new ArrayList<>();
    }


    public int length() {
        if (objList != null) {
            return objList.size();
        } else {
            return 0;
        }
    }

    public void set(int index, KLObject o) {
        objList.set(index, o);
    }

    public KLObject remove(int index) {
        return objList.remove(index);
    }

    public KLObject get(int index) {
        return objList.get(index);
    }

}
