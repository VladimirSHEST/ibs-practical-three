package com.ibs.tests;

import com.ibs.base_test.BaseTest;
import com.ibs.pages.AddProductPage;
import com.ibs.pages.HomePage;
import com.ibs.pages.ProductsPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestClass extends BaseTest {

    @Test
    public void testAddProduct() {
        driver.get("https://qualit.appline.ru/food");

        HomePage homePage = new HomePage(driver);
        homePage.clickSandboxLink().clickProductsLink();


        ProductsPage productsPage = new ProductsPage(driver);
        assertTrue(productsPage.isListProductsDisplayed(), "Список товаров не отображается");
        productsPage.clickAddProductButton();

        // Ожидаем, пока модальное окно "Добавление товара" станет видимым
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='editModalLabel']")));

        AddProductPage addProductPage = new AddProductPage(driver);
        assertTrue(addProductPage.isAddProductModalDisplayed(), "Модальное окно добавления товара не отображается");
        addProductPage.enterProductName("морковь").selectProductType("Овощ").ClickType().clickSaveButton();

        // Проверка, что товар добавлен
        assertTrue(driver.findElement(By.xpath("//th[.='5']/following-sibling::td[.='морковь']")).isDisplayed(), "Товар не добавлен");
    }
}
