import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
public class LISTAS {
    public static void main(String[] args){
    List<String> nomes= new ArrayList<>();//Instanciando uma Lista de nome nomes
    nomes.add("Arthur");
    nomes.add("joao");
    nomes.add("Felipe");
    System.out.println("  LISTA  \n"+nomes+"\n\n");
    nomes.set(2,"Jorge");
    nomes.add("Junior");
    System.out.println(nomes);
    nomes.remove("Junior");// Remobendo Junior
        System.out.println("Lista reordedana: ");
    Collections.sort(nomes);//Reordenando em ordem alfabetica
        //Metodo para percorrer a lista
    System.out.println(nomes);
    String primeiroNome = nomes.get(0);
    System.out.println(primeiroNome);


        Iterator<String> iterator=nomes.iterator();
        while(iterator.hasNext()){
          System.out.printf("Proximo elemento -> %s\n", iterator.next());
        }

    int tamanho=nomes.size();
    System.out.printf("Tamanho da lista: %d\n",tamanho);
    System.out.printf("O indice do elemento \"Carlos\" na lista é %d",nomes.indexOf("Jorge"));
    nomes.clear();
    System.out.println(nomes);

    }
}
