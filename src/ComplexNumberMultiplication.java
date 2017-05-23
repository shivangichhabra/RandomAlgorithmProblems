
public class ComplexNumberMultiplication {
    public String complexNumberMultiply(String a, String b) {
        String[] a1 = a.split("\\+|i");
        String[] b1 = b.split("\\+|i");
        return (Integer.parseInt(a1[0])*Integer.parseInt(b1[0]) - Integer.parseInt(a1[1])*Integer.parseInt(b1[1]))+ "+" + (Integer.parseInt(a1[0])*Integer.parseInt(b1[1]) +  Integer.parseInt(a1[1])*Integer.parseInt(b1[0])) +"i";
    }
}
