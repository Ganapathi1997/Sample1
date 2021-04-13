package org.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class amazon extends BaseClass{

	public static void main(String[] args) {
		
		launchBrowser("Chrome");
		launchUrl("https://www.amazon.in/");
		FirstPage f=new FirstPage();
		enter(f.getSearch(), "oneplus");
	
		List<WebElement> Apple = d.findElements(By.xpath("//span[@class=\'a-size-medium a-color-base a-text-normal\']"));
		
		for (WebElement x : Apple) {
			
			String name = x.getText();
			System.out.print(name+"    ----");
			
			
			
			String name2="//span[text()=\'"+name+"']/ancestor::div[@class='sg-row']//span[@class='a-price-whole']";
			List<WebElement> price = d.findElements(By.xpath(name2));
			for (WebElement y : price) {
				String price1 = y.getText();
				System.out.println("Rs "+price1);
				}
		
		}
		
		
			
		
		
		
	}
}
