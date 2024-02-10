package net.power;

public class DivideByZeroException extends IllegalArgumentException {
    public DivideByZeroException() {
        super("Ошибка! Деление на 0 невозможно");
    }
}
