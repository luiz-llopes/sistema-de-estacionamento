import Java.com.Sistema.controller.Estacionamento;
import Java.com.Sistema.model.Carro;
import Java.com.Sistema.model.Moto;
import Java.com.Sistema.model.Usuario;
import Java.com.Sistema.model.Veiculo;

import java.awt.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe a capacidade total do estacionamento: ");
        int capacidadeTotal = scanner.nextInt();
        scanner.nextLine();

        Estacionamento estacionamento = new Estacionamento(capacidadeTotal);

        boolean rodando = true;

        while (rodando) {
            System.out.println("----Sistema de Estacionamento----");
            System.out.println("1. registrar entrada de veiculo");
            System.out.println("2. registrar saida de veiculo");
            System.out.println("3. mostrar relatorio");
            System.out.println("4. sair");
            System.out.println("escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:

                    System.out.println("tipo do veiculo:  ( 1) CARRO OU 2) MOTO)");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("placa: ");
                    String placa = scanner.nextLine();

                    System.out.println("Modelo: ");
                    String modelo = scanner.nextLine();

                    System.out.println("cor: ");
                    String cor = scanner.nextLine();

                    System.out.println("Hora da entrada (ex: 12,30): ");
                    double horaEntrada = scanner.nextDouble();
                    scanner.nextLine();

                    Veiculo veiculo;

                    if (tipo == 1) {
                        veiculo = new Carro(placa, modelo, cor, horaEntrada, 0);
                    } else if (tipo == 2) {
                        veiculo = new Moto(placa, modelo, cor, horaEntrada, 0);
                    } else {
                        System.out.println("tipo invalido.");
                        break;
                    }
                    boolean entradaRegistrada = estacionamento.registrarEntrada(veiculo, horaEntrada);
                    if (entradaRegistrada) {
                        System.out.println("veiculo registrada com sucesso!");
                    }
                    break;

                case 2:

                    System.out.println("placa do veiculo para saida: ");
                    String placaSaida = scanner.nextLine();

                    System.out.println("hora da saida (ex: 12,30): ");
                    double horaSaida = scanner.nextDouble();
                    scanner.nextLine();

                    boolean saidaregistrada = estacionamento.registrarSaida(placaSaida, horaSaida);

                    if (saidaregistrada) {
                        System.out.println("saida registrada com sucesso.");
                    }
                    break;

                case 3:
                    estacionamento.Relatorio();
                    break;

                case 4:
                    rodando = false;
                    System.out.println("encerrando sistema. ate mais");
                    break;

                default:
                    System.out.println("opção invalida, tente novamente");
            }


        }
        scanner.close();
    }
}