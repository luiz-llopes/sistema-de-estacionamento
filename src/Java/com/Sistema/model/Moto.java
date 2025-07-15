package Java.com.Sistema.model;

public class Moto extends Veiculo {
    private final double PRECO_HORA = 3.0;

    public Moto(String placa, String modelo, String cor, double horaEntrada, double horaSaida) {
        super(placa, modelo, cor, horaEntrada, horaSaida);
    }

    @Override
    public double calcularValorEstadia(int horas) {
        if (horas > 0) {
            return PRECO_HORA * horas;
        } else {
            return 0.0;
        }
    }
}
