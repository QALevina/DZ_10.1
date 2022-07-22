package ru.netology.radio;

public class Radio {
    public int radioStation;

    public void setRadioStation(int CurrentRadioStation) {
        if (CurrentRadioStation < 0) {
            return;
        }
        if (CurrentRadioStation > 9) {
            return;
        }
        radioStation = CurrentRadioStation;
    }

    public int getCurrentRadioStation() {

        return radioStation;
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

    public int getNextRadio() {
        return radioStation;
    }


    //____________________________________

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

    public int getPrevtRadio() {
        return radioStation;
    }

    //_______________________________________

    public int volume;


    public int increaseVolume(int volumeLevel) {
        if (volumeLevel < 10) {
            volumeLevel++;
        } else {
            volumeLevel = 10;
        }
        volume = volumeLevel;
        return volume;
    }

    public int getIncreaseVolume() {
        return volume;
    }


    //___________________________________________
    public void reduceVolume(int minvolumeLevel) {

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

    public int getReduceVolume() {
        return volume;
    }


}


