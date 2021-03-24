package teste.steps;

import teste.metodos.AprendendoPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AprendendoSteps {
    AprendendoPage teste = new AprendendoPage ();

    @Dado("que eu acesse um site qaulquer")
    public void queEuAcesseUmSiteQaulquer() {

        teste.site();
    }

    @Quando("navegar pelo site")
    public void navegarPeloSite() {

        teste.comecarAutomacao();
        teste.formulario();
        teste.usuario("Douglas","Ferreira","Doug.df@outlook.com",
                "Rua Zero","Cruzeiro do Sul","Tecnico de Automação de Testes 1",
                "Masculino","30");

    }

    @Então("a pagina que eu navegar sera validada")
    public void aPaginaQueEuNavegarSeraValidada() {

        teste.valida();
        teste.fim();

    }

    @Dado("que eu faça a busca por elementos")
    public void queEuFaçaABuscaPorElementos() {
        teste.site();
    }

    @Quando("Quando eu clicar no botão submit")
    public void quandoEuClicarNoBotãoSubmit() {
        teste.comecarAutomacao();
    }
    @Então("o site vai retornar a mensagem {string}")
    public void oSiteVaiRetornarAMensagem(String string) {
        teste.fim();
    }

}
