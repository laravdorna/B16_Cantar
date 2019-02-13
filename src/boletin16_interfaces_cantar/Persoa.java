package boletin16_interfaces_cantar;

public class Persoa implements IPodeCantar {

    @Override
    public void Cantar() {
        System.out.println("do, re, mi, fa, sol, la, si, do");
    }
}
