package net.power;

import org.springframework.stereotype.Service;

import static org.springframework.util.ObjectUtils.isEmpty;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String answerCalculator(){
        return "Добро пожаловать в калькулятор";
    }

    public Integer plus (Integer num1, Integer num2){
        if (isEmpty(num1) || isEmpty(num2)) {
            throw new NoParamException();
        }
        return num1 + num2;
    }

    public Integer minus (Integer num1, Integer num2){
        if (isEmpty(num1) || isEmpty(num2)) {
            throw new NoParamException();
        }
        return num1 - num2;
    }

    public Integer multiply (Integer num1, Integer num2){
        if (isEmpty(num1) || isEmpty(num2)) {
            throw new NoParamException();
        }
        return num1 * num2;
    }

    public Integer divide (Integer num1, Integer num2){
        if (isEmpty(num1) || isEmpty(num2)) {
            throw new NoParamException();
        }
        if (num2 == 0) {
            throw new DivideByZeroException();
        }
        return num1/num2;
    }
}
