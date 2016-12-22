package com.company;

/**
 * Created by brainku on 16/5/18.
 */
public class SpecialTest {

    public SpecialTest() throws Exception {
//        throw new Exception("Exception!");
    }

    private SpecialTest specialTest = new SpecialTest();
    public static void main(String[] args) {
        try {
            SpecialTest s = new SpecialTest();
            System.out.println("suprise");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("I catch it");
        }
    }
}
