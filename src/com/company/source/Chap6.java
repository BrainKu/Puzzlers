package com.company.source;

import com.company.Base;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 * Created by brainku on 16/5/21.
 */
public class Chap6 extends Base {
    @Override
    public void test() throws UnsupportedEncodingException {
        puzzler46();
//        testRemove();
        testStaticHide();
        puzzler49();
        L.p();
//        puzzler50();
        puzzler51();
        L.p();
        puzzler52();
        puzzler54();
        puzzler55();
    }

    private void puzzler55() {
        for (int i = 0; i < 100; i++) {
            ColorPoint colorPoint = new ColorPoint(1, 1, "red");
        }
    }

    private void puzzler54() {
        Missing.greet();
        ((Missing) null).greet();
    }

    static {
        initIfNeccessary();
    }

    private static int sum;
    private static boolean hasInif;

    public static int getSum() {
        initIfNeccessary();
        return sum;
    }

    private static synchronized void initIfNeccessary() {
        if (!hasInif) {
            for (int i = 0; i < 100; i++) {
                sum+=i;
            }
            hasInif = true;
        }
    }

    private void puzzler52() {
        System.out.println(Chap6.getSum());
    }

    static class Point {
        private final int x, y;
        public final String name;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
            name = makeName();
        }
        protected String makeName() {
            return "[" + x + "," + y +"]";
        }

        @Override
        public String toString() {
            return name;
        }
    }

    static class ColorPoint extends Point {
        private final String color;

        public ColorPoint(int x, int y, String color) {
            super(x, y);
            this.color = color;
        }

        @Override
        protected String makeName() {
            return super.makeName() + ":" + color;
        }
    }

    private void puzzler51() {
        System.out.println(new ColorPoint(2,2, "yellow"));
    }

    static class Type {}

    private void puzzler50() {
        cast1();
        cast2();
        cast3();
    }

    private void cast3() {
        Type t = (Type)new Object();
    }

    private void cast2() {
        Type t = new Type();
//        System.out.println(t instanceof String);
    }

    private void cast1() {
        Type t = null;
        System.out.println(t instanceof Type);
    }


    static int YEAR = Calendar.getInstance().get(Calendar.YEAR);
    static Chap6 Instance = new Chap6();
    int year;
    public Chap6() {
        year = YEAR - 1930;
    }

    private void puzzler49() {
        System.out.println("year:"+Instance.year);
    }

    static class Child {
        public static Child Hello() { return new Child(); }
    }

    static class ChildChild extends Child {
        public static ChildChild Hello(){ return new ChildChild();}
    }

    private void testStaticHide() {
        System.out.println(ChildChild.Hello());
    }

    private void testRemove() {
        List<Object> list = new ArrayList<Object>();
        list.addAll(Arrays.asList(0, 10, 20, 30));
        list.remove(new Integer(10));
        System.out.println("List size:"+list.size());
    }

    static class Confuse {
        public Confuse(Object object) {
            System.out.println("object");
        }
        public Confuse(double[] darray) {
            System.out.println("double array");
        }
    }

    private void puzzler46() {
        Confuse c = new Confuse(null);
    }
}
