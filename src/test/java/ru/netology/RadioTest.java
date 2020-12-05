package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void nextStation() {
        Radio radio = new Radio();
        radio.setStationNumber(5);
        radio.nextStation();
        int expected = 6;
        assertEquals(expected, radio.getStationNumber());
    }

    @Test
    void nextStationOverseasList() {
        Radio radio = new Radio(10);
        radio.setStationNumber(10);
        radio.nextStation();
        int expected = 0;
        assertEquals(expected, radio.getStationNumber());
    }

    @Test
    void prevStation() {
        Radio radio = new Radio();
        radio.setStationNumber(5);
        radio.prevStation();
        int expected = 4;
        assertEquals(expected, radio.getStationNumber());
    }

    @Test
    void prevStationOverseasList() {
        Radio radio = new Radio(10);
        radio.setStationNumber(0);
        radio.prevStation();
        int expected = 10;
        assertEquals(expected, radio.getStationNumber());
    }

    @Test
    void changeStationNumber() {
        Radio radio = new Radio();
        radio.changeStationNumber(2);
        int expected = 2;
        assertEquals(expected, radio.getStationNumber());
    }

    @Test
    void changeStationNumberOverseasList() {
        Radio radio = new Radio();
        radio.changeStationNumber(20);
        int expected = 0;
        assertEquals(expected, radio.getStationNumber());
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(3);
        radio.increaseVolume();
        int expected = 4;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void increaseVolumeOverseasList() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        int expected = 100;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(3);
        radio.decreaseVolume();
        int expected = 2;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void decreaseVolumeOverseasList() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }
}