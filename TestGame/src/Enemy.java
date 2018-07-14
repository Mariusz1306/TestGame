import java.util.Random;

public class Enemy {

    private int hp;
    private int weakpoint;
    private boolean Alive;

    public Enemy(int weakpoint, int hp) {
        this.weakpoint = weakpoint;
        this.hp = (hp > 0) ? hp : 1;
        this.Alive = true;
    }

    public void hit(int attack){
        if (attack == this.weakpoint){
            if (--hp == 0){
                System.out.println("Enemy is defeated!");
                this.Alive = false;
            } else {
                System.out.println("You hit an enemy!");
                Random random = new Random();
                this.weakpoint = random.nextInt(11);
            }
        } else {
            System.out.println("You missed!");
            if (attack < weakpoint){
                System.out.println("You should aim higher");
            } else {
                System.out.println("You should aim lower");
            }
        }
    }

    public boolean isAlive(){
        return this.Alive;
    }

    public void look(){
        if(this.hp == 1){
            System.out.println("The enemy looks very weak");
        } else if(this.hp == 2){
            System.out.println("The enemy looks weak");
        } else {
            System.out.println("You don't notice anything useful about enemy");
        }
    }
}
