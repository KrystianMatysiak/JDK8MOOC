import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.powermock.reflect.Whitebox;

/**
 * Created by Krystian on 2015-07-15.
 */
public class Lesson1Test {

    @Test
    public void exercise1() {
        // given
        String result = null;
        Lesson1 lesson1 = new Lesson1();

        // when
        try {
            result = Whitebox.invokeMethod(lesson1, "exercise1");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // then
        String expected = "abcdef";
        Assert.assertEquals("exercise1 wrong result.", expected, result);
    }

    @Test
    public void exercise2() {
        // given
        List<String> result = null;
        Lesson1 lesson1 = new Lesson1();

        // when
        try {
            result = Whitebox.invokeMethod(lesson1, "exercise2");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // then
        List<String> expected = new ArrayList<>(Arrays.asList("echo"));
        Assert.assertEquals("exercise2 wrong result.", expected, result);
    }

    @Test
    public void exercise3() {
        // given
        List<String> result = null;
        Lesson1 lesson1 = new Lesson1();

        // when
        try {
            result = Whitebox.invokeMethod(lesson1, "exercise3");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // then
        List<String> expected = new ArrayList<>(Arrays.asList("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot"));
        Assert.assertEquals("exercise3 wrong result.", expected, result);
    }

    @Test
    public void exercise4() {
        // given
        String result = null;
        Lesson1 lesson1 = new Lesson1();

        // when
        try {
            result = Whitebox.invokeMethod(lesson1, "exercise4");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // then
        String expected = "c3b2a1";
        Assert.assertEquals("exercise4 wrong result.", expected, result);
    }

    @Test
    public void exercise5() {
        // given
        List<Integer> result = null;
        Lesson1 lesson1 = new Lesson1();

        // when
        try {
            result = Whitebox.invokeMethod(lesson1, "exercise5");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // then
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Assert.assertEquals("exercise5 wrong result.", expected, result);
    }
}
