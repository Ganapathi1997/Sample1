package org.task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage extends BaseClass {

	public FirstPage(){
		PageFactory.initElements(d, this);
	}
	@FindBy (id="twotabsearchtextbox")
	private WebElement search;
	public WebElement getSearch() {
		return search;
	}
	
	
}
