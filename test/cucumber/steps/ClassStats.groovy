/**
 * Created by Vinny on 14/04/2015.
 */

//this.metaClass.mixin(cucumber.runtime.groovy.Hooks)
//this.metaClass.mixin(cucumber.runtime.groovy.EN)


Given(~'^I am at the Teacher Assistant statistics page$'){->
        at StatisticsPage
}

And(~'^"([^"]*)" received "([^"]*)" as her "([^"]*)"$'){String name, result, evaluation ->
        mark = Marks.getStudentEvaluation(name, evaluation)
        assert TestDataAndOperations.compatibleTo(mark, result)
}

And(~'^"([^"]*)" received "([^"]*)" as his "([^"]*)"$'){String name, result, evaluation ->
        mark = Marks.getStudentEvaluation(name, evaluation)
        assert TestDataAndOperations.compatibleTo(mark, result)
}

And(~'^"([^"]*)" received "([^"]*)" as her "([^"]*)"$'){String name, result, evaluation ->
        mark = Marks.getStudentEvaluation(name, evaluation)
        assert TestDataAndOperations.compatibleTo(mark, result)
}

When(~'^I press the "([^"]*)"$'){String buttonName ->
        TestDataAndOperations.select(buttonName)
}

Then(~'^I should see "([^"]*)" as the percentage of students who achieved "([^"]*)" as their "([^"]*)"$'){String percentage, result, evaluation ->
        marks = Marks.getStats(result, evaluation)
        assert TestDataAndOperations.compatibleTo(percentage, mark)
}

And(~'^I should see "([^"]*)" as the percentage of students who achieved "([^"]*)" as their "([^"]*)"$'){String percentage, result, evaluation ->
        marks = Marks.getStats(result, evaluation)
        assert TestDataAndOperations.compatibleTo(percentage, mark)
}

And(~'^I should see "([^"]*)" as the percentage of students who achieved "([^"]*)" as their "([^"]*)"$'){String percentage, result, evaluation ->
        marks = Marks.getStats(result, evaluation)
        assert TestDataAndOperations.compatibleTo(percentage, mark)
}

Given(~'^I am at the Teacher Assistant statistics page$'){->
        at StatisticsPage
}

And(~'^"([^"]*)" is missing "([^"]*)" results$'){String name, evaluation ->
        mark = Marks.getStudentEvaluation(name, evaluation)
        assert TestDataAndOperations.compatibleTo(mark, null)
}

When(~'^I press the "([^"]*)"$'){String buttonName ->
        TestDataAndOperations.select(buttonName)
}

Then(~'^I should see "([^"]*)"$'){String missing ->
        missedTests = Marks.getMissing()
        assert TestDataAndOperations.compatibleTo(missing, missedTests)
}