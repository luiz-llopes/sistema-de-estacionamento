package Java.com.Sistema.controller;

import Java.com.Sistema.model.Carro;
import Java.com.Sistema.model.Moto;
import Java.com.Sistema.model.Veiculo;


public class Estacionamento {
    private Veiculo[] veiculosEstacionados;
    private int vagasCarro;
    private int vagasMoto;
    private int ocupadasCarro;
    private int ocupadasMoto;
    private int capacidadeTotal;
    private int indiceAtual;

    public Estacionamento(int capacidadeTotal) {
        this.veiculosEstacionados = new Veiculo[capacidadeTotal];
        this.vagasCarro = capacidadeTotal / 2;
        this.vagasMoto = capacidadeTotal / 2;
        this.ocupadasCarro = 0;
        this.ocupadasMoto = 0;
        this.capacidadeTotal = capacidadeTotal;
        this.indiceAtual = 0;
    }

    public boolean registrarEntrada(Veiculo veiculo, double horaEntrada) {
        if (indiceAtual >= capacidadeTotal) {
            System.out.println("Estacionamento Lotado!");
            return false;
        }
        if (veiculo instanceof Carro) {
            if (ocupadasCarro >= vagasCarro) {
                System.out.println("nao ha vagas disponiveis para carro!");
                return false;
            }
            ocupadasCarro++;
        }
        if (veiculo instanceof Moto) {
            if (ocupadasMoto >= vagasMoto) {
                System.out.println("nao ha vagas disponiveis para moto.");
                return false;
            }
            ocupadasMoto++;
        }
        veiculo.setHoraEntrada(horaEntrada);
        veiculosEstacionados[indiceAtual] = veiculo;
        indiceAtual++;

        System.out.println("entrada registrada com sucesso!");
        return true;
    }

    public boolean registrarSaida(String placa, double horaSaida) {
        for (int i = 0; i < indiceAtual; i++) {
            Veiculo v = veiculosEstacionados[i];
            if (v != null && v.getPlaca().equalsIgnoreCase(placa)) {
                double tempo = horaSaida - v.getHoraEntrada();
                if (tempo <= 0) {
                    System.out.println("horario de saida invalido");
                    return false;
                }

                v.setHoraSaida(horaSaida);

                double valor = v.calcularValorEstadia((int) tempo);
                System.out.println("veiculo com placa " + placa + "deve pagar R$ " + valor);

                if (v instanceof Carro) {
                    ocupadasCarro--;
                } else if (v instanceof Moto) {
                    ocupadasMoto--;
                }
                veiculosEstacionados[i] = null;

                System.out.println("saida registrada com sucesso.");
                return true;
            }

        }

        System.out.println("veiculo com placa " + placa + "nao encontrado. ");
        return false;


    }

    public void Relatorio() {
        System.out.println("RELATORIO-ESTACIONAMENTO");
        System.out.println("Total de Vagas: " + this.capacidadeTotal);
        System.out.println("vagas de Carro: " + vagasCarro + " Vagas ocupadas: " + ocupadasCarro);
        System.out.println("vagas de Moto: " + vagasMoto + " Vagas ocupadas: " + ocupadasMoto);
        System.out.println("Veiculos atualmente estacionados: ");

        for (int i = 0; i < indiceAtual; i++) {
            Veiculo veiculo = veiculosEstacionados[i];
            if (veiculo != null) {
                System.out.println("-Placa: " + veiculo.getPlaca() + " -Modelo: " + veiculo.getModelo() + " -Cor: " + veiculo.getCor());
            }
        }
    }

    public Veiculo[] getVeiculosEstacionados() {
        return veiculosEstacionados;
    }

    public void setVeiculosEstacionados(Veiculo[] veiculosEstacionados) {
        this.veiculosEstacionados = veiculosEstacionados;
    }

    public int getVagasCarro() {
        return vagasCarro;
    }

    public void setVagasCarro(int vagasCarro) {
        this.vagasCarro = vagasCarro;
    }

    public int getVagasMoto() {
        return vagasMoto;
    }

    public void setVagasMoto(int vagasMoto) {
        this.vagasMoto = vagasMoto;
    }

    public int getOcupadasCarro() {
        return ocupadasCarro;
    }

    public void setOcupadasCarro(int ocupadasCarro) {
        this.ocupadasCarro = ocupadasCarro;
    }

    public int getOcupadasMoto() {
        return ocupadasMoto;
    }

    public void setOcupadasMoto(int ocupadasMoto) {
        this.ocupadasMoto = ocupadasMoto;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

    public int getIndiceAtual() {
        return indiceAtual;
    }

    public void setIndiceAtual(int indiceAtual) {
        this.indiceAtual = indiceAtual;
    }
}

