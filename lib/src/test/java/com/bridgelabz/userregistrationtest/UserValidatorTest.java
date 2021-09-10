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
		boolean result = userValidator.validateName(null);
		Assert.assertFalse(result);
		
	}
	
	@Test
	public void givenFirstName_WhenEmpty_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateName("");
		Assert.assertFalse(result);
		
	}
	
	@Test
	public void givenFirstName_WhenSpecialCharatersPresent_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateName("Sjk@^");
		Assert.assertFalse(result);
		
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
		boolean result = userValidator.validateName(null);
		Assert.assertFalse(result);
		
	}
	
	@Test
	public void givenLastName_WhenEmpty_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateName("");
		Assert.assertFalse(result);
		
	}
	
	@Test
	public void givenLastName_WhenSpecialCharatersPresent_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateName("fdsa@^");
		Assert.assertFalse(result);
		
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
	
	@Test
	public void givenEmailAddress_WhenNull_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateEmail(null);
		Assert.assertFalse(result);
		
	}
	
	@Test
	public void givenEmailAddress_WhenEmpty_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateEmail("");
		Assert.assertFalse(result);
		
	}
	
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateMobileNumber("91 9290090032");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenMobileNumber_WhenShort_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateMobileNumber("91 92900900");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenMobileNumber_WhenNoSpace_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateMobileNumber("919290090032");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenMobileNumber_WhenNoCountryCode_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateMobileNumber("9290090032");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenMobileNumber_WhenNull_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateMobileNumber(null);
		Assert.assertFalse(result);
		
	}
	
	@Test
	public void givenMobileNumber_WhenEmpty_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateMobileNumber("");
		Assert.assertFalse(result);
		
	}
	
	@Test
	public void givenMobileNumber_WhenCharatersArePresent_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateMobileNumber("9a 948375053h");
		Assert.assertFalse(result);
		
	}

	@Test
	public void givenMobileNumber_WhenSpecialCharatersArePresent_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateMobileNumber("#6 948375*535");
		Assert.assertFalse(result);
		
	}
	
}