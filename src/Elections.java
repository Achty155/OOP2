public class Elections {


    public static String main(int strategy) {

        volby volby = new volby();
        volby.volby(strategy);
        return volby.determineWinner();


    }
}