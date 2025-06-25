public class Hero extends Character{

    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に10ポイントのダメージ");
        m.hp -= 10;
    }

    public void attack(Goblin g) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に10ポイントのダメージ");
        g.hp -= 10;
    }

    public void attack(Slime s) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に10ポイントのダメージ");
        s.hp -= 10;
    }


}