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

	public boolean validateEmail(String email) {

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
}