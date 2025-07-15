package Java.com.Sistema.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String cpf;
    private String telefone;
    private List<Veiculo> veiculos;

    public Usuario(String nome, String cpf, String telefone, List<Veiculo> veiculos) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.veiculos = new ArrayList<>();
    }
    public void adicionarVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}
