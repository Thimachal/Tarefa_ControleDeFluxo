public class CalcAverage{
    double average1;
    double average2;
    double average3;
    double average4;

    public CalcAverage(double average1, double average2, double average3, double average4) {
        this.average1 = average1;
        this.average2 = average2;
        this.average3 = average3;
        this.average4 = average4;
    }

    public void printCalc(){
        double average = (this.average1+this.average2+this.average3+this.average4)/4;
        System.out.println("A média das 4 notas: " + average);
        if(average >= 7) {
            System.out.println("Uhuu está Aprovado!");
        }
        else if (average >=5) {
            System.out.println("Vai para recuperação");
        }else{
            System.out.println("Infelizmente está Reprovado");
        }
    }
}
