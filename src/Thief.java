public class Thief extends Character{

    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に5ポイントのダメージ");
        m.hp -= 5;
    }

    public void attack(Goblin g) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に10ポイントのダメージ");
        g.hp -= 5;
    }

    public void attack(Slime s) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に5ポイントのダメージ");
        s.hp -= 5;
    }

}