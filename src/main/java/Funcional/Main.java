package Funcional;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

            Operacion o = (a,  b) -> a + b;
            System.out.println(o.calcular(3, 2));

            Function<String , Integer> f = x -> x.length();
            System.out.println(f.apply("Hola"));

    }
}
