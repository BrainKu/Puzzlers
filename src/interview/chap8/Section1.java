package interview.chap8;

/**
 * Created by brainku on 16/12/22.
 */
public class Section1 {

    public static void main(String[] args) {
        test4();
    }

    private static void test4() {
        char[] inputs = "abcd efgh  123123".toCharArray();
        inputs = "Mr John Smith".toCharArray();
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
        inputs[index+1] = '2';
        inputs[index+2] = '0';
        return length + 2;
    }
}
