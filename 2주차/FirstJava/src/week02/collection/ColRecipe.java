package week02.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ColRecipe {
    static List<String> recipeList = new ArrayList<>();
    static Set<String> recipeSet;
    static Map<Integer, String> recipeMap;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb;
    static String structureType = null;
    static String recipeTitle = null;

    //타입 검증
    static void inputStructureType() throws IOException {
        structureType = br.readLine();
    }

    // input recipeProcess
    static void inputRecipeProcess() throws IOException {
        recipeTitle = br.readLine();

        String recipeProcess = "";
        while (!(recipeProcess = br.readLine()).isEmpty()) {

            if (recipeProcess.equals("끝")) {
                break;
            }
            recipeList.add(recipeProcess);
        }
    }

    // output recipeProcess
    static void outputRecipeProcessList() {
        sb = new StringBuilder();
        sb.append("[ ").append(structureType).append(" 으로 저장된 ").append(recipeTitle).append(" ]").append("\n");
        for (int i = 1; i <= recipeList.size(); i++) {
            sb.append(i + ". ").append(recipeList.get(i - 1)).append("\n");
        }
    }

    static void outputRecipeProcessSet() {
        recipeSet = new LinkedHashSet<>();
        recipeSet.addAll(recipeList);

        sb = new StringBuilder();
        sb.append("[ ").append(structureType).append(" 으로 저장된 ").append(recipeTitle).append(" ]").append("\n");

        int num = 1;
        for (String setData : recipeSet) {
            sb.append(num + ". ").append(setData).append("\n");
            num++;
        }
    }

    static void outputRecipeProcessMap() {
        recipeMap = new HashMap<>();

        int num = 1;
        for (String value : recipeList) {
            recipeMap.put(num++, value);
        }

        sb = new StringBuilder();
        sb.append("[ ").append(structureType).append(" 으로 저장된 ").append(recipeTitle).append(" ]").append("\n");
        for (Map.Entry<Integer, String> integerStringEntry : recipeMap.entrySet()) {
            sb.append(integerStringEntry.getKey() + ". ").append(integerStringEntry.getValue()).append("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        inputStructureType();
        inputRecipeProcess();

        if (structureType.equals("List")) {
            outputRecipeProcessList();
        } else if (structureType.equals("Set")) {
            outputRecipeProcessSet();
        } else if (structureType.equals("Map")) {
            outputRecipeProcessMap();
        } else {
            System.out.println("타입 불일치");
            return;
        }
        System.out.println(sb);
    }
}
