package ru.netology.domen;

public class FilmManager {
    private PurchaseItem[] films = new PurchaseItem[0];
    private int resultLenght = 10;


    public void addNewFilm(PurchaseItem item) {
        PurchaseItem[] tmp = new PurchaseItem[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = item;
        films = tmp;

    }

    public PurchaseItem[] findAll() {
        return films;

    }

    public PurchaseItem[] findLast(int resultLenght) {
        int resultTmp;
        if (resultLenght > films.length) {
            resultTmp = films.length;
        } else {
            resultTmp = resultLenght;
        }

        PurchaseItem[] revers = new PurchaseItem[resultTmp];
        for (int i = 0; i < resultTmp; i++) {
            revers[i] = films[resultTmp - 1 - i];

        }
        return revers;

    }

    public PurchaseItem[] findLast() {
        int resultTmp;
        if (resultLenght > films.length) {
            resultTmp = films.length;
        } else {
            resultTmp = resultLenght;
        }

        PurchaseItem[] revers = new PurchaseItem[resultTmp];
        for (int i = 0; i < resultTmp; i++) {
            revers[i] = films[resultTmp - 1 - i];

        }
        return revers;

    }
}
