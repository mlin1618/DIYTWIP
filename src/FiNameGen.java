/**
 * Created by jg101 on 11/16/16.
 */
public class FiNameGen {

    public FiNameGen(){

    }
    static public String FiName(String f, String l){
        String alfa = "abcdefghijklmnopqrstuvwxyz";
        int fir = alfa.indexOf(f);
        int las = alfa.indexOf(l);
        String name = alfa.substring(fir,las);
        return name;
    }
}
