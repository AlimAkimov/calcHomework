package pro.sky.calcHomework;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    @Override
    public String helloCalculatorPage() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int plusCalc(int number1, int number2) {
        return number1 + number2;
    }

    @Override
    public int minusCalc(int number1, int number2) {
        return number1 - number2;
    }

    @Override
    public int multiplyCalc(int number1, int number2) {
        return number1 * number2;
    }

    @Override
    public int divideCalc(int number1, int number2) {
        return number1 / number2;
    }

}
