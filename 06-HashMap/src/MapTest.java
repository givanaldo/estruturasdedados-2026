
import java.util.HashMap;


public class MapTest {

    public static void main(String[] args) {
        HashMap<String, Carro> mapa = new HashMap<>();
        mapa.put("ABC-5E12", new Carro("Fusca", "VW"));
        mapa.put("XYZ-32A2", new Carro("Palio", "Fiat"));
        mapa.put("KKK-501A", new Carro("Opala", "Chevrolet"));
        mapa.put("RGH-2121", new Carro("Gol quadrado", "VW"));
        
        System.out.println(mapa);
        System.out.println(mapa.keySet());
        System.out.println(mapa.values());
        System.out.println(mapa.get("XYZ-32A2"));
        System.out.println(mapa.containsKey("XYZ-32A2"));
        System.out.println(mapa.get("XYZ-3292"));
    }

}
