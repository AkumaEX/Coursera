import org.junit.Test;

import static org.junit.Assert.*;

public class RegistroPontosTest {

    @Test
    public void pontosCriarTopico() {
        Usuario u = new Usuario();
        u.nome = "Guerra";
        CalculadoraBonus cb = new CalculadoraBonus();
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(5, u.pontos);
    }

    public void pontosCriarTopicoVIP() {
        Usuario u = new Usuario();
        u.nome = "Guerra";
        u.vip = true;
        CalculadoraBonus cb = new CalculadoraBonus();
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(25, u.pontos);
    }

    public void pontosCriarTopicoBonusDoDia() {
        Usuario u = new Usuario();
        u.nome = "Guerra";
        CalculadoraBonus cb = new CalculadoraBonus();
        cb.bonusDoDia = 3;
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(15, u.pontos);
    }

    public void pontosCriarTopicoVIPBonusDoDia() {
        Usuario u = new Usuario();
        u.nome = "Guerra";
        u.vip = true;
        CalculadoraBonus cb = new CalculadoraBonus();
        cb.bonusDoDia = 2;
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(50, u.pontos);
    }
}