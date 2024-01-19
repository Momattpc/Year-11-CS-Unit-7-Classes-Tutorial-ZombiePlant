public class ZombiePlant {
    private int treatmentNeeded;
    private int potency;
    private boolean danger;
    public ZombiePlant(int potency, int Treatmentneeded){
        this.treatmentNeeded = Treatmentneeded;
        this.potency = potency;
        if (Treatmentneeded > 0){
            this.danger = true;
        }
        else {
            this.danger = false;
        }

    }
   public int getPotencyRequired(){
        return potency;
   }
    public int treatmentsNeeded(){
        return treatmentNeeded;
    }
    public boolean isDangerous(){
        return danger;
    }
    public String treat(int a){


        if (a <= potency && a > 0 && treatmentNeeded > 0){
            this.treatmentNeeded--;
            if (treatmentNeeded == 0 ){
                danger = false;
            }
            return ("The treatment potency is <= " + potency + ", so the treatment is successful");
        }
        if (a >= potency){
            treatmentNeeded++;
        }

        return null;
    }
}
