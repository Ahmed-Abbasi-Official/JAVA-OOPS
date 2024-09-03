/**
 * CircleWithStaticMembers
 */
public class CircleWithStaticMembers {
    double radius;


    // Static keyword is used for the all classes . means if you create new object in main class then this class have cover another memory same has it's class variable but for the static variable it not cover extra memory for every classes it common memory fr every clases ;

    // An istance method can invoke all dataField and Method no matter it's instance or static ;

    // An Static method can invoke only static method and data field ;


    static int numberOfObjects=0;

    CircleWithStaticMembers(){
        this.radius=1;
        numberOfObjects++;
    }

    
    CircleWithStaticMembers(double radius){
        this.radius=radius;
        numberOfObjects++;
    }

    int getNumberOfObjects(){
        return numberOfObjects;
    }

    double getRadius(){
        return radius;
    }
    
}