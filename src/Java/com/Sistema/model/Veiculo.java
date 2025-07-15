package Java.com.Sistema.model;

import Java.com.Sistema.Interfaces.Estacionavel;

public abstract class Veiculo implements Estacionavel {
    protected String placa;
    protected String modelo;
    protected String cor;
    protected double horaEntrada;
    protected double horaSaida;

    public Veiculo(String placa, String modelo, String cor, double horaEntrada, double horaSaida) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    public double getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(double horaSaida) {
        this.horaSaida = horaSaida;
    }

    public double getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(double horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
