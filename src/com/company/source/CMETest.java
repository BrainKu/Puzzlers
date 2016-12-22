package com.company.source;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by brainku on 16/5/7.
 */
public class CMETest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 50; i++) {
            list.add(i + "");
        }
        for (String str: list) {
            if (str.equals("23"))
                list.remove("23");
        }
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String test = listIterator.next();
            if (test.equals("23")) {
                listIterator.remove();
                System.out.println("remove !");
                listIterator.add("22");
                listIterator.add("24");
            }
        }
        System.out.println("size:"+list.size());
    }
}
