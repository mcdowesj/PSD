import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by smcdowell on 20/01/2015.
 */
public class MyTestClass {

    @Test
    public void testConcat(){
        MyClass mc = new MyClass();
        String result = mc.concat("one", "two");
        Assert.assertEquals(result, "onetwo");
    }

    @Test
    public void testIsPrime(){
      MyClass mc = new MyClass();
        Assert.assertEquals(mc.isPrime(23), true);
    }


    @Test
    public void testIsListPrime(){
        MyClass mc = new MyClass();
        int[] nums = {1, 3, 7};
        Assert.assertEquals(mc.isListPrime(nums), true);

    }

    @Test
    public void testListSorter(){
        MyClass mc = new MyClass();
        List<String> strings = new ArrayList<String>();
        strings.add("Hello ");
        strings.add("World ");
        strings.add(", ");
        strings.add("my ");
        strings.add("name ");
        strings.add("is ");
        strings.add("Joe. ");
        List<String> sorted = strings;
        Collections.sort(sorted);
        List<String> maybeSorted = mc.listSorter(strings);

        Assert.assertEquals(maybeSorted, sorted);

    }
}
