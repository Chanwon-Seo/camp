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
    static StringBuilder sb = new StringBuilder();
    static String structureType = null;
    static String recipeTitle = null;

    //입력 자료구조 타입
    static void inputStructureType() throws IOException {
        structureType = br.readLine();
    }

    // input recipeProcess to List
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

    // output recipeProcess to List
    static void outputRecipeProcessToList() {
        sb.append("[ ").append(structureType).append(" 으로 저장된 ").append(recipeTitle).append(" ]").append("\n");
        for (int i = 1; i <= recipeList.size(); i++) {
            sb.append(i + ". ").append(recipeList.get(i - 1)).append("\n");
        }
    }

    // input recipeProcess to Set
    static void inputRecipeProcessToSet() {
        recipeSet = new LinkedHashSet<>();
        recipeSet.addAll(recipeList);
    }

    // output recipeProcess to Set
    static void outputRecipeProcessToSet() {
        sb.append("[ ").append(structureType).append(" 으로 저장된 ").append(recipeTitle).append(" ]").append("\n");

        int num = 1;
        for (String setData : recipeSet) {
            sb.append(num + ". ").append(setData).append("\n");
            num++;
        }
    }

    // input recipeProcess to map
    static void inputRecipeProcessToMap() {
        int num = 1;
        for (String value : recipeList) {
            recipeMap.put(num++, value);
        }
    }

    // output recipeProcess to Map
    static void outputRecipeProcessToMap() {
        recipeMap = new HashMap<>();

        sb.append("[ ").append(structureType).append(" 으로 저장된 ").append(recipeTitle).append(" ]").append("\n");
        for (Map.Entry<Integer, String> integerStringEntry : recipeMap.entrySet()) {
            sb.append(integerStringEntry.getKey() + ". ").append(integerStringEntry.getValue()).append("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        inputStructureType();
        inputRecipeProcess();

        switch (structureType) {
            case "List" -> outputRecipeProcessToList();
            case "Set" -> {
                inputRecipeProcessToSet();
                outputRecipeProcessToSet();
            }
            case "Map" -> {
                inputRecipeProcessToMap();
                outputRecipeProcessToMap();
            }
            default -> {
                System.out.println("타입 불일치");
                return;
            }
        }
        System.out.println(sb);
    }
}
