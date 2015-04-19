package tas
/**
 * Created by ess on 15/04/15.
 */
class SelfEvaluation {

    String studentName
    String evaluationName
    String info
    boolean adicionou = false

    SelfEvaluation findByStudentName(String studentName){
        if(!adicionou){
            return null
        }
        else return new SelfEvaluation()
    }

    SelfEvaluation findByEvaluationName(String evaluationName){
        if(evaluationName.equals("test")){
            return new SelfEvaluation()
        }
        else return null
    }

    def adicionar(){
        adicionou = true;
    }

}
