
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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
            System.out.println("Choose a currency conversion");
            System.out.println(conversionRate);
            ObtenerMonedas dolar = new ObtenerMonedas();
            //Divisa cash = dolar.obtenerdivisa("USD/MXN");
            int menu;
            try {
                menu = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scan.nextLine();
                continue;
            }
            if (menu == 11) {
                break;
            }

            switch (menu) {
                case 1:
                    Divisa cash = dolar.obtenerdivisa("USD/MXN");
                    Conversor conversor = new Conversor(cash);
                    int valor;
                    try {
                        System.out.println("Dollars(USD) to exchange: ");
                        valor = scan.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Invalid input. Please enter a number.");
                        scan.nextLine();
                        continue;
                    }
                    conversor.obtenerConversion(valor);
                    System.out.println(conversor);
                    break;
                case 2:
                    Divisa cash2 = dolar.obtenerdivisa("MXN/USD");
                    Conversor conversor2 = new Conversor(cash2);
                    int valor2;
                    try {
                        System.out.println("Mexican pesos(MXN) to exchange:");
                        valor2 = scan.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Invalid input. Please enter a number.");
                        scan.nextLine();
                        continue;
                    }
                    conversor2.obtenerConversion(valor2);
                    System.out.println(conversor2);
                    break;
                case 3:
                    Divisa cash3 = dolar.obtenerdivisa("BRL/MXN");
                    Conversor conversor3 = new Conversor(cash3);
                    int valor3;
                    try {
                        System.out.println("Brazilian reais(BRL) to exchange:");
                        valor3 = scan.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Invalid input. Please enter a number.");
                        scan.nextLine();
                        continue;
                    }
                    conversor3.obtenerConversion(valor3);
                    System.out.println(conversor3);
                    break;
                case 4:
                    Divisa cash4 = dolar.obtenerdivisa("MXN/BRL");
                    Conversor conversor4 = new Conversor(cash4);
                    int valor4;
                    try {
                        System.out.println("Mexican Pesos(MXN) to exchange:");
                        valor4 = scan.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Invalid input. Please enter a number.");
                        scan.nextLine();
                        continue;
                    }
                    conversor4.obtenerConversion(valor4);
                    System.out.println(conversor4);
                    break;
                case 5:
                    Divisa cash5 = dolar.obtenerdivisa("EUR/MXN");
                    Conversor conversor5 = new Conversor(cash5);
                    int valor5;
                    try {
                        System.out.println("Euros(EUR) to exchange:");
                        valor5 = scan.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Invalid input. Please enter a number.");
                        scan.nextLine();
                        continue;
                    }
                    conversor5.obtenerConversion(valor5);
                    System.out.println(conversor5);
                    break;
                case 6:
                    Divisa cash6 = dolar.obtenerdivisa("MXN/EUR");
                    Conversor conversor6 = new Conversor(cash6);
                    int valor6;
                    try {
                        System.out.println("Mexican pesos(MXN) to exchange:");
                        valor6 = scan.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Invalid input. Please enter a number.");
                        scan.nextLine();
                        continue;
                    }
                    conversor6.obtenerConversion(valor6);
                    System.out.println(conversor6);
                    break;
                case 7:
                    Divisa cash7 = dolar.obtenerdivisa("COP/MXN");
                    Conversor conversor7 = new Conversor(cash7);
                    int valor7;
                    try {
                        System.out.println("Colombian pesos(COP) to exchange:");
                        valor7 = scan.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Invalid input. Please enter a number.");
                        scan.nextLine();
                        continue;
                    }
                    conversor7.obtenerConversion(valor7);
                    System.out.println(conversor7);
                    break;
                case 8:
                    Divisa cash8 = dolar.obtenerdivisa("MXN/COP");
                    Conversor conversor8 = new Conversor(cash8);
                    int valor8;
                    try {
                        System.out.println("Mexican pesos(MXN) to exchange:");
                        valor8 = scan.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Invalid input. Please enter a number.");
                        scan.nextLine();
                        continue;
                    }
                    conversor8.obtenerConversion(valor8);
                    System.out.println(conversor8);
                    break;
                case 9:
                    Divisa cash9 = dolar.obtenerdivisa("JPY/MXN");
                    Conversor conversor9 = new Conversor(cash9);
                    int valor9;
                    try {
                        System.out.println("Japanese yenes(JPY) to exchange:");
                        valor9 = scan.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Invalid input. Please enter a number.");
                        scan.nextLine();
                        continue;
                    }
                    conversor9.obtenerConversion(valor9);
                    System.out.println(conversor9);
                    break;
                case 10:
                    Divisa cash10 = dolar.obtenerdivisa("MXN/JPY");
                    Conversor conversor10 = new Conversor(cash10);
                    int valor10;
                    try {
                        System.out.println("Mexican pesos(MXN) to exchange:");
                        valor10 = scan.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Invalid input. Please enter a number.");
                        scan.nextLine();
                        continue;
                    }
                    conversor10.obtenerConversion(valor10);
                    System.out.println(conversor10);
                    break;

                default:
                    System.out.println("select a correct option");
                }
        }
    }
}
