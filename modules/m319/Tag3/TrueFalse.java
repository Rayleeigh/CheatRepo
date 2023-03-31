public class TrueFalse {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;

        for(int i = 1;i <= 100; i++){ //generate numbers up to 100
            System.out.println("number: " + a);
            System.out.println("number: " + b);
            System.out.println("number: " + c);
            a++;
            b++;
            c++;
            if(a == 55 && b == 66 && c == 77){
                System.exit(111);
            }
            if(a == 55){
                System.out.println("Done counting int a");
                try {
                    Thread.sleep(1000); // add delay of 1000 miliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}