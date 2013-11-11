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
public class Ticket implements ITicket{
    
    private int id;
    private int codigo;
    private GregorianCalendar data;
    private GregorianCalendar hora;
    private boolean pago;
    private double valor;

    public Ticket(int id, int codigo, GregorianCalendar data, GregorianCalendar hora) {
        this.id = id;
        this.codigo = codigo;
        this.data = data;
        this.hora = hora;
        pago = false;
        valor = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public GregorianCalendar getData() {
        return data;
    }

    public GregorianCalendar getHora() {
        return hora;
    }

    public int getId() {
        return id;
    }

    public boolean isPago() {
        return pago;
    }

    public double getValor() {
        return valor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ", codigo=" + codigo + ", data=" + data + ", hora=" + hora + ", pago=" + pago + ", valor=" + valor + '}';
    }
    
}
