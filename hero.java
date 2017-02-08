public class hero extends character
{
    hero()
    {
        this.setName("宮崎");
        this.setHitPoint(1);
        this.setPower(1);
    }

    public void move()
    {
        System.out.println("りょうがは左に動きました。");
    }

    public void damage()
    {
        if (this.getHitPoint() - 1 > 0) {
            this.setHitPoint(this.getHitPoint() - 1);
        } else {
            System.out.println(this.name + "は死んでしまった。");
        }
    }
}
