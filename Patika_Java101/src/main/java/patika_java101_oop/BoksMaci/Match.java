package patika_java101_oop.BoksMaci;

public class Match {
    int round = 1;
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            if (isFirst()) {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("======Round " + round + "=======");
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.f2.name + " Saglik: " + this.f2.health);
                    System.out.println(this.f1.name + " Saglik: " + this.f1.health);
                    round++;
                    System.out.println(" ");
                }
            } else {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("======Round " + round + "=======");
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.f2.name + " Saglik: " + this.f2.health);
                    System.out.println(this.f1.name + " Saglik: " + this.f1.health);
                    round++;
                    System.out.println(" ");
                }

            }

        } else {
            System.out.println("Sporcularin sikletleri uymuyor !");
        }
    }


    boolean isCheck() {
        return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " Kazandi !");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " Kazandi !");
            return true;
        }
        return false;
    }

    boolean isFirst() {
        double randonNumber = Math.random() * 100;
        if (randonNumber >= 50) {
            System.out.println("Ilk Hamleyi Yapacak Kisi: " + this.f1.name);
            return true;
        } else {
            System.out.println("Ilk Hamleyi Yapacak Kisi: " + this.f2.name);
            return false;
        }
    }
}