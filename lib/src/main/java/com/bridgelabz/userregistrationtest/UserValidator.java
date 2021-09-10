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
}