import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Double note1, note2, note3, note4;

        System.out.println("Digite a primeira nota:" );
        note1= Double.valueOf(scanner.nextDouble());
        System.out.println("Digite a segunda nota:" );
        note2= Double.valueOf(scanner.nextDouble());
        System.out.println("Digite a terceira nota:" );
        note3= Double.valueOf(scanner.nextDouble());
        System.out.println("Digite a quarta nota:" );
        note4= Double.valueOf(scanner.nextDouble());

        //CalcAverage student0 = new CalcAverage(4.5, 4.0, 9.0, 6.5);
        //student2.printCalc();
        CalcAverage student1 = new CalcAverage(note1, note2, note3, note4);
        student1.printCalc();

    }
}