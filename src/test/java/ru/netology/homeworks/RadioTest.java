package ru.netology.homeworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(4);

        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(12);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-3);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationBelowMin2() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(56);

        int expected = 56;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(110);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-6);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeBelowMin2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeBelowMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeAboveMax2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationTest() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);
        radio.next();

        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationNext() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.next();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void radioStationNext2() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);
        radio.next();

        int expected = 2;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationNext3() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationNext4() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationPrev() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(4);
        radio.prev();

        int expected = 3;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationPrev2() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationPrev3() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);
        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationPrev4() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.prev();

        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationPrev5() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(78);
        radio.moreVolume();

        int expected = 79;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.moreVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolume3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.moreVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolume4() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.moreVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolume5() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.moreVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeLess() {
        Radio radio = new Radio();

        radio.setCurrentVolume(34);
        radio.lessVolume();

        int expected = 33;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeLess2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.lessVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeLess3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.lessVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeLess4() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.lessVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeLess5() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.lessVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationCount() {
    Radio radio = new Radio(20);

    radio.setCurrentRadioStation(15);

    int expected = 15;
    int actual = radio.getCurrentRadioStation();
    Assertions.assertEquals(expected, actual);
    }
}