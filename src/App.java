public class App {
    public static void main (String [] args){

        int lives = 5;
        lives = lives-1;
        System.out.println(lives); //4

        lives--; //Decremento
        System.out.println(lives); //3 

        lives++; //Incremento
        System.out.println(lives); //4

        //Postfijo
        //Gana un regalo por ganar una vida
        int gift = 100 + lives++;  
        System.out.println(gift); // =104
        System.out.println(lives); //5
        //Prefijo
        //int gift = 100 + ++lives; //posfijo 
        //System.out.println(gift); // =105
        //System.out.println(lives); //5

    }
}
