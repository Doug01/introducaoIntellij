package teste.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty"},
        features = {"src/test/resources/features"}, //Local das funcionalidades
        glue = {"teste"}//Local dos testes
        //tags = "@Navegar"
        //Para executar mais de um colocar {"@Teste1", "@Teste2",...},
        // ou "~@ignore" para ingorar um teste
)
public class RunnerTest {
    }


