import static cucumber.runtime.groovy.EN.And
import static cucumber.runtime.groovy.EN.Given
import static cucumber.runtime.groovy.EN.Then
import static cucumber.runtime.groovy.EN.When

/**
 * Created by ess on 16/04/15.
 */


Given(~'^I am on Teaching Assistant students home page$'){ ->
    //to StudentHomePage
    //at StudentHomePage
}

When(~'^I get to the "([^"]*)"$'){ String link ->
    //at StudentHomePage
    //page.select(link)
}

And(~'^I choose the evaluation named "([^"]*)"$') { String evaluationName ->
    SelfEvaluation se = new SelfEvaluation()
    //at EvaluationListPage
    selfevaluation = se.findByEvaluationName(evaluationName)
    assert selfevaluation != null
    //page.select(evaluationName)
}

And(~'^I fill in the fields with my name "([^"]*)" and the required information$') { String studentName ->
    SelfEvaluation se = new SelfEvaluation()
    //at evaluationNamePage
    selfevaluation = se.findByStudentName(studentName)
    assert selfevaluation == null
    assert studentName != null
    //page.fillSelfEvaluationDetails()
    se.adicionar()
    selfevaluation2 = se.findByStudentName(studentName)
    assert selfevaluation2 != null
}

Then(~'^I should see "([^"]*)"$'){ String msg ->
    //at evaluationNamePage
    //page.show(msg)
}
