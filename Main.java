public class Main {

  public static String formGradeString(int[] array){
    String letterGrade = "";
    for(int num : array){
      if(num >= 90){
        letterGrade += "A";
      }
      else if(num >= 80){
        letterGrade += "B";
      }
      else if(num >= 70){
        letterGrade += "C";
      }
      else if(num >= 60){
        letterGrade += "D";
      }
      else{
        letterGrade += "F";
      }

    }
    return letterGrade;

  }

  public static String valedictorianName(String[] names, double[] grades){
    double highest = 0.0;
    int index = 0;
    int index2 = 0;
    for(index = 0; index < grades.length; index ++){
      if(grades[index] > highest){
        highest = grades[index];
        index2 = index;
      }
    }
    return names[index2];

  }
  
  public static void main(String[] args) {
    System.out.println(formGradeString(new int [] {87,93,65,72,55}));
    
  }
}