package ua.lviv.iot.regex;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class NumberUtilsText {

    @Test
    public void findNumbersInTextAndReverseItTest() {
        String input = "Harry Potter number: 1234567  , Hermiony Granger number: 12-34-56-7, Ron" +
                " " +
                "Wisley number: 123-45-67 ";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        try (Scanner text = new Scanner(System.in)) {
            String stringToCheck = text.nextLine();
            String expected = "Harry Potter number:  7654321 , Hermiony Granger number:7-65-43-21 , " +
                    "Ron " +
                    "Wisley number: 76-54-321 ";
            assertEquals(expected,
                    NumberUtils.findNumbersInTextAndReverseIt(stringToCheck));
        }
    }
}
