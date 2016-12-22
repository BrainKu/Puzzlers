package com.company;

import com.company.source.Chap6;
import com.company.source.Chap8;
import com.company.source.Chap9;

import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {
	// write your code here

        Base[] bases = {/*new Chap2(), new Chap3()new Chap6(),*/
                /*new Chap8(), */new Chap9()};
        for (int i = 0, length = bases.length; i < length; i++) {
            bases[i].test();
        }
    }
}
