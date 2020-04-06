//Finding roots of quadratic equation.

import java.util.Scanner;

public class EquationSolver
{
    //a,b and c are coefficients of x^2, x and constant term respecively.
    //disc is the discriminant value.
    double a,b,c,disc,root1,root2;
    void discriminant()
    {
        //This method calculates the discriminant and calls the root function accordingly.
        disc = b*b - 4*a*c;
        if(disc<0)
            System.out.println("No real roots");
        else
            this.root();
    }
    void root()
    {
        //This method calculates roots and calls the display function.
        //Temp stores the square root of discriminant.
        double temp = java.lang.Math.sqrt(disc);
        root1 = (b*(-1) + temp)/(2*a);
        root1 = (b*(-1) - temp)/(2*a);
        this.display();
    }
    void display()
    {
        System.out.print("The roots of the equation are ");
		System.out.println(this.root1 + " and " + this.root2);
		
    }
        
    public static void main(String args[])
    {
        EquationSolver equation = new EquationSolver();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter coefficient of x^2: ");
        equation.a = input.nextInt();
        System.out.print("Enter coefficient of x: ");
        equation.b = input.nextInt();
        System.out.print("Enter constant term: ");
        equation.c = input.nextInt();
        input.close();
        equation.discriminant();
    }
}
