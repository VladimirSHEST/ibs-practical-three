package com.ibs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    // Локатор для ссылки "Песочница"
    @FindBy(xpath = "//a[@class ='nav-link dropdown-toggle']")
    private WebElement sandboxLink;

    // Локатор для ссылки "Товары"
    @FindBy(xpath = "//a[text()='Товары']")
    private WebElement productsLink;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        // Инициализация элементов страницы
        PageFactory.initElements(driver, this);
    }

    // Метод для клика по ссылке "Песочница"
    public HomePage clickSandboxLink() {
        sandboxLink.click();
        return this;
    }

    // Метод для клика по ссылке "Товары"
    public HomePage clickProductsLink() {
        productsLink.click();
        return this;
    }
}
