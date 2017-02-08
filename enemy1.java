public class enemy1 extends enemy
{
    enemy1()
    {
        this.setName("菊田");
        this.setHitPoint(1);
        this.setPower(1);
    }

    public void damage()
    {
        if (this.getHitPoint() - 1 > 0) {
            this.setHitPoint(this.getHitPoint() - 1);
        } else {
            System.out.println(this.name + "をやっつけた");
        }
    }
}
