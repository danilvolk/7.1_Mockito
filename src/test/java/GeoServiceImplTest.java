import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import ru.netology.geo.GeoServiceImpl;

public class GeoServiceImplTest {
    @Test
    void byIpTest() {
        String NEW_YORK_IP = "96.44.183.149";
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location location = new Location("New York", Country.USA, " 10th Avenue", 32);


        Location result = geoService.byIp(NEW_YORK_IP);

        Assertions.assertEquals(location,result);

    }
}
