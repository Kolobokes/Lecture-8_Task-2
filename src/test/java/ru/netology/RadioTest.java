package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void nextStation() {
        Radio radio = new Radio();
        radio.nextStation(5);
        int expected = 6;
        assertEquals(expected, radio.getStationNumber());
    }

    @Test
    void nextStationOverseasList() {
        Radio radio = new Radio();
        radio.nextStation(9);
        int expected = 0;
        assertEquals(expected, radio.getStationNumber());
    }

    @Test
    void prevStation() {
        Radio radio = new Radio();
        radio.prevStation(5);
        int expected = 4;
        assertEquals(expected, radio.getStationNumber());
    }

    @Test
    void prevStationOverseasList() {
        Radio radio = new Radio();
        radio.prevStation(0);
        int expected = 9;
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
        radio.increaseVolume(3);
        int expected = 4;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void increaseVolumeOverseasList() {
        Radio radio = new Radio();
        radio.increaseVolume(15);
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume(3);
        int expected = 2;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void decreaseVolumeOverseasList() {
        Radio radio = new Radio();
        radio.decreaseVolume(0);
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }
}