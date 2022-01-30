package br.com.app.dominio;

import lombok.Getter;
import lombok.Setter;

public abstract class Conteudo {
    protected static final long XP_PADRAO = 10;

    @Getter @Setter
    protected String titulo;

    @Getter @Setter
    protected String descricao;

    public abstract long calcularXp();
}
