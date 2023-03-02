package by.teachMeSkills.KhodasArtyom.HomeWork14.CurrencyOperations;

import javax.security.sasl.SaslClient;
import java.math.BigDecimal;
import java.util.Scanner;

/*

 */
public class HomeWork14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExchangeService exchangeService = new ExchangeService();
        System.out.println("Choose the operation");
        System.out.println("1. check current exchange rates ");
        System.out.println("2. Currency converter ");


        while (true) {
            int button = Integer.parseInt(scanner.nextLine());
            switch (button) {

                case 1 -> {
                    ExchangeRate[] array = exchangeService.getTodayRates();
                    System.out.println("%-16s %-3s %s".formatted("Валюта", "Код", "Курс"));
                    for (int i = 0; i < array.length; i++) {
                        ExchangeRate rate = array[i];
                        Currency currency = rate.getCurrency();
                        System.out.println("%-16s %-3s %s".formatted(
                                currency.getValueOnRus(),
                                currency,
                                rate.getBigDecimalRate()));
                    }
                }
                case 2 -> {
                    System.out.println("Enter the source currency");
                    Currency currency = Currency.valueOf(scanner.nextLine());
                    System.out.println("Enter the sumOfMoney");
                    BigDecimal bigDecimalMoney = new BigDecimal(scanner.nextLine());
                    System.out.println("enter in which currency you want to transfer ");
                    Currency currencyTransfer = Currency.valueOf(scanner.nextLine());
                    BigDecimal convertedSum = exchangeService.exchange(currency, bigDecimalMoney, currencyTransfer);
                    System.out.println("Your converter sum ");
                    System.out.println(convertedSum);
                }
            }
        }
    }
}