import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu("cheneso", "carne");
        Menu menu2 = new Menu("cheneso", "carne");

        Antipasti antipasto1 = new Antipasti("Caprese", 5.00);
        Antipasti antipasto2 = new Antipasti("Tagliere di salumi e formaggi", 10.00);
        Antipasti antipasto3 = new Antipasti("Frittura di verdure miste", 6.00);
        Antipasti antipasto4 = new Antipasti("Anelli di cipolla", 5.00);
        Antipasti antipasto5 = new Antipasti("Antipasto della casa", 7.00);


        //TODO per tutte le classi dare un occhio a questo esempio
        menu.addAntipasto(antipasto1);
        menu.addAntipasto(antipasto2);
        menu2.addAntipasto(antipasto3);
        menu.addAntipasto(antipasto1);
        menu.addAntipasto(antipasto1);

        menu.printAntipasti();


        PrimiPiatti primo1 = new PrimiPiatti("Lasagne alla Bolognese", 12.0);
        PrimiPiatti primo2 = new PrimiPiatti("Bucatini alla amatriciana", 11.0);
        PrimiPiatti primo3 = new PrimiPiatti("Tortellini con panna", 14.0);
        PrimiPiatti primo4 = new PrimiPiatti("Pennette alla vodka", 10.0);
        PrimiPiatti primo5 = new PrimiPiatti("Trofie al pesto genovese", 10.0);


        SecondiPiatti secondo1 = new SecondiPiatti("Carpaccio di filetto con rucola e scaglie di parmigiano", 12.00);
        SecondiPiatti secondo2 = new SecondiPiatti("Grigliata di scampi e gamberi", 16.0);
        SecondiPiatti secondo3 = new SecondiPiatti("Impepata di cozze", 12.0);
        SecondiPiatti secondo4 = new SecondiPiatti("Filetto di manzo alla tartara", 13.0);
        SecondiPiatti secondo5 = new SecondiPiatti("Nodino di vitello alla griglia", 13.0);


        Dolci dolci1 = new Dolci("Tiramisù", 12.5);
        Dolci dolci2 = new Dolci("Torta della nonna", 9.0);
        Dolci dolci3 = new Dolci("Gelato", 2.0);
        Dolci dolci4 = new Dolci("Panna Cotta", 5.0);
        Dolci dolci5 = new Dolci("Macedonia di frutta", 7.0);


        Bevande bevanda1 = new Bevande("Acqua naturale", 1d);
        Bevande bevanda2 = new Bevande("Acqua frizzante", 1d);
        Bevande bevanda3 = new Bevande("Sprite", 3d);
        Bevande bevanda4 = new Bevande("Coca cola", 3d);
        Bevande bevanda5 = new Bevande("Vino", 100d);
        menu.addBevanda(bevanda1);
        menu.addBevanda(bevanda2);
        menu.addBevanda(bevanda3);
        menu.addBevanda(bevanda4);
        menu.addBevanda(bevanda5);

        System.out.println(UtilityColor.PURPLE+"Bevande: ");
        menu.printBevande();


    }
}