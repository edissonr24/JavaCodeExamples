package SimpleExamples.DataStructures;

/**
 * Clase que define los elementos que debe tener un Nodo de la lista.
 * @author xavier
 */
public class Ej03_Nodo {
    // Variable en la cual se va a guardar el valor.
    private int valor;
    // Variable para enlazar los nodos.
    private Ej03_Nodo siguiente;
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public void Ej03_Nodo(){
        this.valor = 0;
        this.siguiente = null;
    }
    
    // Métodos get y set para los atributos.
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Ej03_Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Ej03_Nodo siguiente) {
        this.siguiente = siguiente;
    }   
}
