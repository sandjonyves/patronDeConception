public class Singleton{

    private static Singleton instance;
    private int x;
    private int y;
    private int z;

    private Singleton(){

    }

    private Singleton(int x, int y){
        this.x = x;
        this.y = y;
    }

    private Singleton(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public static Singleton getInstance(int x, int y){
        if(instance == null){
            instance = new Singleton(x,y);
        }
        return instance;
    }

    public static Singleton getInstance(int x, int y, int z){
        if(instance == null){
            instance = new Singleton(x,y,z);
            
        }
        return instance;
    }

    public void displayI(){
        System.out.println("intance sans parametre");
    }

    public int sum(int x, int y){
        return x + y ;
    }

    public float average(int x, int y){
        return (x + y) / 2.0f;
    }
    public void display(){
        System.out.println("x: " + x + ", y: " + y);
    }


    public int sum2(int x, int y, int z){
        return x + y + z;
    }

    public float average2(int x, int y, int z){
        return (x + y + z) / 3.0f;
    }

    public void display2(){
        System.out.println("x: " + x + ", y: " + y + ", z: " + z);
    }

}