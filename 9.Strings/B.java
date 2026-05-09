public class B {
    public static void printAll(String str) {
        for(int i =0;i<str.length();i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        //Concagination
        String FirstName = "Md";
        String MiddleName = "Meraj";
        String LastName = "Ansari";
        String FullName = FirstName+ " "+ MiddleName+" "+LastName;
        System.out.println(FullName);
        printAll(FullName);
    }
}
