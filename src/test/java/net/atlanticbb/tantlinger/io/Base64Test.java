package net.atlanticbb.tantlinger.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Base64Test {

    /**
     * This validates acceptance criteria XXXXX.XX.X
     */
    @DisplayName("AC XXXXX.XX.X")
    @Test
    void exampleTest() throws Exception {
        String data = "123abc";
        String expected = "rO0ABXQABjEyM2FiYw==";
    
        Assertions.assertEquals(data == expected, false);
    }
}
