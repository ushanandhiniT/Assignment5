package Assignment5;

public class BinarytoOctal {

        public static void main(String[] args)
        {
            String strNumber = "10011";
            int binary = Integer.parseInt(strNumber, 2);
            String strOctal = Integer.toOctalString(binary);
            System.out.println("Octal value is: " + strOctal);
        }
    }

