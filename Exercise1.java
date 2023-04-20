public class App {

    static boolean iwillNotCheat = true;
    static boolean IwillWin = true;
    public static void main(String[] args) throws Exception {
        assert iwillNotCheat == true: "Sorry my bad, not i didn't mean to do it.";

        enterCompetition();

        assert IwillWin == true: "NOOO!";
    }

    static void enterCompetition(){
        IwillWin = false;
    }
}
