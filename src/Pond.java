import java.nio.file.WatchEvent;

public class Pond {

    static Water water;

    public Pond (String color){

    water = new Water(color);

}


}

class Water {
    String color;

    public Water (String color){
        this.color = color;
    }
}