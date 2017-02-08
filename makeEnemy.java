public class makeEnemy
{
    public static void main(String args[])
    {
        hero hero  = new hero();
        enemy enemy = new enemy1();

        enemy.attack(hero, enemy);
        // enemy.damage();

        enemy.attack(enemy, hero);
        // enemy.move();

        // ryouga.move();
        System.out.println(hero.getName());
    }
}
