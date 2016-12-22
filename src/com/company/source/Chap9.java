package com.company.source;

import com.company.Base;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by brainku on 16/6/26.
 */
public class Chap9 extends Base {
    @Override
    public void test() throws UnsupportedEncodingException {
        puzzler78();
    }

    private void puzzler78() {
        Set<String> stringSet = new HashSet<String>();
        stringSet.add("foo");
        Iterator<String> it = stringSet.iterator();
        try {
            Method m = it.getClass().getMethod("hasNext");
            m.setAccessible(true);
            System.out.println(m.invoke(it));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
