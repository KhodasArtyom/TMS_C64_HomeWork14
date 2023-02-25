package by.teachMeSkills.KhodasArtyom.HomeWork14.CurrencyOperations;

import java.math.BigDecimal;

public enum Currency {
    BYN("Белорусский рубль"),
    USD("Доллар"),
    EUR("Евро"),
    GBP("Фунт стерлингов"),
    RUB("Российский рубль"),
    CNY("Китайский юань");

    private final String valueOnRus;

    Currency(String valueOnRus){
        this.valueOnRus = valueOnRus;
    }

    public String getValueOnRus(){
        return valueOnRus;
    }


}
