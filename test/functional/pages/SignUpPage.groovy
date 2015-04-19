package pages

import geb.Page

class SignUpPage extends Page {

	static url = "tas/signup"

	static flag = false

	static at {
		title ==~ /Sign Up Student/
		student != null
	}

	static content = {
		name {
			$("input", id: "name")
		}
		login {
			$("input", id: "login")
		}
	}

	def fillName(nameValue){
		$("form").name = nameValue
	}

	def fillLogin(loginValue){
		$("form").login = loginValue

		if($("form").login == null){
			
		}
	}

	def signUp(){
		$("form").signUp.click()
	}

	def flag(){
		flag = true
	}

	def saveStudent(){

		$("form").submit()

		flag = false
	}

	def sendPassword(){
		sendEmail(loginValue, math.random())
	}

	def findByName(nameValue){
		$("form").find("input", value: nameValue)
	}

	def findByLogin(loginValue){
		$("form").find("input", value: loginValue)
	}

	def popUpErrorMessage(){
		showErrorMessage()
	}

}