import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorTests {
    Calculator calculator = new Calculator();
    @Test
    public void testPlus() {
        //given
        int a = 2, b = 3, expected = 5;
        //when
        int result = calculator.plus.apply(a,b);
        //then
        Assertions.assertEquals(result, expected);
    }


    @ParameterizedTest
    @MethodSource("argumentsStream")
    public void testMultiply(int a, int b, int expected) {
        int result = calculator.multiply.apply(a, b);
        Assertions.assertEquals(result, expected);
    }

    public static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(1, 4, 4),
                Arguments.of(7, 3, 21)
        );
    }
}
