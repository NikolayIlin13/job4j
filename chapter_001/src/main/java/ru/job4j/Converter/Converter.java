package ru.job4j.converter;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return  value * 79;

    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары.
     */
    public int rubleToDollar(int value) {
        return value * 68;

    }

    /**
     * Конвертируем   евро в рубли.
     * @param value евро.
     * @return рубли.
     */
    public int euroToruble(int value) {
        return value / 79;
    }

    /**
     * Конвертируем  доллары в рубли .
     * @param value доллары.
     * @return рубли
     */
    public int dollarToruble(int value) {
        return value / 68;
    }
}