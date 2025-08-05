

public class GradeChecker {
   public GradeChecker() {
   }

   public static void main(String[] args) {
      String[] students = new String[]{"Jamie", "Alex", "John", "Dianna", "Ethan"};
      int[] score = new int[]{85, 67, 45, 38, 72};

      for(int i = 0; i < students.length; ++i) {
         String grade = getGrade(score[i]);
         System.out.println(students[i] + " scored " + score[i] + " and received grade " + grade);
      }

   }

   public static String getGrade(int score) {
      if (score >= 1 && score <= 100) {
         if (score > 0 && score < 50) {
            return "Fail";
         } else if (score >= 50 && score < 61) {
            return "Pass";
         } else if (score >= 61 && score <= 70) {
            return "Merit";
         } else {
            return score >= 71 && score <= 100 ? "Distinction" : "Invalid Entry ";
         }
      } else {
         return "Error Marks must be betweeen 1 and 100";
      }
   }


	}


