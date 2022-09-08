package ru.netology.domen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    PosterItem film1 = new PosterItem(1, "Бладшот");
    PosterItem film2 = new PosterItem(2, "Вперёд");
    PosterItem film3 = new PosterItem(3, "Отель <<Белград>> ");
    PosterItem film4 = new PosterItem(4, "Джентльиены");
    PosterItem film5 = new PosterItem(5, "Человек - невидимка");
    PosterItem film6 = new PosterItem(6, "Тролли.Мировой тур");
    PosterItem film7 = new PosterItem(7, "Номер один");

    @Test
    public void addnewFilm() {
        FilmManager manager = new FilmManager();
        manager.addNewFilm(film1);
        manager.addNewFilm(film2);
        manager.addNewFilm(film3);
        manager.addNewFilm(film4);
        manager.addNewFilm(film5);
        manager.addNewFilm(film6);
        manager.addNewFilm(film7);
        PosterItem[] expected = {film1, film2, film3, film4, film5, film6, film7};
        PosterItem[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void findLastDefaultLength() {
        FilmManager manager = new FilmManager();
        manager.addNewFilm(film1);
        manager.addNewFilm(film2);
        manager.addNewFilm(film3);
        manager.addNewFilm(film4);
        manager.addNewFilm(film5);
        manager.addNewFilm(film6);
        manager.addNewFilm(film7);
        PosterItem[] expected = {film7, film6, film5, film4, film3, film2, film1};
        PosterItem[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastNoDefaultLength() {
        FilmManager manager = new FilmManager(4);
        manager.addNewFilm(film1);
        manager.addNewFilm(film2);
        manager.addNewFilm(film3);
        manager.addNewFilm(film4);
        manager.addNewFilm(film5);
        manager.addNewFilm(film6);
        manager.addNewFilm(film7);
        PosterItem[] expected = {film4, film3, film2, film1};
        PosterItem[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
}
