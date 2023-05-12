package ristorante;

import enumartion.ColorsEnum;
import enumartion.TypesEnum;
import portate.*;

import java.util.*;

public class Ristorante {

    private String nome;
    private String indirizzo;
    private Integer voto;
    private boolean JustEat;
    private TypesEnum tipo;
    private List<Menu> menuList;
    private Map<Tavolo,List<Cliente>>tavoloListMap;



    public Ristorante(String nome, String indirizzo,TypesEnum tipo, Boolean JustEat) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.tipo=tipo;
        this.JustEat = JustEat;
        this.menuList = new ArrayList<>();
        this.tavoloListMap=new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public TypesEnum getTipo() {
        return tipo;
    }

    public Integer getVoto() {
        return voto;
    }

    public void setVoto(Integer voto) {
        this.voto = voto;
    }

    public boolean isJustEat() {
        return JustEat;
    }

    public void setJustEat(boolean justEat) {
        JustEat = justEat;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public Map<Tavolo, List<Cliente>> getTavoloListMap() {
        return tavoloListMap;
    }

    public void addMenu(Menu menu) {
        menuList.add(menu);
    }

    public void removeMenu(Menu menu) {
        menuList.remove(menu);
    }

    public void printRistorante() {
        for (Menu menus : menuList) {
            System.out.println(nome + "\n" + " \uD83D\uDFE2⚪\uD83D\uDD34");
            System.out.println(ColorsEnum.PURPLE_BOLD.getFormat() + menus.getNome() + "\n");

            menus.printMenu();
            menus.printPrezzoMedioMenu();
            menus.reimpostaPrezzoMedio();
        }

    }


    /**
     * Metodo per creare e stampare un menu a sorpresa scegliendo tra i menu del ristorante
     */

    public void printMenuSorpresa() {

        Random random = new Random();

        List<Antipasti> antipastiList = getMenuList().get(random.nextInt(getMenuList().size()))
                .getPortataList().stream()
                .filter(portata -> portata instanceof Antipasti)
                .map(p -> (Antipasti) p)
                .toList();
        List<PrimiPiatti> primiPiattiList =getMenuList().get(random.nextInt(getMenuList().size()))
                .getPortataList().stream()
                .filter(portata -> portata instanceof PrimiPiatti)
                .map(p -> (PrimiPiatti) p)
                .toList();
        List<SecondiPiatti> secondiPiattiList = getMenuList().get(random.nextInt(getMenuList().size()))
                .getPortataList().stream()
                .filter(portata -> portata instanceof SecondiPiatti)
                .map(p -> (SecondiPiatti) p)
                .toList();
        List<Dolci> dolciList = getMenuList().get(random.nextInt(getMenuList().size()))
                .getPortataList().stream()
                .filter(portata -> portata instanceof Dolci)
                .map(p -> (Dolci) p)
                .toList();
        List<Bevande> bevandeList = getMenuList().get(random.nextInt(getMenuList().size()))
                .getPortataList().stream()
                .filter(portata -> portata instanceof Bevande)
                .map(p -> (Bevande) p)
                .toList();


        List<Portata> bundlePortata = new ArrayList<>();
        Portata antipastoBundle = antipastiList.get(random.nextInt(antipastiList.size()));
        Portata primipiattiBundle = primiPiattiList.get(random.nextInt(primiPiattiList.size()));
        Portata secondipiattiBundle = secondiPiattiList.get(random.nextInt(secondiPiattiList.size()));
        Portata dolciBundle = dolciList.get(random.nextInt(dolciList.size()));
        Portata bevandeBundle = bevandeList.get(random.nextInt(bevandeList.size()));

        bundlePortata.add(antipastoBundle);
        bundlePortata.add(primipiattiBundle);
        bundlePortata.add(secondipiattiBundle);
        bundlePortata.add(dolciBundle);
        bundlePortata.add(bevandeBundle);

        System.out.println("Il menù a sorpresa di oggi è:\n " +
                "\n Antipasto: " + bundlePortata.get(0).getNome() +
                "\n Primo: " + bundlePortata.get(1).getNome() +
                "\n Secondo: " + bundlePortata.get(2).getNome() +
                "\n Dolce: " + bundlePortata.get(3).getNome() +
                "\n Bevanda: " + bundlePortata.get(4).getNome() + "\n");
    }

    /**
     * Metodo che verifica se un menu ha la consegna con justeat
     *
     * @param menu
     */

    public void consegnaJustEat(Menu menu) {

        if (isJustEat()) {

            if (menu.prezzoMenu() >= 0 && menu.prezzoMenu() <= 20) {

                System.out.println(ColorsEnum.ANSI_RESET.getFormat() + ("Il prezzo di consegna è gratuito    \n"));
            }
            if (menu.prezzoMenu() > 20 && menu.prezzoMenu() <= 40) {
                System.out.println(ColorsEnum.ANSI_RESET.getFormat() + ("Il prezzo di consegna è: " + menu.prezzoMenu() / 25 + " euro    \n"));
            }
            if (menu.prezzoMenu() > 40) {
                System.out.println(ColorsEnum.ANSI_RESET.getFormat() + ("Il prezzo di consegna è: " + menu.prezzoMenu() / 15 + " euro    \n"));
            }

        }

    }

    public void prenotaTavolo(Tavolo tavolo, List<Cliente> clienteList) {
        if (!tavolo.isPrenotazione()) {

            if (clienteList.size() <= tavolo.getNumeroMaxClienti()) {
                tavoloListMap.put(tavolo, clienteList);
                tavolo.setPrenotazione(true);
            } else {
                System.out.println("Il tavolo selezionato non può ospitare il numero di clienti specificato.");
            }
        } else {
            System.out.println("Il tavolo selezionato è già prenotato.");
        }
    }

    public void annullaPrenotazione(Tavolo tavolo) {

        if (tavolo.isPrenotazione()) {
            tavoloListMap.remove(tavolo);
            tavolo.setPrenotazione(false);
        } else {
            System.out.println("Il tavolo selezionato non è prenotato.");
        }
    }
}