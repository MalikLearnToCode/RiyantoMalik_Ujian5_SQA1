package com.juaracoding.ujianselenium;

import org.openqa.selenium.WebDriver;

import com.juaracoding.ujianselenium.driver.DriverSingleton;
import com.juaracoding.ujianselenium.element.TestElement;



public class MainApp {

	public static void main(String[] args) {
		WebDriver driver = DriverSingleton.getInstance().getDriver();		
		driver.get("http://automationpractice.com/index.php");
		
		TestElement testElement =  new TestElement();
		testElement.signIn();
		testElement.regisEmail("cobacoba1@gmail.com");
		testElement.fillForm ("Subino" , "Suboni" , "kalangkabut" , "2" , "May" , "1982" ,"Bani" , "balala" , "Pabrik apa aja ada" , "jl. lurus tegak perkasa, RT :Sumono/RW:Sumana",
							"jl.Perjuangan mendapatkan dia RT:11/RW:12 jadi ngga jauh beda" , "Bikini Bottom" , "Hawaii" , "17145" , "United States" , "kalau kesana hati2" ,
							"7529905" , "9957230452" , "Keluarga Cemana Cemini");
		
		
		

	}
}
