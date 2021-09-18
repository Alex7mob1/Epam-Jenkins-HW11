package rozetka.decorator;

import org.openqa.selenium.WebElement;

public class ElementDecorator {

    protected WebElement element;

    public ElementDecorator(WebElement element) {
        this.element = element;
    }
}