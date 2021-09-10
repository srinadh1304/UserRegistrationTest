package com.bridgelabz.userregistrationtest;

import org.junit.Test;
import org.junit.Assert;


public class UserValidatorTest {
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateName("Srinadh");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateName("Sr");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenFirstName_WhenUpperCaseMissing_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateName("srinadh");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenFirstName_WhenNumbers_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateName("123456");
		Assert.assertFalse(result);
	}
	@Test
	public void givenFirstName_WhenNull_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean isNotValid = userValidator.validateName(null);
		Assert.assertFalse(isNotValid);
		
	}
	
	@Test
	public void givenFirstName_WhenEmpty_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean isNotValid = userValidator.validateName("");
		Assert.assertFalse(isNotValid);
		
	}
	
	@Test
	public void givenFirstName_WhenSpecialCharatersPresent_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean isNotValid = userValidator.validateName("Sjk@^");
		Assert.assertFalse(isNotValid);
		
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateName("Tadiparthi");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateName("ta");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenLastName_WhenUpperCaseMissing_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateName("tadiparthi");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenLastName_WhenNumbers_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateName("Fdjs134");
		Assert.assertFalse(result);
	}
	@Test
	public void givenLastName_WhenNull_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean isNotValid = userValidator.validateName(null);
		Assert.assertFalse(isNotValid);
		
	}
	
	@Test
	public void givenLastName_WhenEmpty_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean isNotValid = userValidator.validateName("");
		Assert.assertFalse(isNotValid);
		
	}
	
	@Test
	public void givenLastName_WhenSpecialCharatersPresent_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean isNotValid = userValidator.validateName("fdsa@^");
		Assert.assertFalse(isNotValid);
		
	}
	
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateEmail("srinadh.t@gmail.com.in");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenEmail_WhenNotProper_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateEmail("sri@ta@gmail.com");
		Assert.assertFalse(result);
	}
}