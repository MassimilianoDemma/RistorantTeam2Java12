package portate;


import enumartion.UtilityEnum;

import java.util.Objects;

public class Portata {
    private String nome;
    private Double prezzo;
    private String ingredienti;

    public Portata(String nome, Double prezzo, String ingredienti) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.ingredienti = ingredienti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }


    public void printInfo(UtilityEnum coloreIngredienti, UtilityEnum colorePiatti){
        System.out.println(colorePiatti.getFormat()+nome+": "+prezzo+" euro");
        System.out.println(coloreIngredienti.getFormat()+"("+ingredienti+")");


    }

    public void printInfosemplice(){
        System.out.println(nome+": "+prezzo+" euro");
        System.out.println("("+ingredienti+")");

    }

    @Override
    public String toString() {
        return "portate.Portata{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", ingredienti='" + ingredienti + '\'' +
                '}';
    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Portata portata = (Portata) obj;
        return nome == portata.getNome() && Objects.equals(nome, portata.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
