package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio station = new Radio();

    //Установка
    @Test
    public void currentNumRadioStation() {
        Radio station = new Radio(50);

        int excpected = 50;
        int actual = station.getNumRadioStation();

        Assertions.assertEquals(excpected, actual);
    }
    //Переключение
    @Test
    public void stationNumLessMin() {
        station.nextRadio(-1);

        int excpected = 0;
        int actual = station.getMaxRadioStation();

        Assertions.assertEquals(excpected, actual);
    }

    @Test
    public void stationNumMin() {
         station.nextRadio(0);

        int excpected = 0;
        int actual = station.getMinRadioStation();

        Assertions.assertEquals(excpected, actual);

    }


    @Test
    public void stationNumMax() {
        station.nextRadio(20);

        int excpected = 0;
        int actual = station.getMaxRadioStation();

        Assertions.assertEquals(excpected, actual);
    }



    @Test
    public void stationNumGreaterMax() {
        Radio station = new Radio(50);

        int excpected = 49;
        int actual = station.getMaxRadioStation();

        Assertions.assertEquals(excpected, actual);

    }


    @Test
    public void maxNextRadio() {
        station.nextRadio(9);

        int excpected = 1;
        int actual = station.getNextRadio();

        Assertions.assertEquals(excpected, actual);

    }

    @Test
    public void maxRadioStation() {
        Radio station = new Radio(5,55);
        station.nextRadio(60);

        int excpected = 5;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(excpected, actual);

    }
    @Test
    public void minRadioStation() {
        Radio station = new Radio(5,55);
        station.nextRadio(3);

        int excpected = 55;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(excpected, actual);

    }


//Номер станции

    @Test
    public void сurrentRadioStantion() {
        Radio station = new Radio(7);

        int excpected = 6;
        int actual = station.setCurrentRadioStation();

        Assertions.assertEquals(excpected, actual);

    }

    @Test
    public void defaultСurrentRadioStantion() {
        Radio station = new Radio();

        int excpected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(excpected, actual);

    }


    //_____________________________________

    @Test
    public void maxIncreaseVolume() {
        station.setVolume(100);

        station.increaseVolume();

        int excpected = 100;
        int actual = station.getIncreaseVolume();

        Assertions.assertEquals(excpected, actual);

    }

    @Test
    public void moreMaxIncreaseVolume() {
        station.setVolume(101);

        station.increaseVolume();

        int excpected = 100;
        int actual = station.getIncreaseVolume();

        Assertions.assertEquals(excpected, actual);

    }

    @Test
    public void actualIncreaseVolume() {
        station.setVolume(5);

        station.increaseVolume();

        int excpected = 6;
        int actual = station.getIncreaseVolume();

        Assertions.assertEquals(excpected, actual);

    }


    @Test
    public void minReduceVolume() {
        station.setVolume(0);

        station.increaseVolume();

        int excpected = 1;
        int actual = station.getReduceVolume();

        Assertions.assertEquals(excpected, actual);

    }

    @Test
    public void minEqualsReduceVolume() {
        station.setVolume(-1);

        station.reduceVolume();

        int excpected = 0;
        int actual = station.getReduceVolume();

        Assertions.assertEquals(excpected, actual);

    }

    @Test
    public void actualReduceVolume() {
        station.setVolume(50);

        station.reduceVolume();

        int excpected = 49;
        int actual = station.getReduceVolume();

        Assertions.assertEquals(excpected, actual);


    }

    @Test
    public void maxEqualReduceVolume() {
        station.setVolume(100);

        station.reduceVolume();

        int excpected = 99;
        int actual = station.getReduceVolume();

        Assertions.assertEquals(excpected, actual);


    }

    @Test
    public void moreMaxEqualReduceVolume() {
        station.setVolume(101);

        station.increaseVolume();

        int excpected = 100;
        int actual = station.getReduceVolume();

        Assertions.assertEquals(excpected, actual);


    }



}
