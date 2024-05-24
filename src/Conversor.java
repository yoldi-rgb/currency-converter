public class Conversor {

    // divisa base
    private String divisa;
    //divisa objetivo
    private String divisaDeCambio;

    private double tasaDeCambio;

    private String actualizacion;
    private double conversionFinal;

    private int valorAconvertir;

    public String getDivisa() {
        return divisa;
    }

    public String getDivisaDeCambio() {
        return divisaDeCambio;
    }

    public String getActualizacion() {
        return actualizacion;
    }

    public double getConversionFinal() {
        return conversionFinal;
    }

    public Conversor(Divisa moneda) {
        this.divisa  = moneda.base_code();
        this.divisaDeCambio = moneda.target_code();
        this.tasaDeCambio = moneda.conversion_rate();
        this.actualizacion = moneda.time_last_update_utc().substring(0,16);
    }


    public void obtenerConversion(int valor) {
        this.valorAconvertir = valor;
        if (valorAconvertir > 0) {
            this.conversionFinal = valor * this.tasaDeCambio;
        } else {
            System.out.println("Por favor anotar un valor positivo");

        }

    }

    @Override
    public String toString() {
        return "Conversion rate ["
                +this.valorAconvertir+"("+this.divisa+")"+" equivalent to --->  "
                + this.conversionFinal+"("+this.divisaDeCambio+") ]\n"
                +"time last update\n"
                +"["+this.actualizacion+"]" ;
    }
}
