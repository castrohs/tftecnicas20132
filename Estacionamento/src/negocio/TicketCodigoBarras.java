/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author 08200177
 */
public class TicketCodigoBarras extends TicketDecorator{

    public TicketCodigoBarras(ITicket ticket){
        super(ticket);
    }
    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
