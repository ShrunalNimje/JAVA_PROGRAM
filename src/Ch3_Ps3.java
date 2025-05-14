public class Ch3_Ps3 {
    public static void main(String[] args) {

        // practise set 3

        // problem statement 1
        String name = "Shrunal nimje";
        System.out.println(name.toLowerCase());

        // Problem statement 2
        String name1 = "Sh ru na l";
        System.out.println(name1.replace(" ","_"));

        // Problem statement 3
        String name2 = "Dear shrunal, thanks a lot";
        System.out.println(name2);
        System.out.println(name2.replace("shrunal","Harsh"));

        // problem Statement 4
       String detectSpaces = "Sh  ru na    l ";
        System.out.println(detectSpaces.indexOf("  "));
        System.out.println(detectSpaces.indexOf("   "));

        // problem statement 5
        String letter = "Dear \"Shrunal\" you gave me a book \nthanks";
        System.out.println(letter);

    }

}
