import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceImplTest {
    @Test
    void localTest() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        Country country = Country.RUSSIA;
        String hello = "Добро пожаловать";
        String result = localizationService.locale(country);
        Assertions.assertEquals(hello,result);
    }
}

