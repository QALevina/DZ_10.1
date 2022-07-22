package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void stationNumLessMin() {
        Radio station = new Radio();
        station.setRadioStation(-1);

        int excpected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(excpected, actual);
    }

    @Test
    public void stationNumMin() {
        Radio station = new Radio();
        station.setRadioStation(0);

        int excpected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(excpected, actual);

    }

    @Test
    public void stationNumActual() {
        Radio station = new Radio();
        station.setRadioStation(5);

        int excpected = 5;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(excpected, actual);

    }

    @Test
    public void stationNumMax() {
        Radio station = new Radio();
        station.setRadioStation(9);

        int excpected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(excpected, actual);

    }

    @Test
    public void stationNumGreaterMax() {
        Radio station = new Radio();
        station.setRadioStation(10);

        int excpected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(excpected, actual);

    }

    //_______________________

    @Test
    public void maxNextRadio() {
        Radio station = new Radio();
        station.nextRadio(9);

        int excpected = 0;
        int actual = station.getNextRadio();

        Assertions.assertEquals(excpected, actual);

    }

    @Test
    public void actualNextRadio() {
        Radio station = new Radio();
        station.nextRadio(5);


        int excpected = 6;
        int actual = station.getNextRadio();

        Assertions.assertEquals(excpected, actual);

    }

//_______________________

    @Test
    public void minPrevRadio() {
        Radio station = new Radio();
        station.prevRadio(7);

        int excpected = 6;
        int actual = station.getPrevtRadio();

        Assertions.assertEquals(excpected, actual);

    }

    @Test
    public void maxEqualsPrevRadio() {
        Radio station = new Radio();
        station.prevRadio(9);

        int excpected = 8;
        int actual = station.getPrevtRadio();

        Assertions.assertEquals(excpected, actual);

    }

    @Test
    public void maxPrevRadio() {
        Radio station = new Radio();
        station.prevRadio(10);

        int excpected = 9;
        int actual = station.getPrevtRadio();

        Assertions.assertEquals(excpected, actual);

    }

    @Test
    public void actualPrevRadio() {
        Radio station = new Radio();
        station.prevRadio(0);

        int excpected = 9;
        int actual = station.getPrevtRadio();

        Assertions.assertEquals(excpected, actual);

    }

    @Test
    public void minEqualPrevRadio() {
        Radio station = new Radio();
        station.prevRadio(-1);

        int excpected = 9;
        int actual = station.getPrevtRadio();

        Assertions.assertEquals(excpected, actual);

    }

    //_____________________________________

    @Test
    public void maxIncreaseVolume() {
        Radio station = new Radio();
        station.increaseVolume(10);

        int excpected = 10;
        int actual = station.getIncreaseVolume();

        Assertions.assertEquals(excpected, actual);

    }

    @Test
    public void actualIncreaseVolume() {
        Radio station = new Radio();
        station.increaseVolume(5);

        int excpected = 6;
        int actual = station.getIncreaseVolume();

        Assertions.assertEquals(excpected, actual);

    }
    //______________________________________


    @Test
    public void minReduceVolume() {
        Radio station = new Radio();
        station.reduceVolume(0);

        int excpected = 0;
        int actual = station.getReduceVolume();

        Assertions.assertEquals(excpected, actual);

    }

    @Test
    public void minEqualsReduceVolume() {
        Radio station = new Radio();
        station.reduceVolume(-1);

        int excpected = 0;
        int actual = station.getReduceVolume();

        Assertions.assertEquals(excpected, actual);

    }

    @Test
    public void actualReduceVolume() {
        Radio station = new Radio();
        station.reduceVolume(4);

        int excpected = 3;
        int actual = station.getReduceVolume();

        Assertions.assertEquals(excpected, actual);


    }

    @Test
    public void maxEqualReduceVolume() {
        Radio station = new Radio();
        station.reduceVolume(10);

        int excpected = 9;
        int actual = station.getReduceVolume();

        Assertions.assertEquals(excpected, actual);


    }

    @Test
    public void maxReduceVolume() {
        Radio station = new Radio();
        station.reduceVolume(11);

        int excpected = 10;
        int actual = station.getReduceVolume();

        Assertions.assertEquals(excpected, actual);


    }
}
