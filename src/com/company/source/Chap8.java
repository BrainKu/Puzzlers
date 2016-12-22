package com.company.source;

import com.company.Base;
import com.company.CBase;
import com.company.CChild;

import java.io.UnsupportedEncodingException;

/**
 * Created by brainku on 16/5/21.
 */
public class Chap8 extends Base {
    @Override
    public void test() throws UnsupportedEncodingException {
        puzzler66();
    }

    private void puzzler66() {
        System.out.println((((CBase)new CChild()).name));
    }
}
