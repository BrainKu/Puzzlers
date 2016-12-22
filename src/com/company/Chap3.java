package com.company;

import java.io.UnsupportedEncodingException;

/**
 * Chap3
 * Created by brainku on 16/5/10.
 */
public class Chap3 extends Base {

    @Override
    public void test() throws UnsupportedEncodingException {
        puzzler24();
//        puzzler26();
        puzzler27();
//        puzzler28();
//        puzzler29();
//        puzzler32();
//        puzzler33();
        puzzler34();
        puzzler35();
        puzzler36();
        puzzler38();
//        puzzler39();
//        puzzler40();
//        SpecialTest.main(null);
        puzzler42();
        puzzler45();
    }

    private void puzzler45() {
        workout();
        System.out.println("It is a nap time");
    }

    private static void workout() {
        try {
            workout();
        } finally {
            workout();
        }
    }

    private void puzzler42() {
        int[][] tests = {{6,5,4,3,2,1}, {1,2}, {1,2,3},{1,2,3,4},{1}};
        int successCount = 0;
        try {
            int i = 0;
            while (true) {
                if (thirdEleIsThree(tests[i++]))
                    successCount++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // ignore
        }
        System.out.println("success:"+successCount);
    }

    private boolean thirdEleIsThree(int[] test) {
        return test.length >= 3 & test[2] == 3;
    }

    private void puzzler39() {
        try {
            System.out.println("hello world");
            System.exit(0);
        } finally {
            System.out.println("goodbye world");
        }
    }

    private static final long USER_ID = getUserId();

    private static long getUserId() {
        return 3L;
    }

    private void puzzler38() {
        System.out.println(USER_ID);
    }

    private void puzzler36() {
        System.out.println(decision());
    }

    private static boolean decision() {
        try {
            return true;
        } finally {
            return false;
        }
    }

    private void puzzler35() {
        int minutes = 0;
        for (int ms = 0; ms < 60 * 60 * 1000; ms++) {
            if (ms % 60 * 1000 == 0) {
                minutes++;
            }
        }
        System.out.println("mintues:"+minutes);
    }

    private void puzzler34() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) {
            count++;
        }
        System.out.println("count:"+count);
    }

    private void puzzler33() {
//        int i = 1;
        float i = 0f;
        while (i != 0 && i == -i) {
            System.out.println("true");
        }
        System.out.println("false");
    }

    private void puzzler32() {
        Integer i = 222;
        Integer j = 222;
        while (i <= j && j <= i && i !=j) {
            System.out.println("false");
        }
        System.out.println("true");
    }

    private void puzzler29() {
        double i = Double.NaN;
        while ( i != i) {

        }
    }

    private void puzzler28() {
//        int i = 0;
        double i = Double.NEGATIVE_INFINITY;
        while (i == i+1) {
            System.out.println("ha");
        }
        System.out.println("hehe");
    }

    private void puzzler27() {
        byte i = -1;
        System.out.println(i << 10);
    }

    public static final int END = Integer.MAX_VALUE;
    public static final int START = END - 100;

    private void puzzler26() {
        int count = 0;
        for (int i = START; i <= END; i++) {
            count++;
        }
        System.out.println(count);
    }

    private void puzzler24() {
        for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
            if (b == 0x90)
                System.out.println("Joy!");
        }
    }
}
