public class KonversiTipeData {
    public static void main(String[] args) {
        //Widening
        byte tipedatabyte = 10;
        short tipedatashort = tipedatabyte;
        int tipedataint = tipedatashort;
        long tipedatalong = tipedataint;
        float tipedatafloat = tipedatalong;
        double tipedatadouble = tipedatafloat;

        //Narrowing
        int TipeDataInteger = 129;
        byte tipedatabyte2 = (byte)TipeDataInteger;
        System.out.println(TipeDataInteger);
        String firstName,LastName;
        firstName = "Josh";
        LastName = "Sinabutar";

        System.out.printf("%s %s", firstName,LastName);
    }
}
