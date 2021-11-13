package com.bilgeadam.hayvanatbahcesi;

//Inheritance
//superclass' ın özelliklerini subclasss alıyor.
// extends ile sağlanır.

public class Kopek extends Hayvan{

    private String kopekCins;

    public String getKopekCins() {
        return kopekCins;
    }

    public void setKopekCins(String kopekCins) {
        this.kopekCins = kopekCins;
    }

    public void sesCikar() {
        System.out.println();
    }

    @Override
    public void setKopekCins() {

    }

    @Override
    public String toString() {
        return "Ad: " +getAgirlik() +"/n" +
                "Agirlik:" +getAgirlik() +"\n" +



    }
}



