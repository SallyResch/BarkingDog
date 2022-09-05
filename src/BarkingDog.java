public class BarkingDog {

    public static boolean shouldWakeUp (boolean barking, int hourOfDay){
        //om klockan på dygnet är mindre än 0 (vilket den inte kan vara) och mer än 23 returnera falskt
        if(hourOfDay < 0 || hourOfDay >23) {
            return false;
            //om hunden skäller och tiden på dygnet är tidigare än kl 8 eller mer än 22, då vaknar jag
        } else if(barking && hourOfDay < 8 || hourOfDay > 22) {
            System.out.println("You have woken up");
            return true;
        }else{
            //I alla andra senarion returnera falskt.
            return false;
        }
    }
}
