import java.time.LocalDate; 
import java.time.format.DateTimeFormatter; 

/**
 * Representa un boleto de museo.
 * Cada boleto tiene precio, número consecutivo y fecha de emisión.
 * @author TuNombre
 * @version 1.0
 */
public class BoletoMuseo { 
    /** Precio del boleto. */
    private double precio; 
    /** Número consecutivo del boleto. */
    private int numeroBoleto; 
    /** Fecha de emisión del boleto en formato yyyy-MM-dd. */
    private String fechaEmision; 
    /** Contador global de boletos creados. */
    private static int contador = 0; 

    /**
     * Constructor que inicializa un boleto con el precio indicado.
     * @param precio precio del boleto
     */
    public BoletoMuseo(double precio) { 
        this.precio = precio; 
        contador++; 
        this.numeroBoleto = contador; 
        this.fechaEmision = establecerFechaEmisionBoleto(); 
    } 

    /**
     * Establece la fecha actual como fecha de emisión.
     * @return fecha de emisión en formato yyyy-MM-dd
     */
    private String establecerFechaEmisionBoleto() { 
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
        return LocalDate.now().format(f); 
    } 

    /**
     * Retorna el contador global de boletos creados.
     * @return cantidad de boletos
     */
    public static int getContador() { 
        return contador; 
    } 

    /**
     * Retorna el número del boleto.
     * @return número consecutivo del boleto
     */
    public int getNumeroBoleto() { 
        return numeroBoleto;  
    } 

    /**
     * Retorna el precio del boleto.
     * @return precio del boleto
     */
    public double getPrecio() { 
        return precio;  
    } 

    /**
     * Devuelve una representación en texto del boleto.
     * @return detalle del boleto en formato String
     */
    public String toString() { 
        String msg = "BoletoMuseo\n"; 
        msg += "  Numero: " + numeroBoleto + "\n"; 
        msg += "  Precio: " + precio + "\n"; 
        msg += "  Fecha Emision: " + fechaEmision; 
        return msg; 
    } 
} 
