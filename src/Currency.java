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
}
