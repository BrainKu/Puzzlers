package interview.chap8;

/**
 * Created by brainku on 16/12/22.
 * Section1
 */
public class Section1 {

    public static void main(String[] args) {
//        test4();
        test5();
    }

    private static void test4() {
        char[] inputs = "Mr John Smith".toCharArray();
        char[] biggerInput = new char[100];
        System.arraycopy(inputs, 0, biggerInput, 0, inputs.length);
        System.out.println("length:" + biggerInput.length);
        replaceSpace(biggerInput, inputs.length);
    }

    public static void replaceSpace(char[] inputs, int reallength) {
        int length = reallength;
        for (int i = 0; i < length; i++) {
            if (' ' == inputs[i]) {
                length = replaceSpace(inputs, i, length);
            }
        }
        String str = new String(inputs);
        System.out.println(str);
    }

    private static int replaceSpace(char[] inputs, int index, int length) {
        System.arraycopy(inputs, index + 1, inputs, index + 1 + 2, length - index);
        inputs[index] = '%';
        inputs[index + 1] = '2';
        inputs[index + 2] = '0';
        return length + 2;
    }

    public static void test5() {
        String input = "aabcccccaaab"; // 如果超过10位该怎么办?
        String output = zipString(input);
        System.out.println(output);
    }


    public static String zipString(String input) { // 题目都没看清楚,到底怎么做题的.a 要变成 a1
        if (input == null || input.isEmpty()) return input;
        char[] inputs = input.toCharArray();
        int count = 1;
        char last = inputs[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 1, length = inputs.length; i < length; i++) {
            if (inputs[i] == inputs[i-1]) {
                count++;
            } else {
                sb.append(last);
                sb.append(count);
                last = inputs[i];
                count = 1;
            }
        }
        sb.append(last).append(count);
        return sb.toString();
    }

    public static boolean isRotateBy(String strA, String strB) {
        if (strA == null || strB == null) return false;

        return false;
    }

    public static float[] sqrt(int value, float offset) {
        float[] result = new float[2];

        return result;
    }

    private static String zipString0(String input) {
        if (input == null || input.length() == 1) return input;
        char[] inputs = input.toCharArray();
        int count = 1;
        int end = 0;
        for (int i = 1, length = inputs.length; i < length; i++) {
            if (inputs[i - 1] == inputs[i]) {
                count++;
            } else {
                if (count == 1) {
                    inputs[++end] = inputs[i];
                } else {
                    System.out.println(inputs[i - 1]);
                    System.out.println(count);
                    inputs[++end] = (char) ('0' + count);
                    count = 1;
                }
            }
        }
        if (end == inputs.length - 1) {
            return input;
        }
        return new String(inputs).substring(0, end);
    }
}
