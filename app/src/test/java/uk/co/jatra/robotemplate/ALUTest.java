package uk.co.jatra.robotemplate;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.assertj.core.api.Assertions.fail;

@Config(emulateSdk=18)
@RunWith(RobolectricTestRunner.class)
public class ALUTest {

    @Test
    public void test_ALU_add() {
        Assertions.assertThat(ALU.add(1, 2))
                .isEqualTo(3);
    }
    @Test
    public void test_ALU_add_fail() {
        Assertions.assertThat(ALU.add(1, 2))
                .isEqualTo(4);
    }

    @Test
    public void test_ALU_div_byZero() {
        try {
            ALU.div(1, 0);
            fail("Div by zero should throw exception");
        } catch (ArithmeticException ae) {
            //correct
        }
    }
}