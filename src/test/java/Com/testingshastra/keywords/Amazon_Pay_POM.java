package Com.TestingShatra.Keywords;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.testingshastra.keywords.Keyword;

public class Amazon_Pay_POM {
	//======================================7====
	@FindBy(xpath="//span[contains(text(),'COVID-19 Donation')]")
	private WebElement COVID_19_Donation; 
	
	
	@FindBy(xpath="//span[contains(text(),'Your Transactions')]")
	private WebElement your_Transaction; 
	
	@FindBy(xpath="//span[contains(text(),'EMI')]")
	private WebElement emi; 
	
	@FindBy(xpath="//span[contains(text(),'Your Rewards')]")
	private WebElement rewards; 
	
	@FindBy(xpath="//span[contains(text(),'Your Saved Cards')]")
	private WebElement saves_cards; 
	
	@FindBy(xpath="//span[contains(text(),'Your Bank Accounts')]")
	private WebElement bank_Accounts; 
	//
	@FindBy(xpath="//span[contains(text(),'Help and FAQs')]")
	private WebElement help_Faqs; 
	
	///======================Recharges, Bill Payments
	
	
	@FindBy(xpath="//span[contains(text(),'Mobile Recharge')]")
	private WebElement mobile_reacharge; 

	@FindBy(xpath="//span[contains(text(),'Electricity')]")
	private WebElement electricity; 
	@FindBy(xpath="//span[contains(text(),'DTH Recharge')]")
	private WebElement dTH_Recharge; 
	@FindBy(xpath="//span[contains(text(),'Mobile Postpaid')]")
	private WebElement Mobile_Postpaid; 
	@FindBy(xpath="//span[contains(text(),'Bharat Gas Cylinder')]")
	private WebElement Bharat_Gas_Cylinder; 
	@FindBy(xpath="//span[contains(text(),'Piped Gas')]")
	private WebElement Piped_Gas; 
	@FindBy(xpath="//span[contains(text(),'Water Bill')]")
	private WebElement Water_Bill; 
	@FindBy(xpath="//span[contains(text(),'Landline')]")
	private WebElement Landline; 
	@FindBy(xpath="//span[contains(text(),'Broadband')]")
	private WebElement Broadband; 
	
	@FindBy(xpath="//span[contains(text(),'Municipal Tax')]")
	private WebElement Municipal_Tax; 
	

	@FindBy(xpath="//span[contains(text(),' Insurance Premium')]")
	private WebElement  insurance_Premium; 
	
	
	//==============================Travel tickets, Lifestyle Offers
	@FindBy(xpath="//span[contains(text(),'Flights')]")
	private WebElement Flights; 
	@FindBy(xpath="//span[contains(text(),'Bus Tickets')]")
	private WebElement Bus_Tickets; 
	@FindBy(xpath="//span[contains(text(),'Movie Tickets')]")
	private WebElement Movie_Tickets; 
	@FindBy(xpath="//span[contains(text(),'Food offers')]")
	private WebElement Food_offers; 
	@FindBy(xpath="//span[contains(text(),'Gaming offers')]")
	private WebElement Gaming_offers; 
	@FindBy(xpath="//span[contains(text(),'Entertainment offers')]")
	private WebElement Entertainment_offers; 
	
	@FindBy(xpath="//span[contains(text(),'Travel offers')]")
	private WebElement Travel_offers; 
	@FindBy(xpath="//span[contains(text(),'Health and fitness offers')]")
	private WebElement Health_and_fitness_offers; 
	@FindBy(xpath="//span[contains(text(),'Home services offers')]")
	private WebElement Home_services_offers; 
	
	//==========================Gift Cards & Vouchers
	@FindBy(xpath="//span[contains(text(),'Gift Cards')]")
	private WebElement Gift_Cards; 
	@FindBy(xpath="//span[contains(text(),'Add Gift Card')]")
	private WebElement Add_Gift_Card; 
	@FindBy(xpath="//span[contains(text(),'Brand Vouchers')]")
	private WebElement Brand_Vouchers; 
	@FindBy(xpath="//span[contains(text(),'Birthday Giftcards')]")
	private WebElement Birthday_Giftcards; 
	@FindBy(xpath="//span[contains(text(),'Wedding Giftcards')]")
	private WebElement Wedding_Giftcards; 
	@FindBy(xpath="//span[contains(text(),'Corporate Gifting')]")
	private WebElement Corporate_Gifting; 
	@FindBy(xpath="//span[contains(text(),'Add Money')]")
	private WebElement Add_Money; 
	
	@FindBy(xpath="//span[contains(text(),'Auto Reload')]")
	private WebElement   Auto_Reload; 
	@FindBy(xpath="//span[contains(text(),'Account Settings')]")
	private WebElement   Account_Settings; 
	
	//

  

    
    
    
    
    
	
	public  void click_On_COVID_19_Donation() {
		
		COVID_19_Donation.click();

		}
	
public  void click_On_your_Transaction() {
		
	your_Transaction.click();

	}


	
public void click_on_emi() {
	emi.click();
}
public void click_on_rewards() {
	rewards.click();
}
public void click_on_saves_cards( ) {
	saves_cards.click();
}
public void click_on_bank_Accounts( ) {
	bank_Accounts.click();
}
public  void click_On_help_Faqs() {
	
	help_Faqs.click();

	}

//=======================Recharges, Bill Payments 10==============================
public  void click_On_mobile_reacharge() {
	
	mobile_reacharge.click();

	}
public  void click_On_electricity() {
	
	electricity.click();

	}
public  void click_On_dTH_Recharge() {
	
	dTH_Recharge.click();

	}
public  void click_On_Mobile_Postpaid() {
	
	Mobile_Postpaid.click();

	}
public  void click_On_Bharat_Gas_Cylinder() {
	
	Bharat_Gas_Cylinder.click();

	}
public  void click_On_Piped_Gas() {
	
	Piped_Gas.click();

	}
	
public  void click_On_Water_Bill() {
	
	Water_Bill.click();

	}
	
public  void click_On_Landline() {
	
	Landline.click();

	}
	
public  void click_On_Broadband() {
	
	Broadband.click();

	}
	
public  void click_On_Municipal_Tax() {
	
	Municipal_Tax.click();

	}
public  void click_On_insurance_Premium() {
	
	insurance_Premium.click();

	}
//===============================Travel tickets, Lifestyle Offers 9=======================
	
public  void click_On_Flights() {
	
	Flights.click();

	}
	
public  void click_On_Bus_Tickets() {
	
	Bus_Tickets.click();

	}
	
public  void click_On_Movie_Tickets() {
	
	Movie_Tickets.click();

	}

public  void click_On_Food_offers() {
	
	Food_offers.click();

	}
public  void click_On_Gaming_offers() {
	
	Gaming_offers.click();

	}
public  void click_On_Entertainment_offers() {
	
	Entertainment_offers.click();

	}

public  void click_On_Travel_offers() {
	
	Travel_offers.click();

	}
public  void click_On_Health_and_fitness_offers() {
	
	Health_and_fitness_offers.click();

	}
public  void click_On_Home_services_offers() {
	
	Home_services_offers.click();

	}

//========================Gift Cards & Vouchers 6====================

public  void click_On_Gift_Cards() {
	
	Gift_Cards.click();

	}
public  void click_On_Add_Gift_Card() {
	
	Add_Gift_Card.click();

	}
public  void click_On_Brand_Vouchers() {
	
	Brand_Vouchers.click();

	}
public  void click_On_Birthday_Giftcards() {
	
	Birthday_Giftcards.click();

	}
	
public  void click_On_Wedding_Giftcards() {
	
	Wedding_Giftcards.click();

	}
	
public  void click_On_Corporate_Gifting() {
	
	Brand_Vouchers.click();

	}
//====================================3=============
public  void click_On_Add_Money() {
	
	Add_Money.click();

	}
public  void click_On_Auto_Reload() {
	
	Auto_Reload.click();

	}
public  void click_On_Account_Settings() {
	
	Account_Settings.click();

	}

}