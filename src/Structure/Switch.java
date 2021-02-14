package Structure;

public class Switch {
    public static void main(String[] args) {
        //
        char grade = 'C';
        switch (grade){
            case 'A':
                System.out.println("nb");
                break;
            case 'C':
                System.out.println("looser");
                //break;
                break;
            case 'B':
                System.out.println("looser");
            case 'D':
                System.out.println("looser");
            case 'E':
                System.out.println("looser");
            case 'F':
                System.out.println("looser");
            default :
                System.out.println("gck");
        }

    }
}
/*
switch (expression){
    cause value :
        //sentence
        break; //可选
    cause value :
        //sentence
        break; //可选
    ......
    default : //可选
        //sentence
}

break; -> case穿透
 */