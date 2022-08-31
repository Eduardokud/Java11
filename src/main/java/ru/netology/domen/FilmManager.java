package ru.netology.domen;

public class FilmManager {
    private PosterItem[] films = new PosterItem[0];
    private int resultLenght = 10;


    public void addNewFilm(PosterItem item) {
        PosterItem[] tmp = new PosterItem[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = item;
        films = tmp;

    }

    public PosterItem[] findAll() {
        return films;

    }

    public PosterItem[] findLast(int resultLenght) {
        int resultTmp;
        if (resultLenght > films.length) {
            resultTmp = films.length;
        } else {
            resultTmp = resultLenght;
        }

        PosterItem[] revers = new PosterItem[resultTmp];
        for (int i = 0; i < resultTmp; i++) {
            revers[i] = films[resultTmp - 1 - i];

        }
        return revers;

    }

    public PosterItem[] findLast() {
        int resultTmp;
        if (resultLenght > films.length) {
            resultTmp = films.length;
        } else {
            resultTmp = resultLenght;
        }

        PosterItem[] revers = new PosterItem[resultTmp];
        for (int i = 0; i < resultTmp; i++) {
            revers[i] = films[resultTmp - 1 - i];

        }
        return revers;

    }
}
