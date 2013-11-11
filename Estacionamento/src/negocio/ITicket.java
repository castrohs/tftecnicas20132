/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.GregorianCalendar;

/**
 *
 * @author 08200177
 */
 public interface ITicket {
     int getCodigo();
     GregorianCalendar getData();
     GregorianCalendar getHora();
     int getId();
     boolean isPago();
     double getValor();
     void setCodigo(int codigo);
     void setPago(boolean pago);
     void setValor(double valor);
     @Override
     String toString();
}
