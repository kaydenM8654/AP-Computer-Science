package Q4.VirtualPetLab;

public class Dog extends Pet{
    public Dog(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomDogImg());
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
        if(this.getHappiness() < 100){
            setHappiness(MAX_HAPPINESS);
        }
        if(this.getHunger() < 100){
            setHunger(MAX_HUNGER);
        }
        if(this.getEnergy() > 99){
            setEnergy(0);
        }
    }

    @Override
    public void sleep() {
        if(this.getEnergy() < 100){
            setEnergy(MAX_ENERGY);
        }
        if(this.getHunger() < 100){
            setHunger(this.getHunger() - 10);
        }
        setHappiness(this.getHappiness() + 10);
    }
}
