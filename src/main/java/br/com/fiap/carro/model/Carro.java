package br.com.fiap.carro.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@SequenceGenerator(name="carro",sequenceName = "SQ_T_CARRO",allocationSize = 1)
public class Carro {

    @Id
    @GeneratedValue(generator = "carro", strategy = GenerationType.SEQUENCE)
    private int codigo;

    private String nome;

    private LocalDate dataFabricacao;

    @ManyToOne
    private Modelo modelo;

    private boolean fraco;

    public boolean isFraco() {
        return fraco;
    }

    public void setFraco(boolean fraco) {
        this.fraco = fraco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
}
