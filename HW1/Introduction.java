public class Introduction {

    public static void main(String[] args) {
        System.out.println("Nguyễn Mai Thanh Thư\t23021731\tK68I-CS1\tthuwng\t23021731@vnu.edu.vn");

        for (int i = 9; i >= 1; i--) {
            if (i > 1) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down, pass it around,");
                System.out.println((i - 1) + (i - 1 == 1 ? " bottle" : " bottles") + " of beer on the wall, " 
                                   + (i - 1) + (i - 1 == 1 ? " bottle" : " bottles") + " of beer.");
                System.out.println("Take one down, pass it around,");
            } else {
                System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
                System.out.println("Take one down, pass it around,");
                System.out.println("No more bottles of beer on the wall.");
            }
        }
    }
}
