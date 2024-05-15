package ru.netology.homeworks;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxStation;

    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;
    }

    public Radio() {
        maxStation = 9;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > maxStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
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
        if (currentRadioStation != maxStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation != 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxStation;
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