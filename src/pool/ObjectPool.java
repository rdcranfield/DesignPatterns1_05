public class ObjectPool{


    List<Particle> particles;
    //List<NPC> npcs;
    int size;
    public ObjectPool(int size){
        this.size = size;
        InitialiseParticles();

    }

    public void InitialiseParticles(){
        particles = new ArrayList<Particle>();
        for(int i = 0; i<size; i++){
            particles.add(new Particle());
        }
    }

    public void getParticles(int framesLeft, int posX, int pPosY, int posY, int velocity) {
        if(!particles.get(size-1).isAlive()){
            particles.get(size-1).initialise(framesLeft, posX, posY, velocity);
            particles.add(0, particles.remove(size-1));
        }
    }
    public void animateParticles(){
        //   if(!particles.get(i).isAlive()){
        // How I would have checked. but https://gamedevelopment.tutsplus.com/tutorials/object-pools-help-you-reduce-lag-in-resource-intensive-games--gamedev-651
        // shows a more efficient way of calling once and getting the function call if alive and the boolean result if dead
        for (int i = 0; i < size; i++) {
            if (particles.get(i).animate()) {
                particles.add(size-1, particles.remove(i));
            }
        }
    }
}