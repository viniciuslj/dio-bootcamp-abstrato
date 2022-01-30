package br.com.app.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString(callSuper = true)
public class Curso extends Conteudo {

    @Getter @Setter
    private long cargaHoraria;

    @Override
    public long calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
