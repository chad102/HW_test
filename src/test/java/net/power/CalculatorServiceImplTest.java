package net.power;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void plus() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        Integer result = calculatorService.plus(15,12);
        Assertions.assertEquals(27,result);
    }

    @Test
    void plus2() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        Integer result = calculatorService.plus(7,8);
        Assertions.assertEquals(15,result);
    }

    @Test
    void minus() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        Integer result = calculatorService.minus(2,3);
        Assertions.assertEquals(-1,result);
    }

    @Test
    void minus2() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        Integer result = calculatorService.minus(4,1);
        Assertions.assertEquals(3,result);
    }

    @Test
    void multiply() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        Integer result = calculatorService.multiply(2,3);
        Assertions.assertEquals(6,result);
    }

    @Test
    void multiply2() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        Integer result = calculatorService.multiply(4,8);
        Assertions.assertEquals(32,result);
    }

    @Test
    void divideException() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        String message = "Ошибка! Деление на 0 невозможно";
        Exception exception = Assertions.assertThrows(DivideByZeroException.class, () -> calculatorService.divide(1,0));
        assertEquals(message,exception.getMessage());
    }

    @Test
    void divide() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        Integer result = calculatorService.divide(8,8);
        Assertions.assertEquals(1,result);
    }

    @Test
    void divide2() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        Integer result = calculatorService.divide(5,8);
        Assertions.assertEquals(0,result);
    }

}