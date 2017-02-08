abstract class character extends Object
{
    String name;
    int    hp;
    int    power;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setHitPoint(int hp)
    {
        this.hp = hp;
    }

    public void setPower(int power)
    {
        this.power = power;
    }

    public String getName()
    {
        return this.name;
    }

    public int getHitPoint()
    {
        return this.hp;
    }

    public void attack(character atk, character def)
    {
        System.out.println(atk.getName() + "は攻撃した。" + def.getName() + "に1のダメージ！");
        def.damage();
    }

    abstract public void damage();

    abstract public void move();
}
