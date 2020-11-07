package TrabalhoED1AVL.exceptions;

public class DiretorioInexistenteLSException extends Exception{
    public DiretorioInexistenteLSException(String comando, String op){
        super(comando + ": unable to access '" + op + "': No such file or directory");
    }
}
