import java.util.Scanner;

public class GradingStudentsApp {
    static int[] solve(int[] grades){
    	int[] temp = new int[grades.length];
    	System.out.println();
    	
    	for(int i=0; i<grades.length; i++) {
    	int q = grades[i]/5;
    	int possibleGrade = 0;
    	
    	if(grades[i] < 38) {
    		temp[i] = grades[i];
    		continue;
    	}
    	
    	if(grades[i]%5 <=2) {
    		possibleGrade = grades[i];
    	} else {
    		possibleGrade = (q +1)*5;
    	}
    	temp[i] = possibleGrade;
    	}
    	return temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println(73/5);
//        System.out.println(76/5);
    	System.out.print("Enter number of students: ");
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
        	System.out.print("Enter grade of student #" + (grades_i +1) + ": ");
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        
        in.close();
    }
}
