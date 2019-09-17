package entities;

public class Player implements Observer {

    private String name;
    private Boolean bossState;
    private static final int attack = 2;

    public Player(String name) {
        this.name = name;

    }

    @Override
    public void updateState() {
        bossState = Boss.getState();
    }

    public void verificationLife() {
        if (bossState && Boss.getLife() > 0) {
            informationAttack();
        } else {
            Boss.changeState();
            System.out.println("The boss dead!");
            System.out.println();
            System.out.println("Wait the next Boss");
        }
    }

    private void informationAttack() {
        System.out.println(this.name + " has launched an attack!");
        System.out.println("Minus two hit points damage to boss.");
        attackBoss();
        System.out.println("Boss life is : " + Boss.getLife());
        System.out.println();
    }

    private void attackBoss() {
        Boss.setLife(Boss.getLife() - attack);
    }
}
