package teste.metodos;
import static org.apache.commons.io.FileUtils.*;
import static org.junit.Assert.*;

import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AprendendoPage {
    WebDriver navegador;
    public void site(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.get("https://automacaocombatista.herokuapp.com/");
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void comecarAutomacao(){
        navegador.findElement(By.xpath("//a[@class='btn waves-light orange']")).click();
    }
    public void formulario(){
        navegador.findElement(By.xpath("//a[@class='collapsible-header ']")).click();
        navegador.findElement(By.xpath("//a[@data-method='get']")).click();
    }
    public void usuario(String nome, String sobrenome, String email,
                        String endereco, String universidade, String profissao,
                        String genero, String idade){
        navegador.findElement(By.id("user_name")).sendKeys(nome);
        navegador.findElement(By.id("user_lastname")).sendKeys(sobrenome);
        navegador.findElement(By.id("user_email")).sendKeys(email);
        navegador.findElement(By.id("user_address")).sendKeys(endereco);
        navegador.findElement(By.id("user_university")).sendKeys(universidade);
        navegador.findElement(By.id("user_profile")).sendKeys(profissao);
        navegador.findElement(By.id("user_gender")).sendKeys(genero);
        navegador.findElement(By.id("user_age")).sendKeys(idade);
        navegador.findElement(By.xpath("//input[@value='Criar']")).click();

    }

    public void valida() {
        WebElement mensagemPop;
        mensagemPop = navegador.findElement(By.xpath("//p[@id='notice']"));
        String mensagem = mensagemPop.getText();
        assertEquals("Usuário Criado com sucesso", mensagem);
    }

   /*
    public void screenshot (Scenario cenario){
        File file = ((TakesScreenshot)navegador).getScreenshotAs(OutputType.FILE);
       try {
           FileUtils.copyFile("teste",
                   "test/test"+cenario.getId()+".jpg");
         }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
   */


    public void fim(){
         navegador.quit();
    }


    }


