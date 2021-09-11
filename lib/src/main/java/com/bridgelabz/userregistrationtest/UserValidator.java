package com.bridgelabz.userregistrationtest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

	public static boolean validateName(String name)  throws UserValidationException {
		try {
			if (name.length() == 0) {
				throw new UserValidationException("Please Enter Name. No Name entered.");
			}
		}
		catch (NullPointerException e) {
			throw new UserValidationException("Please enter valid name. Entered Null.");
		}
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
		Matcher matcher=pattern.matcher(name);
		return matcher.matches();
	}

	public static boolean validateEmail(String email) throws UserValidationException {
		try {
			if (email.length() == 0) {
				throw new UserValidationException("Please Enter Email. No Email entered.");
			}
		}
		catch (NullPointerException e) {
			throw new UserValidationException("Please enter valid email. Entered Null.");

		}
		Pattern pattern = Pattern.compile("([a-zA-Z][a-zA-Z0-9_-]*([^.]?$)*[a-zA-Z0-9])(([+_.-][a-zA-Z0-9]*)?)(@[a-zA-Z0-9]+)([.])([a-z]{2,})(([.][a-z]{2,})?)");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public boolean validateMobileNumber(String mobileNumber)throws UserValidationException {
		try {
			if (mobileNumber.length() == 0) {
				throw new UserValidationException("Please Enter Valid Mobile Number. No Mobile Number Entered.");			
			}
		}
		catch (NullPointerException e) {
			throw new UserValidationException("Please Enter Valid Mobile Number.Entered null.");
		}
		Pattern pattern = Pattern.compile("[0-9]{1,2}[\s][1-9][0-9]{9}");
		Matcher matcher = pattern.matcher(mobileNumber);
		return matcher.matches();
	}

	public boolean validatePassword(String password)throws UserValidationException {
		try {
			if (password.length() == 0) {
				throw new UserValidationException("Please Enter Valid Password. No Password Entered.");
			}
		}
		catch (NullPointerException e) {
			throw new UserValidationException("Please Enter Valid Password. Entered null.");
		}
		Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.{8,}$)[a-zA-Z0-9]*[@#$%^&-+=()][a-zA-Z0-9]*$");
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}
}