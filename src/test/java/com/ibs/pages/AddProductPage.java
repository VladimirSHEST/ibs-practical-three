package com.ibs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductPage {
    private WebDriver driver;

    // Локатор для модального окна "Добавление товара"
    @FindBy(xpath = "//*[@id='editModalLabel']")
    private WebElement addProductModal;

    // Локатор для поля ввода "Наименование"
    @FindBy(xpath = "//*[@id='name']")
    private WebElement productNameField;

    // Локатор для выпадающего списка "Тип"
    @FindBy(xpath = "//*[@id='type']")
    private WebElement typeDropdown;

    // Локатор VEGETABLE
    @FindBy(xpath = "//option[@value='VEGETABLE']")
    private WebElement typeVegetable;


    // Локатор для кнопки "Сохранить"
    @FindBy(xpath = "//*[@id='save']")
    private WebElement saveButton;

    public AddProductPage(WebDriver driver) {
        this.driver = driver;
        // Инициализация элементов страницы
        PageFactory.initElements(driver, this);
    }

    // Метод для проверки отображения модального окна "Добавление товара"
    public boolean isAddProductModalDisplayed() {
        return addProductModal.isDisplayed();
    }

    // Метод для ввода наименования товара
    public AddProductPage enterProductName(String name) {
        productNameField.sendKeys(name);
        return this;
    }

    // Метод для выбора типа товара из выпадающего списка
    public AddProductPage selectProductType(String type) {
        typeDropdown.click();
        return this;
    }

    // Метод для клика по типу VEGETABLE
    public AddProductPage ClickType() {
        typeVegetable.click();
        return this;
    }

    // Метод для клика по кнопке "Сохранить"
    public AddProductPage clickSaveButton() {
        saveButton.click();
        return this;
    }
}
