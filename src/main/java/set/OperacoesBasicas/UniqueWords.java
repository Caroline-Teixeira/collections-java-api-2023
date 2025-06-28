package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class UniqueWords {

    /*Crie uma classe chamada "ConjuntoPalavrasUnicas" que possui um conjunto de palavras únicas como atributo. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra)`: Adiciona uma palavra ao conjunto.
- `removerPalavra(String palavra)`: Remove uma palavra do conjunto.
- `verificarPalavra(String palavra)`: Verifica se uma palavra está presente no conjunto.
- `exibirPalavrasUnicas()`: Exibe todas as palavras únicas do conjunto.
</p> */

 private Set<String> uniqueWordsSet;

 public UniqueWords() {
    this.uniqueWordsSet = new HashSet<>();

 }


 public void addWord(String word){
    uniqueWordsSet.add(word);

 }

 // Remover palavras.
public void removeWord(String word){
    String wordToRemove = null;
    for (String w : uniqueWordsSet){
        if (w.equals(word)) {
            wordToRemove = w;
            break;
        }
    }
    if (wordToRemove != null) {
        uniqueWordsSet.remove(wordToRemove);
    }
}

public void checkWord (String word){

}

public void printUniqueWords (){
    
}
 

}
