/**
 * Created by Bruno Minhaqui on 18/04/15.
 */
import pages.*
import static cucumber.api.groovy.EN.*

Given(~'I fill in "([^"]*)" with "([^"]*)" and let "([^"]*)" "([^"]*)" on the Sign Up page$') { String name, nameValue, login, loginValue ->
	at SignUpPage

	name.fillName(nameValue)
	login.fillLogin(loginValue)
}

And(~'I press "([^"]*)"$') { String signUp->
	at SignUpPage

	page.click(signUp)
}

Then(~'I should see a error message$') { ->
	at SignUpPage

	page.popUpErrorMessage()
}