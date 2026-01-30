public class Hero {

    private AbilityStrategy abilityStrategy;

    public void setAbilityStrategy(AbilityStrategy abilityStrategy) {
        this.abilityStrategy = abilityStrategy;
    }

    public void attack(String targetName) {
        
        if (abilityStrategy == null) {
            System.out.println("Chua chon chien thuat!");
            return;
        }
        abilityStrategy.executeAbility(targetName);
    }

    public void decideStrategy(int enemyDistance, int enemyCount) {
        if (enemyCount >= 5) {
            setAbilityStrategy(new AerialBombardmentStrategy());
        } else if (enemyDistance > 100) {
            setAbilityStrategy(new SniperHeadshotStrategy());
        } else {
            setAbilityStrategy(new SniperHeadshotStrategy());
        }
    }
}
