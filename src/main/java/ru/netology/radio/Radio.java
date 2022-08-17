package ru.netology.radio;

public class Radio {


    //ПЕРЕМЕННЫЕ

    private int amountRadioStation = 10;
    private int valueNumRadioStation;

    private int minRadioStation;
    private int maxRadioStation;
    private int currentRadioStation;


    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    //КОНСТРУКТОРЫ

    public Radio(int amountRadioStation) {
        this.currentRadioStation = amountRadioStation - 1;
        this.maxRadioStation = amountRadioStation - 1;
        this.amountRadioStation = amountRadioStation;
    }

    public Radio() {
        this.currentRadioStation = amountRadioStation - 1;

    }

    public Radio(int minRadioStation, int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
        this.minRadioStation = minRadioStation;
    }


    //ГЕТТЕРЫ

    public int getNumRadioStation() {
        return amountRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public int getNextRadio() {
        return currentRadioStation + 1;
    }

//-----------------------------------


    public int getIncreaseVolume() {
        return currentVolume;
    }

    public int getReduceVolume() {
        return currentVolume;
    }

    //СЕТТЕРЫ

    public int setCurrentRadioStation() {
        currentRadioStation = amountRadioStation - 1;
        return currentRadioStation;
    }


    public void setVolume(int newCurrentVolume) {

        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }


    //_________________________________

    public void nextRadio(int newStantion) {
        if (newStantion < maxRadioStation) {
            newStantion++;
        }

        if (newStantion < minRadioStation) {
            newStantion = maxRadioStation;
        }
        if (newStantion > maxRadioStation) {
            newStantion = minRadioStation;
        }
        currentRadioStation = newStantion;

    }


    public void increaseVolume() {
        int volumeLevel = currentVolume;

        if (volumeLevel < maxVolume) {
            volumeLevel++;
        }
        if (volumeLevel >= maxVolume) {
            volumeLevel = maxVolume;
        }
        currentVolume = volumeLevel;

    }

    public void reduceVolume() {
        int minvolumeLevel = currentVolume;

        if (minvolumeLevel <= minVolume) {
            return;
        }

        if (minvolumeLevel < maxVolume) {
            minvolumeLevel--;
        }
        if (minvolumeLevel == maxVolume) {
            minvolumeLevel--;
        }
        currentVolume = minvolumeLevel;

    }


}




