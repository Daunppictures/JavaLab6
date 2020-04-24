package ua.lviv.iot;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import org.junit.Test;

public class WordReplacerTest {

    @Test
    public void replaceWrongWordsTest() {
        String text = "throw word test";
        InputStream in = new ByteArrayInputStream(text.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        scanner.close();
        String expected = "WRONG word test";
        String actual = WordReplacer.replaceWrongWords(text, "WRONG");
        assertEquals(expected, actual);
    }
}