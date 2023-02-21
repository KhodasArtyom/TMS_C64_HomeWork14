package by.teachMeSkills.KhodasArtyom.HomeWork14.CurrencyOperations;

public enum Currency {
    BYN("Белорусский рубль"),
    USD("Доллар США"),
    EUR("Евро"),
    GBP("Фунт стерлингов"),
    RUB("Российский рубль"),
    CNY("Китайский юань");

  private String currencyInRus;

    Currency(String currencyInRus) {
        this.currencyInRus = currencyInRus;
    }

    public String getCurrencyInRus() {
        return currencyInRus;
    }
}
