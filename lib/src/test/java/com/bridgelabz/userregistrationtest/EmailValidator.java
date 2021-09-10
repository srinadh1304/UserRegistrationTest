package com.bridgelabz.userregistrationtest;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EmailValidator {

	public String email;
	public boolean assertion;
	public UserValidator userValidatorObject;

	@SuppressWarnings("rawtypes")
	@Parameterized.Parameters
	public static Collection input() {

		return Arrays.asList(new Object[][] { { "abc@bridgelabz.co.in", true }, { "abc@gmail.com.co", true },
			{ "abc@yahoo.com", true }, { "abc@1.com", true }, { "abc-100@yahoo.com", true },
			{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
			{ "abc.100@abc.com.au", true }, { "abc+100@gmail.com", true },{ ".abc@abc.com", false },
			{ "abc", false }, { "abc@.com.my", false }, { "abc@abc@gmail.com", false },{ "abc()*@gmail.com", false },
			{ "abc..2002@gmail.com", false },{ "abc123@.com", false }, { "abc123@.com.com", false }, { "abc123@gmail.a", false },
			{ "abc@%*.com", false }, { "abc@gmail.com.1a", false }, { ".abc@gmail.com.aa.au", false } 
		});
	}

	public EmailValidator(String email, boolean assertion) {
		this.email = email;
		this.assertion = assertion;
	}

	@Before
	public void initialize() {
		userValidatorObject = new UserValidator();
	}

	@Test
	public void givenEmail_Should_Return_Expected_Result() throws UserValidationException{
		boolean testResult = UserValidator.validateEmail(email);
		Assert.assertEquals(testResult, assertion);
	}

}
