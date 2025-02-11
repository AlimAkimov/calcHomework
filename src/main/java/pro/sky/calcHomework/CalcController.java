package pro.sky.calcHomework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalcController {
    private final CalcServiceImpl CalcServiceImpl;

    public CalcController(CalcServiceImpl CalcServiceImpl) {
        this.CalcServiceImpl = CalcServiceImpl;
    }

    @GetMapping(path = "/calculator")
    public String helloCalculatorPage() {
        return CalcServiceImpl.helloCalculatorPage();
    }

    @GetMapping(path = "/calculator/plus")
    public String plusCalc(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        int resultPlus = CalcServiceImpl.plusCalc(number1, number2);
        return number1 + "+" + number2 + "=" + resultPlus;
    }

    @GetMapping(path = "/calculator/minus")
    public String minusCalc(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        int resultMinus = CalcServiceImpl.minusCalc(number1, number2);
        return number1 + "-" + number2 + "=" + resultMinus;
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplyCalc(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        int resultMultiply = CalcServiceImpl.multiplyCalc(number1, number2);
        return number1 + "*" + number2 + "=" + resultMultiply;
    }

    @GetMapping(path = "/calculator/divide")
    public String divideCalc(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        int resultDivide = CalcServiceImpl.divideCalc(number1, number2);
        return number1 + "/" + number2 + "=" + resultDivide;
    }
}
