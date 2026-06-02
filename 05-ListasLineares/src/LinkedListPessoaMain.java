import java.util.LinkedList;

public class LinkedListPessoaMain {
    
    public static void imprimeLista(LinkedList<Pessoa> lista) {
        for (Pessoa elemento : lista)
           System.out.println(elemento.toString());    
        System.out.println();
    }

    
    public static void main(String[] args) {
        LinkedList<Pessoa> agenda = new LinkedList<>();
                
        agenda.add(new Pessoa("Fulano Dital", "84 5555-5555"));
        agenda.add(new Pessoa("Joao da Silva", "84 4444-4444"));
        agenda.add(new Pessoa("Jose Oliveira", "81 4322-4471"));
        agenda.add(new Pessoa("Maria de Jesus", "83 2222-1287"));
        agenda.add(new Pessoa("Neymar Junior", "21 1230-8745"));
        
        imprimeLista(agenda);
        agenda.addFirst(new Pessoa("Jorge Jesus", "21 6666-5555"));
        imprimeLista(agenda);
        // como remover um item a partir do nome
        agenda.remove(new Pessoa("Jose Oliveira", "81 4322-4471"));
        imprimeLista(agenda);
        
    }
}
