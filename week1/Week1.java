package 과제.week1;

import java.util.Scanner;

public class Week1 {

    public static void main(String[] args) {
        Scanner foodValue = new Scanner(System.in);
        String foodName = foodValue.nextLine();  // 음식 제목 입력
        float foodStar = foodValue.nextFloat();  // 음식 별점 실수 형태로 입력
        String foodRecipe1 = foodValue.nextLine(); // 레시피 1번 내용 입력
        String foodRecipe2 = foodValue.nextLine(); // 레시피 2번 내용 입력
        String foodRecipe3 = foodValue.nextLine(); // 레시피 3번 내용 입력
        String foodRecipe4 = foodValue.nextLine(); // 레시피 4번 내용 입력
        String foodRecipe5 = foodValue.nextLine(); // 레시피 5번 내용 입력
        String foodRecipe6 = foodValue.nextLine(); // 레시피 6번 내용 입력
        String foodRecipe7 = foodValue.nextLine(); // 레시피 7번 내용 입력
        String foodRecipe8 = foodValue.nextLine(); // 레시피 8번 내용 입력
        String foodRecipe9 = foodValue.nextLine(); // 레시피 9번 내용 입력
        String foodRecipe10 = foodValue.nextLine(); // 레시피 10번 내용 입력

        int ifoodStar = (int)foodStar; // 음식 별점 실수 -> 정수로 변환
        double persentageStar = ifoodStar * 100 / 5;

        System.out.println("[ " + foodName + " ]");
        System.out.println("별점 : " + ifoodStar + " (" + persentageStar + "%)");
        System.out.println("1. " + foodRecipe1);
        System.out.println("2. " + foodRecipe2);
        System.out.println("3. " + foodRecipe3);
        System.out.println("4. " + foodRecipe4);
        System.out.println("5. " + foodRecipe5);
        System.out.println("6. " + foodRecipe6);
        System.out.println("7. " + foodRecipe7);
        System.out.println("8. " + foodRecipe8);
        System.out.println("9. " + foodRecipe9);
        System.out.println("10. " + foodRecipe10);
    }
}