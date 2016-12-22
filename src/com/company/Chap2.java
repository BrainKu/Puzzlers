package com.company;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Chap2
 * Created by brainku on 16/5/4.
 */
public class Chap2 extends Base{

    public void test() throws UnsupportedEncodingException {
        puzzler10();
        puzzler11();
        puzzler12();
        puzzler13();
        puzzler14();
        puzzler15();
//        puzzler18();
        puzzler20();
        puzzler21();
        puzzler22();
        puzzler23();
    }

    private void puzzler23() {
        Random rnd = new Random();
        StringBuffer sb = null;
        switch (rnd.nextInt(2)) {
            case 1: sb = new StringBuffer('G');
            case 2: sb = new StringBuffer('G');
            default: sb = new StringBuffer('M');
        }
        sb.append("a").append("i").append("n");
        System.out.println(sb);
    }

    private void puzzler22() {
        System.out.print("iexplore:");
        http://www.google.com;
        System.out.println(":maxmize");
    }

    private void puzzler21() {
        System.out.println(this.getClass().getName().replaceAll("\\.", "\t") + ".class");
    }

    private void puzzler20() {
        System.out.println(Chap2.class.getSimpleName().replace(".", "/") + ".class");
    }

    private void puzzler18() throws UnsupportedEncodingException {
        byte[] bytes = new byte[256];
        for (int i = 0; i < 256; i++) {
            bytes[i] = (byte)i;
        }
        String str = new String(bytes, "ISO-8859-1");
        for (int i = 0, n = bytes.length; i < n; i++) {
            System.out.print((int)str.charAt(i) + " ");
        }
    }

    private void puzzler15() {
        // Note: /u000A // is Unicode representation of linefeed (LF)
//        char c = 0x000A;
//        System.out.println(c);
    }

    private void puzzler14() {
        System.out.println("a\u0022.length()+\u0022b".length());
    }

    private void puzzler13() {
        final String pig = "length: 10";
        final String dog = "length: " + pig.length();
        System.out.println("pig == dog:"+ pig == dog);
    }

    private void puzzler12() {
        String letters = "ABC";
        char[] numbers = {'1', '2', '3'};
        List<Character> cs = Arrays.asList('1', '2', '3');

        System.out.println(letters + " easy as " + cs);
        // ABC easy as [??,??,??]
    }

    public void puzzler10() {
        String i = "1";
        Object x = "1";
//        x += i;
        x = x + i;
        System.out.println("current x :" + x);
    }

    public void puzzler11() {
        System.out.println("H" + "a");
        System.out.println('H' + 'a');
        System.out.println("2 + 2 = " + 2 + 2);
    }
}
