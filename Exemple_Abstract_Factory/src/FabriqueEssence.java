public class FabriqueEssence extends FabriqueAbstraite {
    public Automobile ConstruireAutomobile(){
        return new AutomobileEssence();
    }
    public Scooter ConstruireScooter(){
        return new ScooterEssence();
    }

}
