package interview.test;

import interview.chap8.Section1;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by brainku on 16/12/26.
 * Section1Test
 */
public class Section1Test {

    Section1 section1 = new Section1();

    @Test
    public void testZipString() {
        Map<String, String> maps = new HashMap<String, String>();
        maps.put("aabbccddee", "a2b2c2d2e2");
        maps.put("aaaaaaaaaa", "a10");
        maps.put("a", "a1");
        maps.put("aaaaaaaaaab", "a10b1");
        maps.put("abcdefghijklmn", "a1b1c1d1e1f1g1h1i1j1k1l1m1n1");
        maps.put("aaaaaaaaaabbbbbbbbbb", "a10b10");
        for (String key : maps.keySet()) {
            Assert.assertEquals(maps.get(key), Section1.zipString(key));
        }
    }
}

