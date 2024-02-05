package net.power;

public class NoParamException extends IllegalArgumentException{
    public NoParamException() {
        super("Ошибка! Не передан один из параметров");
    }
}
