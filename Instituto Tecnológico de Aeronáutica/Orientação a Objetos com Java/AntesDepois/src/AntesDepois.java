import org.junit.*;

public class AntesDepois {

    @Before
    public void antes() {
        System.out.println("Antes");
    }

    @After
    public void depois() {
        System.out.println("Depois");
    }

    @BeforeClass
    public static void antesDeTudo() {
        System.out.println("Antes de Tudo");
    }

    @AfterClass
    public static void depoisDeTudo() {
        System.out.println("Depois de Tudo");
    }

    @Test
    public void teste1() {
        System.out.println("Teste 1");
    }

    @Test
    public void teste2() {
        System.out.println("Teste 2");
    }

    @Test
    public void teste3() {
        System.out.println("Teste 3");
    }
}
