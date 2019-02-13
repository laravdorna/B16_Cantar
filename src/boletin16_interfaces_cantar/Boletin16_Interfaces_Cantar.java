package boletin16_interfaces_cantar;

public class Boletin16_Interfaces_Cantar {

    public static void main(String[] args) {
        Persoa per = new Persoa();
        Canario ca = new Canario();
        Galo ga = new Galo();
        per.Cantar();
        ca.Cantar();
        ga.Cantar();
        System.out.println("*********");
        IPodeCantar dox = new Persoa();
        dox.Cantar();
        Tenor te = new Tenor();
        te.Cantar();
    }
}
