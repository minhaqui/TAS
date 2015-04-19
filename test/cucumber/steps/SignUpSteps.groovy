/**
 * Created by Bruno Minhaqui on 16/04/15.
 */
import pages.*
import static cucumber.api.groovy.EN.*

Given(~'I am on the Home Page$') { ->
	to HomePage
	at HomePage
}

When(~'^I press "([^"]*)"$') { ->
	at HomePage
	page.signUp = true
}

Then(~'I should be on the Sign Up page$') { ->
	at HomePage
	to SignUpPage
}

When(~'^I fill "([^"]*)" with "([^"]*)" and "([^"]*)" with "([^"]*)"$') { String name, nameValue, login, loginValue ->
	name.fillName(nameValue)
	login.fillLogin(loginValue)
}

And(~'^I press "([^"]*)"$') { ->
	at SignUpPage
	
	page.signUp.click()
}

And(~'a student with this name or this login is not stored on the system$') { ->
	at SignUpPage

	if(findByName(SignUpPage.getName()) == null && findByLogin(SignUpPage.getLogin()) == null){
		page.flag()
	}
}

Then(~'the student should be stored by the system$') { ->
	at SignUpPage

	if(!page.flag()){
		page.saveStudent()
	}
}

And(~'a random password should be sent to the email of the student$') { ->
	at SignUpPage

	sendPassword(page.getLogin())
}