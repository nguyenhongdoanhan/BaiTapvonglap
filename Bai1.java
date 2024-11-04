public class Bai1 {
    public static void main(String[] args) {
        int sumOdd = 0;  
        int sumEven = 0;

      
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { 
                sumEven += i; 
            } else {            
                sumOdd += i;     
            }
        }

       
        System.out.println("Tong cac so chan tu 1 den 100 la: " + sumEven);
        System.out.println("Tong cac so le tu 1 den 100 la: " + sumOdd);
    }
}

