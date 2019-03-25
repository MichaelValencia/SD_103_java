public class Arrays {
    public static void main(String[] args) {
        String[] studentNames = new String[10];
        studentNames[0] = "arnell";
        studentNames[1] = "mike";
        studentNames[2] = "lucio";
        studentNames[3] = "stephen";
        studentNames[4] = "zeke";
        studentNames[5] = "josephine";
        studentNames[6] = "kristy";
        studentNames[7] = "rana";
        studentNames[8] = "julian";
        studentNames[9] = "joseph";
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(i + "the students in class are " + studentNames[i]);

        }
        //this is how to create an array.
        //type
        // square brackets ([])
        //name (give it a decent name)
        // =
        //new
        // type
        // how big inside of square brackets [###]
        //eith with semicolon;
        int[] randomValues = new int[10];
        randomValues[2] = 3;
        randomValues[5] = 7;
        randomValues[8] = 666;

        float[] dollarAmount = new float[15];
        dollarAmount[0] = 99.99f;
        dollarAmount[dollarAmount.length-1] = 99.99f;

        System.out.println(studentNames.length);
        System.out.println("the last student name is " + studentNames[studentNames.length - 1]);
        studentNames[0] = "arnel hernandez";
        studentNames[studentNames.length-2] = "gary";
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(i + "the students in class are " +studentNames[i]);
        }

        int arraySize = (int)(Math.random()*5)+10;
        System.out.println(arraySize);
        int[] myRandom = new int [arraySize];
        System.out.println("myRandom.length = " + myRandom.length);
        for (int i = 0; i < myRandom.length ; i++) {
            myRandom[i]= (int)(Math.random()*100)+5;
          //  System.out.println(i +" " + myRandom[i]);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(i +" " + myRandom[i]);
        }
        for (int i = myRandom.length - 1; i >= myRandom.length - 5; i--) {
            System.out.println(i +" " + myRandom[i]);

        }

        // practice with loops hw

        for (int a = 0; a <10 ; a++) {
            double b = Math.random()*10;
            System.out.println((int)b+ " "+ b);
        }
        for (int b = 20; b < 100; b+=5) {
            System.out.println(b);
        }
        for (int c = -100; c < 10; c+=5) {
            System.out.println(c);
        }
        for (int d = -10000; d <0 ; d+=1000) {
            System.out.println(d);
        }
        for (int e = -10000; e <0 ; e+=1000) {
            double f = Math.random()*7;
            System.out.println((int)f + " " + f);
        }
        for (int f = -5; f <5 ; f++) {
            double i = Math.PI*10;
            System.out.println((int)i + " " + i);
        }

        for (int g = -20; g < 0; g+=2) {
            long h = Math.round(Math.random()*100);
            System.out.println(h);
        }
        for (int h = 0; h <10 ; h+=3) {
            long i = Math.round(Math.random()*1000);
            System.out.println(i);
        }
        for (int i = -100; i < 0; i++) {
            long l = Math.round(Math.random()*6);
            System.out.println(l);
        }
        for (int l = -10; l <0 ; l++) {
            System.out.println(l);
        }
        //practice creating arrays

        String[] studentsNames = new String[10];

    }
}
