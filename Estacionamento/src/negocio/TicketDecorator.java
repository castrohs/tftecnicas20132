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
public abstract class TicketDecorator implements ITicket{
    
    ITicket ticketDecorado;
    
    public TicketDecorator(ITicket ticket){
        ticketDecorado = ticket;
    }
    
    
    public int getCodigo() {
        return ticketDecorado.getCodigo();
    }

    public GregorianCalendar getData() {
        return ticketDecorado.getData();
    }

    public GregorianCalendar getHora() {
        return ticketDecorado.getHora();
    }

    public int getId() {
        return ticketDecorado.getId();
    }

    public boolean isPago() {
        return ticketDecorado.isPago();
    }

    public double getValor() {
        return ticketDecorado.getValor();
    }

    public void setCodigo(int codigo) {
        ticketDecorado.setCodigo(codigo);
    }

    public void setPago(boolean pago) {
        ticketDecorado.setPago(pago);
    }

    public void setValor(double valor) {
        ticketDecorado.setValor(valor);
    }
    
    public abstract String toString();


    
    
}
