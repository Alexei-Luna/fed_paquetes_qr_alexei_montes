
import java.io.Serializable;
import java.util.Date;


public class Paquete implements Serializable {
    String codigo, remitente, destinatario, fecha;

    public Paquete(String codigo, String remitente, String destinatario, String fecha) {
        this.codigo = codigo;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.fecha = fecha;
    }
            
    public Object[] toArray(){
        return new Object[]{codigo, remitente, destinatario, fecha};
    }

    @Override
    public String toString() {
        return  "<html>" + codigo + "<br>" + remitente + "<br>" + destinatario + "<br>" + fecha + "</html>";
    }
    
    
}
