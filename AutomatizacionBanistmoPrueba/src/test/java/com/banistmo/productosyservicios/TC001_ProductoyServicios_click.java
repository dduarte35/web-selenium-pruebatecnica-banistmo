package com.banistmo.productosyservicios;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;                       
import org.openqa.selenium.WebDriver;                
import org.openqa.selenium.chrome.ChromeDriver;      
import org.testng.Reporter;                          
import org.testng.annotations.AfterTest;             
import org.testng.annotations.BeforeTest;            
import org.testng.annotations.Test;                       


public class TC001_ProductoyServicios_click {         //Creación de la clase de tipo Test NG
 
  @BeforeTest                                         // Metodo
  public void beforeTest() {
	   }
  
@Test
  public void TC001_ProductosyServicios() {
	  
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  // Paso 1 - Abrir la pagina web de Banistmo
	  Reporter.log("Abrir la pagina web \"Banistmo\" web page");          //Guardar historial de eventos dentro de los reportes
	  driver.get("https://www.banistmo.com/personas/");                  //Abrir pagina web solicitada en el navegador controlado
	  driver.manage().window().maximize();                              //Maximizar la pagina web
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //Espera a que cargue la pagina, tiempo de 10 seg
	  driver.findElement(By.xpath("//span[contains(text(),'Entendido')]")).click();
	  driver.findElement(By.xpath("//*[local-name()='svg' and @data-icon='error']")).click(); 
	  
  
      //Paso 2 - Dar click sobre la opción de menu Productos y Servicios
	  Reporter.log("Abrir la pagina web \"Banistmo\" web page");
	  driver.findElement(By.xpath("//button[contains(text(), 'Productos & servicios')]")).click();
	  
	  //Paso 3 - Dar click sobre la opción Préstamos de autos
	  driver.findElement(By.xpath("//span[text()='Préstamos de autos']")).click();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//h3[contains(@class, 'Préstamos de Autos Regulares')]//span[normalize-space(text())='Descubre Más']")).click();

	 
	
  }
  
  
  
  
  @AfterTest
  public void afterTest() {
  }

}
