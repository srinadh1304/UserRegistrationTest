package com.bridgelabz.userregistrationtest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

	public static boolean validateName(String name) {
		if(name == null) {
			return false;
		}
		if(name == "") {
			return false;
		}
		String nameValidation="^[A-Z][a-z]{2,}$";
		return Pattern.matches(nameValidation, name);
	}

	public static boolean validateEmail(String email) {

		if(email == null) {
			return false;
		}
		if(email == "") {
			return false;
		}
		Pattern pattern = Pattern.compile("([a-zA-Z][a-zA-Z0-9_-]*([^.]?$)*[a-zA-Z0-9])(([+_.-][a-zA-Z0-9]*)?)(@[a-zA-Z0-9]+)([.])([a-z]{2,})(([.][a-z]{2,})?)");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public boolean validateMobileNumber(String mobileNumber) {

		if(mobileNumber == null) {
			return false;
		}
		if(mobileNumber == "") {
			return false;
		}
		Pattern pattern = Pattern.compile("[0-9]{1,2}[\s][1-9][0-9]{9}");
		Matcher matcher = pattern.matcher(mobileNumber);
		return matcher.matches();
	}

	public boolean validatePassword(String password) {

		if(password == null) {
			return false;
		}
		if(password == "") {
			return false;
		}
		Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.{8,}$)[a-zA-Z0-9]*[@#$%^&-+=()][a-zA-Z0-9]*$");
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}
}