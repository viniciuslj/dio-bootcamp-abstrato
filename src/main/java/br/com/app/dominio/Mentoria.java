package br.com.app.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;

@AllArgsConstructor
@ToString(callSuper = true)
public class Mentoria extends Conteudo {

    @Getter @Setter
    private LocalDate data;

    @Override
    public long calcularXp() {
        return XP_PADRAO * 20;
    }
}
