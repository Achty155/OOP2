public class Elections {


    public static String main(String[] args) {

        volby volby = new volby();
        volby.volby();
        return volby.determineWinner();


    }
}