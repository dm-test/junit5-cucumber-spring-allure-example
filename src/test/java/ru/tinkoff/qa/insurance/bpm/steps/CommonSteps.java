package ru.tinkoff.qa.insurance.bpm.steps;

import io.cucumber.java.ru.Тогда;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;

@Slf4j
public class CommonSteps {

    @Тогда("сумма чисел {} и {} даст результат {}")
    public void checkSum(int num1, int num2, int resultExpected) {
        log.info("тест стартует");
        int resultActual = num1 + num2;
        Assertions.assertEquals(resultExpected, resultActual, "Сумма чисел не соответствует ожидаемому результату");
        log.info("тест завершен");
    }
}
