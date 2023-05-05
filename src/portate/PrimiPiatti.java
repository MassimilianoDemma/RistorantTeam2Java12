package portate;

import enumartion.StagioniEnum;
import enumartion.UtilityEnum;

public class PrimiPiatti extends Portata {


    private StagioniEnum stagione;
    public PrimiPiatti(String nome, Double prezzo, String ingredienti,StagioniEnum stagione) {
        super(nome, prezzo, ingredienti);
        this.stagione=stagione;
    }
    public StagioniEnum getStagione() {
        return stagione;
    }

    public void printdisponibilitàStagionale(){

        switch (stagione){

            case ESTATE -> System.out.println(UtilityEnum.WHITE_CAPITAL.getFormat()+getNome()+": contiene solo ingredienti freschi");
            case PRIMAVERA -> System.out.println(UtilityEnum.WHITE_CAPITAL.getFormat()+getNome()+": gli insaccati sono stagionati da almeno 3 mesi");
            case AUTUNNO -> System.out.println(UtilityEnum.WHITE_CAPITAL.getFormat()+getNome()+": alcuni formati di pasta a seconda della disponibilità potranno essere surgelati");
            case INVERNO -> System.out.println(UtilityEnum.WHITE_CAPITAL.getFormat()+getNome()+": verdure e alcuni formati di pasta a seconda della disponibilità potranno essere surgelati ");
            default -> System.out.println(UtilityEnum.WHITE_CAPITAL.getFormat()+getNome()+": il piatto è fuori menù");
        }
   }

    @Override
    public void printInfo(UtilityEnum coloreIngredienti, UtilityEnum colorePiatti) {
        super.printInfo(coloreIngredienti, colorePiatti);
        printdisponibilitàStagionale();

    }
}




