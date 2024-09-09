public class Main {
    //  int i=5; // instance variable ;
    // static int j=5; // instance variable ;
    public static void main(String[] args) {
//         // i=j;  // wrong because i is instance and j is static ;
// //        System.out.println("Value of i : "+i);    can not acces because its a static method and variable is instance ;
//         System.out.println("Value of i : "+j);   // can  acces because its a static method and variable is static ;
//         CircleWithStaticMembers c1=new CircleWithStaticMembers(5);
//         CircleWithStaticMembers c2=new CircleWithStaticMembers();
//         System.out.println(c1.getRadius());    
//         System.out.println(c2.getNumberOfObjects());    

Circle[] circleArray = new Circle[10];
for (int i = 0; i < circleArray.length; i++) {
 circleArray[i] = new Circle();
}

    }
}


// BOOK PAGE NO 340 CHAPTER NO 9 (OBJECT AND CLASSES);