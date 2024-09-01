public class TipeDataString {
    public static void main(String[] args) {
        //Perbedaan primitive dan  non primitive
        String firstName = "Josh";
        String lastName = "Sinabutar";
        String fullname = firstName + " " + lastName;
//         System.out.println(firstName + " " + lastname);
//         System.out.println(firstName.concat(lastName));
//         System.out.println(FullName.tolowerCase());
        System.out.println(fullname.toUpperCase());

//         System.out.println(fullname.charAt(6));
        System.out.println(fullname.contains("Sinabutar"));
    }
}
