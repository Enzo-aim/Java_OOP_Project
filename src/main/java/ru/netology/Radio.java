package ru.netology;

public class Radio {
    private int currentStation;  //Текущая радио станция
    private int volume;          // Текущая громкость

    //  Метод возвращает текущую радио станцию
    public int getCurrentStation() {
        return currentStation;
    }

    public int getVolume() {
        return volume;


    }

    // Метод устанавливающий радиостанцию
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    // Переключение на следующую радиостанцию (+)
    public void next() {

        int target = currentStation + 1;
        if (target > 9) {
            currentStation = 0;
        } else {
            currentStation = target;

        }

    }

    // Переключение на предыдущую радиостанцию (-)
    public void prev() {
        int target = currentStation - 1;
        if (target < 0) {
            currentStation = 9;
        } else {
            currentStation = target;

        }
    }

    // Установка радиостанции через прямое указание её номера
    public void setRandomStation(int randomStation) {
        setCurrentStation(randomStation);
    }

    // Метод прямой установки звука
    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;

    }

    // Увеличения (+) громкости (101) (0)
    public void increaseVolume() {
        if (volume < 100) {
            volume++;

        }

    }

    // Уменьшение (-) громкости (0) (-1)
    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }


}
