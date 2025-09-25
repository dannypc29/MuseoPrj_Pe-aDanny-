import java.time.LocalDate; 
import java.time.format.DateTimeFormatter; 
import java.util.ArrayList; 
import java.util.List; 

/**
 * Representa la venta de boletos en un día específico.
 * Relación de agregación con BoletoMuseo (una venta incluye varios boletos).
 * @author TuNombre
 * @version 1.0
 */
public class VentaDelDia { 
    /** Fecha de la venta en formato yyyy-MM-dd. */
    private String fechaDeLaVenta; 
    /** Lista de boletos vendidos en el día (agregación). */
    private List<BoletoMuseo> boletosVendidos;  

    /**
     * Constructor que inicializa la fecha y la lista de boletos.
     */
    public VentaDelDia() { 
        fechaDeLaVenta = establecerFechaDeLaVenta(); 
        boletosVendidos = new ArrayList<>(); 
    } 

    /**
     * Registra un boleto en la venta del día.
     * @param boleto boleto vendido
     */
    public void registrarVentaBoleto(BoletoMuseo boleto) { 
        boletosVendidos.add(boleto); 
    } 

    /**
     * Calcula el total de la venta sumando los precios de los boletos.
     * @return monto total de la venta
     */
    public double calcularTotalVentaDelDia() { 
        double total = 0.0; 
        for (BoletoMuseo b : boletosVendidos) { 
            total += b.getPrecio(); 
        } 
        return total; 
    } 

    /**
     * Establece la fecha actual como fecha de la venta.
     * @return fecha actual en formato yyyy-MM-dd
     */
    private String establecerFechaDeLaVenta() { 
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
        return LocalDate.now().format(f); 
    } 

    /**
     * Devuelve una representación en texto de la venta del día.
     * @return detalle de la venta en formato String
     */
    public String toString() { 
        String msg = "VentaDelDia\n"; 
        msg += "  Fecha: " + fechaDeLaVenta + "\n"; 
        msg += "  Cantidad de boletos: " + boletosVendidos.size() + "\n"; 
        msg += "  Detalle:\n"; 
        for (BoletoMuseo b : boletosVendidos) { 
            msg += "    - Boleto #" + b.getNumeroBoleto() + " | " + b.getPrecio() + "\n"; 
        } 
        msg += "  Total: " + calcularTotalVentaDelDia(); 
        return msg; 
    } 
} 
