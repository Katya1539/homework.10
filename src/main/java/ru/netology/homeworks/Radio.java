package ru.netology.homeworks;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public void setCurrentRadioStation ( int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

     public int getCurrentRadioStation() {
        return currentRadioStation;
     }

     public void setCurrentVolume( int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void next() {
        if (currentRadioStation != 9) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation != 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = 9;
        }
    }

    public void moreVolume() {
        if (currentVolume != 100) {
            currentVolume++;
        } else {
            currentVolume = currentVolume;
        }
    }

    public void lessVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = currentVolume;
        }
    }
}

