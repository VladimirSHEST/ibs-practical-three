package com.ibs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    private WebDriver driver;

    // Локатор для заголовка "Список товаров"
    @FindBy(xpath = "//h5[text()='Список товаров']")
    private WebElement listProducts;

    // Локатор для кнопки "Добавить"
    @FindBy(xpath = "//button[@class='btn btn-primary' and @data-toggle='modal']")
    private WebElement addProductButton;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        // Инициализация элементов страницы
        PageFactory.initElements(driver, this);
    }

    // Метод для проверки отображения заголовка "Список товаров"
    public boolean isListProductsDisplayed() {
        return listProducts.isDisplayed();
    }

    // Метод для клика по кнопке "Добавить"
    public void clickAddProductButton() {
        addProductButton.click();
    }
}
