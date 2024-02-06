import org.example.BonusService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000; // подготавливаем данные:
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered); // вызываем целевой метод:
        Assertions.assertEquals(expected, actual); // производим проверку (сравниваем ожидаемый и фактический):
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1_000_000;  // подготавливаем данные:
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);// вызываем целевой метод
        Assertions.assertEquals(expected, actual);// производим проверку (сравниваем ожидаемый и фактический)
    }

    @Test
    void shouldCalculateForNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000; // подготавливаем данные
        boolean registered = false;
        long expected = 10;
        long actual = service.calculate(amount, registered); // вызываем целевой метод
        Assertions.assertEquals(expected, actual); // производим проверку (сравниваем ожидаемый и фактический)
    }

    @Test
    void shouldCalculateForNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1_000_000; // подготавливаем данные
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(amount, registered); // вызываем целевой метод
        Assertions.assertEquals(expected, actual); // производим проверку (сравниваем ожидаемый и фактический)
    }
}