import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {
    //Проверка уменьшение громкости при значении текущей громкости больше (0)
    @Test
    public void checkDecreaseVolumeMoreThanZero() {
        Radio radio = new Radio();
        radio.setVolume(5);
        radio.decreaseVolume();
        int expected = 4;                          // Ожидаемый
        int actual = radio.getVolume();            // Фактический
        Assertions.assertEquals(expected, actual);
    }

    //Проверка уменьшение громкости при значении текущей громкости (0)
    @Test
    public void checkDecreaseVolumeLessThanZero() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        int expected = 0;                         // Ожидаемый
        int actual = radio.getVolume();           // Фактический
        Assertions.assertEquals(expected, actual);

    }

    //Проверка увеличения громкости при текущем значении (100)
    @Test
    public void increaseVolumeAtTickValueOneHundred() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        int expected = 100;                           // Ожидаемый
        int actual = radio.getVolume();               // Фактический
        Assertions.assertEquals(expected, actual);
    }

    //Проверка увеличения громкости при текущем значении (99)
    @Test
    public void increaseVolumeAtTickValueNinetyNine() {
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.increaseVolume();
        int expected = 100;                           // Ожидаемый
        int actual = radio.getVolume();               // Фактический
        Assertions.assertEquals(expected, actual);

    }

    //Проверка уменьшение (-) громкости (0) (-1)
    @Test
    public void checkingVolumeSettingToNegativeValue() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        int expected = 0;                              // Ожидаемый
        int actual = radio.getVolume();                // Фактический
        Assertions.assertEquals(expected, actual);

    }

    //Проверка увеличения (+) громкости (101) (0)
    @Test
    public void сheckingIfTheVolumeIsSetAboveMaximum() {
        Radio radio = new Radio();
        radio.setVolume(101);
        int expected = 0;                              // Ожидаемый
        int actual = radio.getVolume();                // Фактический
        Assertions.assertEquals(expected, actual);

    }

    //Проверка установка радиостанции через прямое указание её номера
    @Test
    public void installingARadioStationByDirectlySpecifyingItsNumber() {
        Radio radio = new Radio();
        radio.setRandomStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    //Проверка переключение на предыдущую радиостанцию при условии, что текущая радио станция больше 0
    @Test
    public void switchingToThePreviousRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    //Проверка переключение на предыдущую радиостанцию при условии текущая равна 0
    @Test
    public void switchingToThePreviousRadioStationIfCurrentNull() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    //Проверка переключение на следующую радиостанцию при условии
    @Test
    public void switchingToTheNextRadioStationIfCurrentNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    //Проверка переключение на следующую радиостанцию при условии, что текущая радио станция меньше 9
    @Test
    public void switchingToTheNextRadioStationIfCurrentOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.next();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    //Проверка установки текущей радиостанции больше 9
    @Test
    public void checkingTheCurrentRadioStationSettingIsGreaterThan() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    //Проверка установки текущей радиостанции меньше 0
    @Test
    public void сheckingTheCurrentRadioStationSettingIsLess() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);


    }
}