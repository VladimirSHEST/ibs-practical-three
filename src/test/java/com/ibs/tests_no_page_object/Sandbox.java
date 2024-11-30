package com.ibs.tests_no_page_object;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Sandbox {

    @Test
    void testVegetableAdd() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chromedriver.driver", "src/test/resources/chromedriver.exe");// подключение драйвера
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().getScriptTimeout();
        driver.manage().window().maximize();// дисплей на максимум

        driver.get("http://localhost:8080/");  // открыли страницу

/*
        Добавление неэкзотического овоща
*/

        WebElement sandBox = driver.findElement(By.xpath("//a[@class ='nav-link dropdown-toggle']"));
        sandBox.click(); // клик на песочницу

        WebElement goods = driver.findElement(By.xpath("//a[text()='Товары']"));
        goods.click(); // клик на товары

        WebElement listProducts = driver.findElement(By.xpath("//h5[text()='Список товаров']"));
        listProducts.isDisplayed(); // проверка, что открылась вкладка

//        Assertions.assertEquals("Список товаров", listProducts.getText(), "не открылась таблица");

        WebElement buttonAdd = driver.findElement
                (By.xpath("//button[@class='btn btn-primary' and @data-toggle='modal']"));
        buttonAdd.click(); //клик на кнопку добавить

        WebElement addProduct = driver.findElement(By.xpath("//*[@id='editModalLabel']"));
        addProduct.isDisplayed(); // проверка, что открылась вкладка


        WebElement productName = driver.findElement(By.xpath("//*[@id='name']"));
        productName.sendKeys("морковь");// Ввести значение в текстовое поле


        WebElement type = driver.findElement(By.xpath("//*[@id='type']"));
        type.click();  //клик на поле тип

        WebElement typeVegetable = driver.findElement(By.xpath("//option[@value='VEGETABLE']"));
        typeVegetable.click(); // клик по типу овощ

        WebElement buttonSave = driver.findElement(By.xpath("//*[@id='save']"));
        buttonSave.click(); // клик по кнопке сохранить

        // проверка, что появился элемент в столбце
        driver.findElement(By.xpath("//th[.='5']/following-sibling::td[.='морковь']")).isDisplayed();

/*
        Добавление экзотического овоща
*/

        WebElement buttonAdd2 = driver.findElement
                (By.xpath("//button[@class='btn btn-primary' and @data-toggle='modal']"));
        buttonAdd2.click(); //клик на кнопку добавить

        WebElement addProduct2 = driver.findElement(By.xpath("//*[@id='editModalLabel']"));
        addProduct2.isDisplayed(); // проверка, что открылась вкладка

        WebElement productName2 = driver.findElement(By.xpath("//*[@id='name']"));
        productName2.sendKeys("Момордика");// Ввести значение в текстовое поле

        WebElement type2 = driver.findElement(By.xpath("//*[@id='type']"));
        type2.click();  //клик на поле тип


        WebElement typeVegetable2 = driver.findElement(By.xpath("//option[@value='VEGETABLE']"));
        typeVegetable2.click(); // клик по типу овощ

        WebElement checkExotic = driver.findElement(By.xpath("//*[@id='exotic']"));
        checkExotic.click(); // клик по чек-боксу экзотический

        WebElement buttonSave2 = driver.findElement(By.xpath("//*[@id='save']"));
        buttonSave2.click(); // клик по кнопке сохранить

        // проверка, что появился элемент Момордика в столбце
        driver.findElement(By.xpath("//th[.='6']/following-sibling::td[.='Момордика']")).isDisplayed();

        // удаляем данные
        WebElement sandBox2 = driver.findElement(By.xpath("//a[@class ='nav-link dropdown-toggle']"));
        sandBox2.click(); // клик на песочницу

        WebElement dataReset = driver.findElement(By.xpath("//*[@id='reset']"));
        dataReset.click(); // клик сброс данных

        driver.quit();
    }


    @Test
    void testFruitAdd() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chromedriver.driver", "src/test/resources/chromedriver.exe");// подключение драйвера
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().getScriptTimeout();
        driver.manage().window().maximize();// дисплей на максимум

        driver.get("http://localhost:8080/");  // открыли страницу

        /*
        Добавление неэкзотического фрукта
        */

        WebElement sandBox = driver.findElement(By.xpath("//a[@class ='nav-link dropdown-toggle']"));
        sandBox.click(); // клик на песочницу

        WebElement goods = driver.findElement(By.xpath("//a[text()='Товары']"));
        goods.click(); // клик на товары

        WebElement listProducts = driver.findElement(By.xpath("//h5[text()='Список товаров']"));
        listProducts.isDisplayed(); // проверка, что открылась вкладка

        WebElement buttonAdd = driver.findElement
                (By.xpath("//button[@class='btn btn-primary' and @data-toggle='modal']"));
        buttonAdd.click(); //клик на кнопку добавить

        WebElement addProduct = driver.findElement(By.xpath("//*[@id='editModalLabel']"));
        addProduct.isDisplayed(); // проверка, что открылась вкладка


        WebElement productName = driver.findElement(By.xpath("//*[@id='name']"));
        productName.sendKeys("Яблоко");// Ввести значение в текстовое поле

        WebElement type = driver.findElement(By.xpath("//*[@id='type']"));
        type.click();  //клик на поле тип

        WebElement typeFruit = driver.findElement(By.xpath("//option[@value='FRUIT']"));
        typeFruit.click(); // клик по типу фрукт

        WebElement buttonSave = driver.findElement(By.xpath("//*[@id='save']"));
        buttonSave.click(); // клик по кнопке сохранить

        // проверка, что появился элемент в столбце
        driver.findElement(By.xpath("//th[.='5']/following-sibling::td[.='Яблоко']")).isDisplayed();

        /*
        Добавление экзотического фрукта
        */

        WebElement buttonAdd2 = driver.findElement
                (By.xpath("//button[@class='btn btn-primary' and @data-toggle='modal']"));
        buttonAdd2.click(); //клик на кнопку добавить

        WebElement addProduct2 = driver.findElement(By.xpath("//*[@id='editModalLabel']"));
        addProduct2.isDisplayed(); // проверка, что открылась вкладка

        WebElement productName2 = driver.findElement(By.xpath("//*[@id='name']"));
        productName2.sendKeys("Ананас");// Вводим значение в текстовое поле

        WebElement type2 = driver.findElement(By.xpath("//*[@id='type']"));
        type2.click();  //клик на поле тип

        WebElement typeFruit2 = driver.findElement(By.xpath("//option[@value='FRUIT']"));
        typeFruit2.click(); // клик по типу овощ

        WebElement checkExotic = driver.findElement(By.xpath("//*[@id='exotic']"));
        checkExotic.click(); // клик по чек-боксу экзотический

        WebElement buttonSave2 = driver.findElement(By.xpath("//*[@id='save']"));
        buttonSave2.click(); // клик по кнопке сохранить

        // проверка, что появился элемент Ананас в столбце
        driver.findElement(By.xpath("//th[.='6'] ")).isDisplayed();
        driver.findElement(By.xpath("//th[.='6']/following-sibling::td[.='Ананас']")).isDisplayed();

        // удаляем данные
        WebElement sandBox2 = driver.findElement(By.xpath("//a[@class ='nav-link dropdown-toggle']"));
        sandBox2.click(); // клик на песочницу

        WebElement dataReset = driver.findElement(By.xpath("//*[@id='reset']"));
        dataReset.click(); // клик сброс данных

        driver.quit();
    }
}
