package org.example.InheritanceDemo;

public class Main {
    public static void main(String[] args) {
        KrediUI krediUI = new KrediUI();
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        krediUI.KrediHesapla(ogretmenKrediManager);
    }
}
