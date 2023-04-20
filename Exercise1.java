public class App {

    static boolean iwillNotCheat = true;
    static boolean IwillWin = true;
    public static void main(String[] args) throws Exception {
        
        enterCompetition();
        assert iwillNotCheat == true: "Sorry my bad, I didn't mean to do it.";

        assert IwillWin == true: "NOOO!";
    
    }
    static void enterCompetition(){
        IwillWin= false;
    }
}
