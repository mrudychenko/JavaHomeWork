package com.pb.rudychenko.hw7;

public enum Size {
    XXS("Детский размер",32),
    XS("Взрослый размер",34),
    S("Взрослый размер",36),
    M("Взрослый размер",38),
    L("Взрослый размер",40);

   // private String name;
    private String Description;
    private int EuroSize;

    Size(String description, int euroSize) {
        Description = description;
        EuroSize = euroSize;
    }



    public String getDescription() {
        if (EuroSize == 32) {
            return "Детский размер";
        } else return "Взрослый размер";
    }
public void getEuroSize(){

            System.out.println("Евро размер: "+EuroSize);
        }

}



