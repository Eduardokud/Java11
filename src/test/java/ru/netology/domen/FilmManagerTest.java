package ru.netology.domen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    PurchaseItem film1 = new PurchaseItem(1, "Бладшот");
    PurchaseItem film2 = new PurchaseItem(2, "Вперёд");
    PurchaseItem film3 = new PurchaseItem(3, "Отель <<Белград>> ");
    PurchaseItem film4 = new PurchaseItem(4, "Джентльиены");
    PurchaseItem film5 = new PurchaseItem(5, "Человек - невидимка");
    PurchaseItem film6 = new PurchaseItem(6, "Тролли.Мировой тур");
    PurchaseItem film7 = new PurchaseItem(7, "Номер один");

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
        PurchaseItem[] expected = {film1, film2, film3, film4, film5, film6, film7};
        PurchaseItem[] actual = manager.findAll();
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
        PurchaseItem[] expected = {film7, film6, film5, film4, film3, film2, film1};
        PurchaseItem[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastNoDefaultLength() {
        FilmManager manager = new FilmManager();
        manager.addNewFilm(film1);
        manager.addNewFilm(film2);
        manager.addNewFilm(film3);
        manager.addNewFilm(film4);
        manager.addNewFilm(film5);
        manager.addNewFilm(film6);
        manager.addNewFilm(film7);
        PurchaseItem[] expected = {film4, film3, film2, film1};
        PurchaseItem[] actual = manager.findLast(4);
        Assertions.assertArrayEquals(expected, actual);

    }
}
