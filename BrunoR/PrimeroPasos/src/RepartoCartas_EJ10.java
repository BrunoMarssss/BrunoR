import java.util.*;

public class RepartoCartas_EJ10 {
    public static void main(String[] args) {
        int numJugadores;
        int numCartas;
        int tipoBaraja;
        
        // comprobamos los argumentos y los seteamos si nos los hubieran pasado
        if (args.length == 3) {
            numJugadores = Integer.parseInt(args[0]);
            numCartas = Integer.parseInt(args[1]);
            tipoBaraja = Integer.parseInt(args[2]);
        } else {
            numJugadores = 4;
            numCartas = 4;
            tipoBaraja = 0;
        }
        
        //crear bajara
        List<String> baraja = crearBaraja(tipoBaraja);
        
        // barajar
        Collections.shuffle(baraja);
        
        //repartir cartas
        List<List<String>> manos = repartirCartas(baraja, numJugadores, numCartas);
        
        for (int i = 0; i < numJugadores; i++) {
            System.out.println("Jugador " + (i + 1) + ": " + manos.get(i));
        }
    }
    
    private static List<String> crearBaraja(int tipoBaraja) {
        List<String> baraja = new ArrayList<>();
        
        if (tipoBaraja == 1) { // BarajaFrancesa
            String[] palos = {"rombos", "corazones", "picas", "treboles"};
            String[] valores = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jota", "Dama", "Rey"};
            
            for (String palo : palos) {
                for (String valor : valores) {
                    baraja.add(valor + " de " + palo);
                }
            }
            
            baraja.add("Joker");
            baraja.add("Joker");
        } else { // BarajaEspañola o TipoBaraja no definida
            String[] palos = {"oros", "copas", "espadas", "bastos"};
            String[] valores = {"As", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};
            
            for (String palo : palos) {
                for (String valor : valores) {
                    baraja.add(valor + " de " + palo);
                }
            }
        }
        
        return baraja;
    }
    
    private static List<List<String>> repartirCartas(List<String> baraja, int numJugadores, int numCartas) {
        List<List<String>> manos = new ArrayList<>();
        
        int totalCartas = numJugadores * numCartas;
        
        if (totalCartas > baraja.size()) {
            System.out.println("No hay suficientes cartas en la baraja.");
            return manos;
        }
        
        for (int i = 0; i < numJugadores; i++) {
            List<String> mano = new ArrayList<>();
            
            for (int j = 0; j < numCartas; j++) {
                mano.add(baraja.remove(0)); 
            }
            
            manos.add(mano);
        }
        
        return manos;
    }
}
