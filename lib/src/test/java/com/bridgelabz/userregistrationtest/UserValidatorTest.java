package com.bridgelabz.userregistrationtest;

import org.junit.Test;
import org.junit.Assert;


public class UserValidatorTest {
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateName.validate("Srinadh");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateName.validate("Sr");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenFirstName_WhenUpperCaseMissing_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateName.validate("srinadh");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenFirstName_WhenNumbers_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateName.validate("123456");
		Assert.assertFalse(result);
	}
	@Test
	public void givenFirstName_WhenNull_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		try {
			userValidator.validateName.validate(null);
		}
		catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL,e.type);
		}
		
	}
	
	@Test
	public void givenFirstName_WhenEmpty_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		try {
			userValidator.validateName.validate("");
		}
		catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY,e.type);
		}
		
	}
	
	@Test
	public void givenFirstName_WhenSpecialCharatersPresent_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateName.validate("Sjk@^");
		Assert.assertFalse(result);
		
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateName.validate("Tadiparthi");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateName.validate("ta");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenLastName_WhenUpperCaseMissing_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateName.validate("tadiparthi");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenLastName_WhenNumbers_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateName.validate("Fdjs134");
		Assert.assertFalse(result);
	}
	@Test
	public void givenLastName_WhenNull_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		try {
			userValidator.validateName.validate(null);
		}
		catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL,e.type);
		}
		
	}
	
	@Test
	public void givenLastName_WhenEmpty_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		try {
			userValidator.validateName.validate("");
		}
		catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY,e.type);
		}
		
	}
	
	@Test
	public void givenLastName_WhenSpecialCharatersPresent_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateName.validate("fdsa@^");
		Assert.assertFalse(result);
		
	}
	
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateEmail.validate("srinadh.t@gmail.com.in");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenEmail_WhenNotProper_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateEmail.validate("sri@ta@gmail.com");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenEmailAddress_WhenNull_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		try {
			userValidator.validateEmail.validate(null);
		}
		catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL,e.type);
		}
	}
	
	@Test
	public void givenEmailAddress_WhenEmpty_ShouldReturnFalse() throws UserValidationException {
		UserValidator userValidator = new UserValidator();
		try {
			userValidator.validateEmail.validate("");
		}
		catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY,e.type);
		}
		
	}
	
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateMobileNumber.validate("91 9290090032");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenMobileNumber_WhenShort_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateMobileNumber.validate("91 92900900");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenMobileNumber_WhenNoSpace_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateMobileNumber.validate("919290090032");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenMobileNumber_WhenNoCountryCode_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validateMobileNumber.validate("9290090032");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenMobileNumber_WhenNull_ShouldReturnFalse()  {
		UserValidator userValidator = new UserValidator();
		try {
			userValidator.validateMobileNumber.validate(null);
		}
		catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL,e.type);
		}
		
	}
	
	@Test
	public void givenMobileNumber_WhenEmpty_ShouldReturnFalse(){
		UserValidator userValidator = new UserValidator();
		try {
			userValidator.validateMobileNumber.validate("");
		}
		catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY,e.type);
		}
		
	}
	
	@Test
	public void givenMobileNumber_WhenCharatersArePresent_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateMobileNumber.validate("9a 584309fs890");
		Assert.assertFalse(result);
		
	}

	@Test
	public void givenMobileNumber_WhenSpecialCharatersArePresent_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateMobileNumber.validate("$67 43829*4328");
		Assert.assertFalse(result);
		
	}
	
	@Test
	public void givenPassword_WhenShort_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validatePassword.validate("Kdj1@f");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenNoUpperCase_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validatePassword.validate("kjfdsk@1");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenNoNumericalDigit_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validatePassword.validate("fAjdklK@jk");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenNoSpecialCharacter_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validatePassword.validate("fjkdFls1");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenMoreThanOneSpecialCharacter_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.validatePassword.validate("fjFdls@$jlk2");
		Assert.assertFalse(result);
	}
	
	
	@Test
	public void givenPassword_WhenNull_ShouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		try {
			userValidator.validatePassword.validate(null);
		}
		catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL,e.type);
		}
		
	}
	
	@Test
	public void givenPassword_WhenEmpty_ShouldReturnFalse()  {
		UserValidator userValidator = new UserValidator();
		try {
			userValidator.validatePassword.validate("");
		}
		catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY,e.type);
		}
		
	}
	
	
}