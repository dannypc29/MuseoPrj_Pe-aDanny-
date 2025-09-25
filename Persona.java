/**
 * Representa una persona que puede tener asignado un boleto de museo.
 * Incluye nombre, identificación y una relación de asociación con BoletoMuseo.
 * @author TuNombre
 * @version 1.0
 */
public class Persona { 
    /** Nombre de la persona. */
    private String nombre; 
    /** Identificación de la persona. */
    private String identificacion; 
    /** Boleto asignado a la persona (asociación). */
    private BoletoMuseo miBoleto;  

    /**
     * Constructor con nombre e identificación.
     * @param nombre nombre de la persona
     * @param ident identificación de la persona
     */
    public Persona(String nombre, String ident) { 
        this(nombre); 
        identificacion = ident; 
    } 

    /**
     * Constructor con nombre únicamente.
     * @param nombre nombre de la persona
     */
    public Persona(String nombre) { 
        this.nombre = nombre; 
    } 

    /**
     * Asigna la identificación de la persona.
     * @param pIdentificacion valor de identificación
     */
    public void setIdentificacion(String pIdentificacion) { 
        identificacion = pIdentificacion; 
    } 

    /**
     * Asigna un boleto a la persona.
     * @param pMiBoleto boleto a asignar
     */
    public void asignarBoleto(BoletoMuseo pMiBoleto) { 
        miBoleto = pMiBoleto; 
    } 

    /**
     * Consulta el número del boleto asignado.
     * @return número del boleto, si existe
     */
    public int consultarMiNumeroDeBoleto() { 
        return miBoleto.getNumeroBoleto(); 
    } 

    /**
     * Devuelve una representación en texto de la persona y su boleto.
     * @return detalle de la persona en formato String
     */
    public String toString() { 
        String msg = "Persona\n"; 
        msg += "  Nombre: " + nombre + "\n"; 
        msg += "  Identificacion: " + identificacion + "\n"; 
        if (miBoleto != null) { 
            msg += "  Boleto asignado: #" + miBoleto.getNumeroBoleto() + "\n"; 
        } else { 
            msg += "  Boleto asignado: (ninguno)\n"; 
        } 
        return msg; 
    } 
} 
