package ru.netology.domen;
public class PurchaseItem {
    private int id;
    private String filmName;

    public PurchaseItem(int id, String filmName) {
        this.id = id;
        this.filmName = filmName;
    }
    public int getId() {
        return id;
    }
}
