public class Elections {

    volby volby;
    public String Hlavni(int strategy) {

        volby = new volby();
        volby.volby(strategy);
        return volby.determineWinner();


    }
}