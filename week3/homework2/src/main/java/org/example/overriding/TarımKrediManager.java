package org.example.overriding;

public class TarımKrediManager extends BaseKrediManager{
    public double hesapla(double tutar){
        return tutar*1.05;
    }
}
