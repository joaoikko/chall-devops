package br.com.fiap.carro.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@SequenceGenerator(name="mod",sequenceName = "SQ_T_MODELO",allocationSize = 1)
public class Modelo {

    @Id
    @GeneratedValue(generator = "mod", strategy = GenerationType.SEQUENCE)
    private int codigo;

    private String nome;

    private LocalDate data;

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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}

