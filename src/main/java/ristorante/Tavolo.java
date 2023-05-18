package ristorante;

import enumartion.PosizioneEnum;
import enumartion.TypesEnum;
import portate.Portata;

import java.util.ArrayList;
import java.util.List;

public class Tavolo {
    private Integer numero;
    private PosizioneEnum posizione;
    private TypesEnum tipo;
    private boolean prenotazione;
    private Integer numeroMaxClienti;

    //TODO la lista è nel ristorante
    private List<Cliente> clienteList;

    public Tavolo(Integer numero, PosizioneEnum posizione, TypesEnum tipo, boolean prenotazione,Integer numeroMaxClienti) {
        this.numero = numero;
        this.posizione = posizione;
        this.tipo = tipo;
        this.prenotazione = prenotazione;
        this.numeroMaxClienti = numeroMaxClienti;
        this.clienteList=new ArrayList<>();
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public PosizioneEnum getPosizione() {
        return posizione;
    }

    public TypesEnum getTipo() {
        return tipo;
    }

    public boolean isPrenotazione() {
        return prenotazione;
    }

    public void setPrenotazione(boolean prenotazione) {
        this.prenotazione = prenotazione;
    }

    public Integer getNumeroMaxClienti() {
        return numeroMaxClienti;
    }

    public void setNumeroMaxClienti(Integer numeroMaxClienti) {
        this.numeroMaxClienti = numeroMaxClienti;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void addCliente(Cliente cliente) {
        clienteList.add(cliente);
    }

    //TODO anche questo metodo

    public void removeCliente(Cliente cliente) {
        clienteList.remove(cliente);
    }


    //TODO lo deve fare il ristorante

    public void removeAllCliente() {

        for (Cliente cliente : clienteList){

            clienteList.remove(cliente);

        }

    }

}