package com.alurachallenges.currencyconverter.main;

import com.alurachallenges.currencyconverter.models.Converter;
import com.alurachallenges.currencyconverter.models.ExchangeRateCurrency;
import com.alurachallenges.currencyconverter.api.GetCurrency;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class PruebaPrincipal {

    private static final Scanner scan = new Scanner(System.in);
    private static final GetCurrency dolar = new GetCurrency();

    private static final Map<Integer, String> conversionMap = new HashMap<>();

    static {
        conversionMap.put(1, "USD/MXN");
        conversionMap.put(2, "MXN/USD");
        conversionMap.put(3, "BRL/MXN");
        conversionMap.put(4, "MXN/BRL");
        conversionMap.put(5, "EUR/MXN");
        conversionMap.put(6, "MXN/EUR");
        conversionMap.put(7, "COP/MXN");
        conversionMap.put(8, "MXN/COP");
        conversionMap.put(9, "JPY/MXN");
        conversionMap.put(10, "MXN/JPY");
    }

    public static void main(String[] args) {
        String conversionRate = """
                1)  dollars(USD)         ----->  mexican pesos(MXN)
                2)  mexican pesos(MXN)   ----->  dollars(USD)
                3)  brazilian reais(BRL) ----->  mexican pesos(MXN)
                4)  mexican pesos(MXN)   ----->  brazilian reais(BRL)
                5)  euro(EUR)            ----->  mexican pesos(MXN)
                6)  mexican pesos(MXN)   ----->  euro(EUR)
                7)  colombian pesos(COP) ----->  mexican pesos(MXN)
                8)  mexican pesos(MXN)   ----->  colombian pesos(COP)
                9)  japanese yen(JPY)    ----->  mexican pesos(MXN)
                10) mexican pesos(MXN)   ----->  japanese yen(JPY)
                11) exit
                """;

        while (true) {
            System.out.println("***********************************************************");
            System.out.println("-------WELCOME TO BITCASH Currency Convertor -----------");
            System.out.println("Choose a currency to exchange");
            System.out.println(conversionRate);

            int menu;
            try {
                menu = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a integer number.");
                scan.nextLine();
                continue;
            }
            if (menu == 11) {
                break;
            }

            if (conversionMap.containsKey(menu)) {
                handleConversion(menu);
            } else {
                System.out.println("Select a correct option.");
            }
        }
    }

    private static void handleConversion(int menu) {
        String currencyPair = conversionMap.get(menu);
        ExchangeRateCurrency cash = dolar.findCurrency(currencyPair);
        Converter converter = new Converter(cash);

        System.out.printf("Enter the amount to exchange (%s): ", currencyPair);
        int value;
        try {
            value = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scan.nextLine();
            return;
        }

        converter.GetConversion(value);
        System.out.println(converter);
    }
}

