import org.junit.Test;

import static org.junit.Assert.*;

public class AutenticadorTest {

    @Test
    public void loginComSucesso() throws LoginException {
        Autenticador a = new Autenticador();
        Usuario u = a.logar("guerra", "senhadoguerra");
        assertEquals("guerra", u.getLogin());
    }

    @Test(expected = LoginException.class)
    public void loginFalho() throws LoginException {
        Autenticador a = new Autenticador();
        Usuario u = a.logar("guerra", "senhaerradadoguerra");
    }

    @Test
    public void informacaoDoErro() {
        Autenticador a = new Autenticador();
        try {
            Usuario u = a.logar("guerra", "senhaerradadoguerra");
            fail();
        } catch (LoginException e) {
            assertEquals("guerra", e.getLogin());
        }
    }
}