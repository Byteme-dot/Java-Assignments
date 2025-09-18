class Box{
    float width;
    float height;
    float depth;

    Box(float width,float height,float depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    void PrintBox(){
        System.out.println("Width: "+width+" Height: "+height+" Depth: "+depth);
    }
}

class BoxWeight extends Box{

    float weight;
    public BoxWeight(float width,float height,float depth,float weight) {
        super(width,height,depth);
        this.weight = weight;
    }

    void PrintBoxWeight(){
        System.out.println("Width: "+width+" Height: "+height+" Depth: "+depth+" Weight: "+weight);
    }
}

public class Q3 {
    public static void main(String[] args){
        Box box = new Box(32,44,28);
        box.PrintBox();
        BoxWeight boxWeight = new BoxWeight(32,44,28,50);
        boxWeight.PrintBoxWeight();
    }
}
