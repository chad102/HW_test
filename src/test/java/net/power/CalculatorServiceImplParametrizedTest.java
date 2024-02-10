package net.power;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplParametrizedTest {
    private final CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();
    public static Stream<Arguments> plusParams() {
        return Stream.of(
                Arguments.of(4,2,6),
                Arguments.of(8,9,17)
        );
    }

    public static Stream<Arguments> minusParams() {
        return Stream.of(
                Arguments.of(4,2,2),
                Arguments.of(8,9,-1)
        );
    }

    public static Stream<Arguments> multiplyParams() {
        return Stream.of(
                Arguments.of(4,2,8),
                Arguments.of(8,9,72)
        );
    }

    public static Stream<Arguments> divideParams() {
        return Stream.of(
                Arguments.of(4,2,2),
                Arguments.of(32,4,8)
        );
    }

    @ParameterizedTest
    @MethodSource("plusParams")
    void plus(int num1, int num2, int result) {
        assertEquals(result, calculatorServiceImpl.plus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("minusParams")
    void minus(int num1, int num2, int result) {
        assertEquals(result, calculatorServiceImpl.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("multiplyParams")
    void multiply(int num1, int num2, int result) {
        assertEquals(result, calculatorServiceImpl.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("divideParams")
    void divide(int num1, int num2, int result) {
        assertEquals(result, calculatorServiceImpl.divide(num1, num2));
    }
}
