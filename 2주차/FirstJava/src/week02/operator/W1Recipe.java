package week02.operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class W1Recipe {
    static final double maxGrade = 5.0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //recipeTitle
        String recipeTitle = br.readLine();

        //recipeGrade
        int recipeGrade = (int) Double.parseDouble(br.readLine());

        //recipeProcess
        String[] recipeProcess = new String[10];

        for (int i = 0; i < recipeProcess.length; i++) {
            recipeProcess[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();
        double recipeGradeResult = (recipeGrade / maxGrade) * 100.0;

        sb.append("[ ").append(recipeTitle).append(" ]").append("\n")
                .append("별점 : ").append(recipeGrade).append(" (").append(recipeGradeResult).append("%)").append("\n");

        for (int i = 1; i <= recipeProcess.length; i++) {
            sb.append(i).append(". ").append(recipeProcess[i - 1]).append("\n");
        }

        System.out.println(sb);

    }
}
