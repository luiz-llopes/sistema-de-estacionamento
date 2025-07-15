Sistema de Estacionamento

Este é um sistema simples de gerenciamento de estacionamento desenvolvido em Java. O sistema permite cadastrar usuários, registrar veículos (carros e motos) e realizar o controle de entrada e saída dos veículos no estacionamento.

📁 Estrutura do Projeto
css
Copiar
Editar
Sistema-Estacionamento/
├── src/
│   ├── Main.java
│   └── Java/com/Sistema/
│       ├── controller/
│       │   └── Estacionamento.java
│       ├── Interfaces/
│       │   └── Estacionavel.java
│       └── model/
│           ├── Carro.java
│           ├── Moto.java
│           ├── Usuario.java
│           └── Veiculo.java
📦 Funcionalidades
Cadastro de usuários.

Registro de veículos (Carro ou Moto).

Controle de entrada e saída do estacionamento.

Interface Estacionavel para generalizar comportamentos dos veículos.

🧠 Classes Principais
Main.java
Classe principal com o método main. Inicia o sistema de estacionamento, demonstrando seu uso.

Estacionamento.java
Classe controladora responsável pelo gerenciamento das vagas, entrada e saída de veículos.

Estacionavel.java
Interface que define os métodos que qualquer tipo de veículo deve implementar.

Veiculo.java
Classe abstrata base para todos os veículos. Contém atributos como placa, marca, modelo e cor.

Carro.java e Moto.java
Classes que estendem Veiculo e implementam Estacionavel, representando os veículos permitidos no sistema.

Usuario.java
Classe que representa o dono do veículo, com atributos como nome e CPF.

▶️ Como Executar
Clone ou extraia o projeto.

Abra o projeto em uma IDE compatível com Java (como IntelliJ ou Eclipse).

Compile e execute a classe Main.java.

🛠 Requisitos
Java 8 ou superior

IDE de desenvolvimento Java

👨‍💻 Autor
Sistema desenvolvido para fins educacionais, demonstrando conceitos de:

Programação orientada a objetos

Herança e polimorfismo

Interfaces

Organização de pacotes
