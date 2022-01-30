package br.com.app.dominio;

import lombok.Data;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Data
public class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private Set<Developer> devsInscritos;
    private Set<Conteudo> conteudos;

    public Bootcamp(String nome, String descricao, LocalDate dataInicial, long duracao) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicial = dataInicial;
        this.dataFinal = dataInicial.plusDays(duracao);
        devsInscritos = new HashSet<>();
        conteudos = new LinkedHashSet<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Bootcamp bootcamp = (Bootcamp) o;

        if (getNome() != null ? !getNome().equals(bootcamp.getNome()) : bootcamp.getNome() != null)
            return false;

        if (getDescricao() != null ? !getDescricao().equals(bootcamp.getDescricao()) : bootcamp.getDescricao() != null)
            return false;

        if (getDataInicial() != null ? !getDataInicial().equals(bootcamp.getDataInicial()) : bootcamp.getDataInicial() != null)
            return false;

        return getDataFinal() != null ? getDataFinal().equals(bootcamp.getDataFinal()) : bootcamp.getDataFinal() == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataFinal, dataInicial);
    }
}
