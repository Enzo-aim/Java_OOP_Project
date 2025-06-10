package ru.netology;
// Класс

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor   // Аннотация  которая описывает конструктор без параметров
@Getter              // Аннотация  которая описывает Get-ры для всех полей



public class Radio {
    private int countStation = 10;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = minStation;
                                                        // Инициализаторы полей
    private int maxVolume = 100;
    private int minVolume = 0;
    private int volume = 0;

    public Radio(int countStation) {
        this.maxStation = countStation - 1;
        this.countStation = maxStation;
    }






    // Метод устанавливающий радиостанцию
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < minStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    // Переключение на следующую радиостанцию (+)
    public void next() {

        int target = currentStation + 1;
        if (target > maxStation) {
            currentStation = minStation;
        } else {
            currentStation = target;

        }

    }

    // Переключение на предыдущую радиостанцию (-)
    public void prev() {
        int target = currentStation - 1;
        if (target < minStation) {
            currentStation = maxStation;
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
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        volume = newVolume;

    }

    // Увеличения (+) громкости (101) (0)
    public void increaseVolume() {
        if (volume < maxVolume) {
            volume++;

        }

    }

    // Уменьшение (-) громкости (0) (-1)
    public void decreaseVolume() {
        if (volume > minVolume) {
            volume--;
        }
    }


}
