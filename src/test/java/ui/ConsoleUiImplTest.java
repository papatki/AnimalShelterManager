package ui;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class ConsoleUiImplTest {

    private ConsoleUiImpl consoleUi;

    @Before
    public void setUp() throws Exception {
        consoleUi = new ConsoleUiImpl();
    }

    @Test
    public void shouldTakeUserInput() {

        String input = "User input.";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("User input.",consoleUi.getInput());
    }
}