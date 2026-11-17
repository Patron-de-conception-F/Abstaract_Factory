public class Client {
    public static void main(String[] args)  {
        System.out.println("Hello, World!");
        FabriqueAbstraite FE= new FabriqueEssence();
        FabriqueAbstraite FEL= new FabriqueElectrique();
        Scooter SC= null;
        Automobile  AU= null;
        // utilisation de la première fabrique
        SC= FE.ConstruireScooter();
        AU= FE.ConstruireAutomobile();
        SC.methodeScooter();
        AU.methodeAutomobile();
        // deuxième fabrique
          SC= FEL.ConstruireScooter();
        AU= FEL.ConstruireAutomobile();
        SC.methodeScooter();
        AU.methodeAutomobile();

    


    }
}
