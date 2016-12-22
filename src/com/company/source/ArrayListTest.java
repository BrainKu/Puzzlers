package com.company.source;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayListTest
 * Created by brainku on 16/5/7.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayListTest listTest = new ArrayListTest();
        listTest.testSubList();
    }

    public void testSubList() {
        List<String> strings = initList(50);
        List<String> subList = strings.subList(10, 20);
        strings.remove(0);
        subList.set(1, "123123");
        System.out.println("current size:" + strings.size());
    }

    private ArrayList<String> initList(int size) {
        ArrayList<String> list = new ArrayList<String>(size);
        for (int i = 0; i < size; i++) {
            list.add("index:" + size);
        }
        return list;
    }
}
