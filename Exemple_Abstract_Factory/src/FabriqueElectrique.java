public class FabriqueElectrique extends FabriqueAbstraite{
       public Automobile ConstruireAutomobile(){
        return new AutomobileElectrique();
    }
    public Scooter ConstruireScooter(){
        return new ScooterElectrique();
    }

}
