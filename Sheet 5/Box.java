class Box {
    int wi;
    int he;
    int de;

    Box() {
        wi = he = de = -1;
    }

    Box(int wi, int he, int de) {
        this.wi = wi;
        this.he = he;
        this.de = de;
    }

    void volume() {
        System.out.println("The volume is " + (wi * he * de) + " cubic units");
    }

}

class BoxWeight extends Box {
    double weight;

    BoxWeight(int wi, int he, int de, int weight) {
        super(wi, he, de);
        this.weight = weight;
    }

    BoxWeight() {
        super();
        weight = -1;
    }
}

class Shipment extends BoxWeight {
    double cost;

    Shipment() {
        super();
        cost = 0;
    }

    Shipment(int wi, int he, int de, int weight, double cost) {
        super(wi, he, de, weight);
        this.cost = cost;
    }
}

 class Main {
     public static void main(String[] args) {
        
        Shipment x = new Shipment();
        x.volume();
        
        Shipment y = new Shipment(5, 6, 7, 25, 100);
        y.volume();
        

}
 }
