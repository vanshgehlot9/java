public class string_operation {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int length = str.length();
        System.out.println("Length :- " + length);
        String str1 = "Vansh";
        String str2 = "Gehlot";
        String result = str1 + " " + str2;
        System.out.println("Concatenated string: " + result);
        String comp1 = "JIET";
        String comp2 = "jiet";
        boolean equals = comp1==comp2; 
        System.out.println(equals);
        String caseString = "Shopiex";
        String upperCase = caseString.toUpperCase();
        String lowerCase = str.toLowerCase();
        System.out.println("Upper case string: " + upperCase);
        System.out.println("Lower case string: " + lowerCase);
    }
}