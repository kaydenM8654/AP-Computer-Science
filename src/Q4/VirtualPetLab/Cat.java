package Q4.VirtualPetLab;

public class Cat extends Pet{
    public Cat(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomCatImg());
    }

    @Override
    public void feed() {
        if(this.getHunger() > 0){
            setHunger(0);
        }
        if(this.getEnergy() < 100){
            setEnergy(MAX_ENERGY);
        }
        if(this.getHappiness() < 100){
            setHappiness(MAX_HAPPINESS);
        }
    }

    @Override
    public void play() {
        // TODO: Implement playing behavior for Cat
    }

    @Override
    public void sleep() {
        // TODO: Implement sleeping behavior for Cat
    }
}
