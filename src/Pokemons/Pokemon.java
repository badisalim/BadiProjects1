package Pokemons;

public class Pokemon {

    // Name	Type 1	Type 2	Total	HP	Attack	Defense	Sp. Atk	Sp. Def	Speed	Generation	Legendary


    private Integer number;
    private String name;
    private String type1;
    private String type2;
    private Integer total;
    private Integer hp;
    private Integer attack;
    private Integer defence;
    private Integer defenceSp;
    private Integer attackSp;
    private Integer speed;
    private Integer generation;
    private Boolean legendery;

    public Pokemon(Integer number, String name, String type1, String type2, Integer total, Integer hp, Integer attack, Integer defence, Integer defenceSp, Integer attackSp, Integer speed, Integer generation, Boolean legendery) {
        this.number = number;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.total = total;
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
        this.defenceSp = defenceSp;
        this.attackSp = attackSp;
        this.speed = speed;
        this.generation = generation;
        this.legendery = legendery;
    }

    public Boolean getLegendery() {
        return legendery;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer getHp() {
        return hp;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getDefence() {
        return defence;
    }

    public Integer getDefenceSp() {
        return defenceSp;
    }

    public Integer getAttackSp() {
        return attackSp;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getGeneration() {
        return generation;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", type1='" + type1 + '\'' +
                ", type2='" + type2 + '\'' +
                ", total=" + total +
                ", hp=" + hp +
                ", attack=" + attack +
                ", defence=" + defence +
                ", defenceSp=" + defenceSp +
                ", attackSp=" + attackSp +
                ", speed=" + speed +
                ", generation=" + generation +
                ", legendery=" + legendery +
                '}';
    }
}




