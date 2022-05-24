public class MathApp {
  public static void main(String[] args) {
    double job1Salary = 50000.00;
    double job2Salary = 60000.00;
    System.out.println(Math.max(job1Salary, job2Salary));

    double carPrice = 35000.00;
    double truckPrice = 55000.00;
    System.out.println(Math.min(carPrice, truckPrice));

    double radius = 7.25;
    System.out.println(Math.PI * Math.pow(radius, 2));

    double num1 = 5.0;
    System.out.println(Math.sqrt(num1));

    byte x1 = 5;
    byte y1 = 10;
    byte x2 = 85;
    byte y2 = 50;
    System.out.println(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));

    double num2 = -3.8;
    System.out.println(Math.abs(num2));

    double random = Math.random();
    System.out.println(random);
  }
}
