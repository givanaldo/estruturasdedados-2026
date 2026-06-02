import java.util.HashSet;

public class HashTest {
   
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(46);
        System.out.println(hash.hashCode());
        hash.add(18);
        System.out.println(hash.hashCode());
        hash.add(27);
        System.out.println(hash.hashCode());
        hash.add(22);
        System.out.println(hash.hashCode());
        hash.add(45);
        System.out.println(hash.hashCode());
        hash.add(98);
        System.out.println(hash.hashCode());
        
        System.out.println("Tamanho: " + hash.size());
        System.out.println(hash.contains(45));
        System.out.println(hash.contains(55));
        
        System.out.println(hash);
    }
}
