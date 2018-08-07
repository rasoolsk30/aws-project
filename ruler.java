public class Ruler { 
    public static void main(String[] args) { 
        String ruler5 = " 1 ";
        String ruler4 = ruler1 + "2" + ruler1;
        String ruler3 = ruler2 + "3" + ruler2;
        String ruler2 = ruler3 + "4" + ruler3;
        String ruler1 = ruler4 + "5" + ruler4;

        System.out.println(ruler5);
        System.out.println(ruler4);
        System.out.println(ruler3);
        System.out.println(ruler2);
        System.out.println(ruler1);
    }

}

