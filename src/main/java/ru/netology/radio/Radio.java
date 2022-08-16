package ru.netology.radio;

public class Radio {
    private int radioStation;
    private int volume;

    public int getCurrentRadioStation() {
        return radioStation;
    }

    public int getNextRadio() {
        return radioStation;
    }


    public int getPrevtRadio() {
        return radioStation;
    }

    public int getIncreaseVolume() {
        return volume;
    }

    public int getReduceVolume() {
        return volume;
    }

    public void setVolume(int CurrentVolume) {

        if (CurrentVolume < 0) {
            return;
        }
        if (CurrentVolume > 10) {
            return;
        }
        volume = CurrentVolume;
    }

    public void setRadioStation(int CurrentRadioStation) {
        if (CurrentRadioStation < 0) {
            return;
        }
        if (CurrentRadioStation > 9) {
            return;
        }
        radioStation = CurrentRadioStation;
    }


    //_________________________________

    public int nextRadio(int newStantion) {
        if (newStantion < 9) {
            newStantion++;
        } else {
            newStantion = 0;
        }
        radioStation = newStantion;
        return radioStation;
    }


    public int prevRadio(int newStantion) {


        if (newStantion <= 9) {
            newStantion--;
        }
        if (newStantion > 9) {
            newStantion = 9;
        }

        if (newStantion <= 0) {
            newStantion = 9;
        }

        radioStation = newStantion;
        return radioStation;
    }


    public int increaseVolume() {
        int volumeLevel = volume;
        if (volumeLevel < 10) {
            volumeLevel++;
        } else {
            volumeLevel = 10;
        }
        volume = volumeLevel;
        return volume;
    }


    //___________________________________________
    public void reduceVolume() {
        int minvolumeLevel = volume;

        if (minvolumeLevel <= 0) {
            return;
        }

        if (minvolumeLevel <= 10) {
            minvolumeLevel--;
        }
        if (minvolumeLevel > 10) {
            minvolumeLevel = 10;
        }
        volume = minvolumeLevel;

    }


}


