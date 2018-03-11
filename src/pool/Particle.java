public class Particle{

    float x, y, velocity;
    int framesLeft;

    boolean isAlive;

    public Particle(){
        //initialise();
        //blank for all objects in pool, only when
        //object is needed are they concretely implemented.
        x = 0;
        y = 0;
        velocity = 0;
        framesLeft = 0;

    }

    public Initialise( float x,float y, float velocity, int framesLeft){
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        this.framesLeft = framesLeft;
    }

    public void animate(){
        if(isAlive()){
            x += velocity;
            framesLeft--;
        }
    }

    public boolean isAlive(){
        return framesLeft > 0;//result = (framesLeft > 0) ? true : false; 
    }
}