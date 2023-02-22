package org.adactin.stepdefinition;

import org.adactin.project.Book_Hotel;
import org.adactin.project.Confirm_Page;
import org.adactin.project.Home_Page;
import org.adactin.project.Itinerary;
import org.adactin.project.Search_Hotel;
import org.adactin.project.Select_Hotel;
import org.adactin.runner.Adactin_RunnerClass;
import org.base.base_class1;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends base_class1 {
	
	public static WebDriver driver= Adactin_RunnerClass.driver;
	
	public static Home_Page home = new Home_Page(driver);
	public static Search_Hotel search = new Search_Hotel(driver);
	public static Select_Hotel select = new Select_Hotel(driver);
	public static Book_Hotel book = new Book_Hotel(driver);
	public static Confirm_Page confirm = new Confirm_Page(driver);
	public static Itinerary iti = new Itinerary(driver);
	
	
	@Given("user Launch The Adactin Url")
	public void user_launch_the_adactin_url() {
		url(driver, "https://adactinhotelapp.com/");
		maximize(driver);
	    	}
	
	
	@When("user Enter The Username In Username Field")
	public void user_enter_the_username_in_username_field() {
		input(home.getUsername(), "SELVAGANESH28");
	   	}
	@When("user Enter The Password In Password Field")
	public void user_enter_the_password_in_password_field() {
		input(home.getPassword(), "123456");
	   	}
	@Then("user Click The Login button And It Navigate To Search Hotel Page")
	public void user_click_the_login_button_and_it_navigate_to_search_hotel_page() {
		click(home.getLogin_btn());
	    	}
	
	@When("user Select The Location In The Location Dropdown")
	public void user_select_the_location_in_the_location_dropdown() {
		selectfromindex(search.getLocation(), 3);
	   }
	@When("user Select The Hotel In The Hotels Dropdown")
	public void user_select_the_hotel_in_the_hotels_dropdown() {
	   selectfromindex(search.getHotels(), 3);
	}
	@When("user Select The Room Type In The Room Type Dropdown")
	public void user_select_the_room_type_in_the_room_type_dropdown() {
		selectfromvisibletext(search.getRoom_Type(), "Deluxe");
	    	}
	@When("user Select The Number Of Rooms In The Number Of Rooms Dropdown")
	public void user_select_the_number_of_rooms_in_the_number_of_rooms_dropdown() {
	selectfromindex(search.getRoom_Nos(), 1);   
	}
	@When("user Enter The Check In Date In The Check In Date Field")
	public void user_enter_the_check_in_date_in_the_check_in_date_field() {
		input(search.getCheck_In(), "16/11/2022");
	    	}
	@When("user Enter The Check Out Date In The Check Out Date Field")
	public void user_enter_the_check_out_date_in_the_check_out_date_field() {
		input(search.getCheck_Out(), "18/11/2022");
	    }
	@When("user Select The Adults Per Room In The Adults Per Room Dropdown")
	public void user_select_the_adults_per_room_in_the_adults_per_room_dropdown() {
		selectfromvisibletext(search.getAdult_Room(), "2 - Two");
	    }
	@When("user Select The Childrens Per Room In The Children Per Room Dropdown")
	public void user_select_the_childrens_per_room_in_the_children_per_room_dropdown() {
		selectfromindex(search.getChild_Room(), 2);
	  }
	@Then("user Click The Search button And It Navigate To Select Hotel Page")
	public void user_click_the_search_button_and_it_navigate_to_select_hotel_page() {
		click(search.getSubmit_Btn());
	    }

	@When("user Click The Select Radio button")
	public void user_click_the_select_radio_button() {
	     click(select.getSelect_RadioBtn());
	    }
	@Then("user Click The Continue button And It Navigate To Book A Hotel Page")
	public void user_click_the_continue_button_and_it_navigate_to_book_a_hotel_page() {
		click(select.getContinue_Btn());
	    }
	
	@When("user Enter The First Name In The First Name Field")
	public void user_enter_the_first_name_in_the_first_name_field() {
		
		input(book.getFirst_Name(), "SELVAGANESH");
	    }
	@When("user Enter The Last Name In The Last Name Field")
	public void user_enter_the_last_name_in_the_last_name_field() {
		input(book.getLast_Name(), "KNT");
	    }
	@When("user Enter The Billing Address In The Billing Address Field")
	public void user_enter_the_billing_address_in_the_billing_address_field() {
		input(book.getBilling_Address(), "#18,S.K.VELAYUTHANAR NAGAR,KURINJPADI,CUDDALORE DISTRICT.");
	   	}
	@When("user Enter The Credit Card Number In The Credit Card No. Field")
	public void user_enter_the_credit_card_number_in_the_credit_card_no_field() {
		input(book.getCredit_Card(), "4667000509000301");
	   }
	@When("user Select The Credit Card Type In The Credit Card Type Dropdown")
	public void user_select_the_credit_card_type_in_the_credit_card_type_dropdown() {
		selectfromindex(book.getCreditcard_Type(), 1);
	  	}
	@When("user Select The Expiry Month In The Select Month Dropdown")
	public void user_select_the_expiry_month_in_the_select_month_dropdown() {
		selectfromvisibletext(book.getExp_Mnth(), "December");
	  }
	@When("user Select The Expiry Year In The Select Year Dropdown")
	public void user_select_the_expiry_year_in_the_select_year_dropdown() {
		selectfromvisibletext(book.getExp_Year(), "2022");
	   }
	@When("user Enter The Cvv Number In The Cvv Number Field")
	public void user_enter_the_cvv_number_in_the_cvv_number_field() {
		input(book.getCvv(), "123");
	   	}
	@Then("user Click The Book Now button And It Navigate To Booking Confirmation Page")
	public void user_click_the_book_now_button_and_it_navigate_to_booking_confirmation_page() {
		click(book.getBooknow_Btn());
	   }
	
	@When("user Click The My Itenarary button And It Navigate To My Itenarary Page")
	public void user_click_the_my_itenarary_button_and_it_navigate_to_my_itenarary_page() {
		click(confirm.getItinerary_Btn());
	    }
	@When("user Click On The Check Box")
	public void user_click_on_the_check_box() {
		click(iti.getMy_ItineraryBtn());
	   }
	@Then("user Click On The Cancel Selected button And Click On The OK button In Alert")
	public void user_click_on_the_cancel_selected_button_and_click_on_the_ok_button_in_alert() {
	click(iti.getCancel_AllBtn());  
	accept(driver);
	}
	
	
	@Then("user Click On The Logout button And It Navigate To Logout Page")
	public void user_click_on_the_logout_button_and_it_navigate_to_logout_page() {
		click(iti.getLogout_Btn());
	    }
	@Then("user Click The Click Here To Login Again Text Link And It Navigate To Adactin Login Page")
	public void user_click_the_click_here_to_login_again_text_link_and_it_navigate_to_adactin_login_page() {
	   }

}
