package 과제.week2;

import java.util.*;

// 자료구조를 입력한다. (String)
// 요리 제목을 입력한다. (String)
// 조건문을 활용해서
// 레시피를 입력한 자료 구조에 맞춰
// 1. 2. 머릿말을 붙여서 저장한다.
// "끝" 입력을 받으면 입력을 종료한다.
// 입력이 종료되면 순서에 맞춰 출력한다.


public class Week2 {
    public static void main(String[] args) {
        // 입력부
        Scanner sc = new Scanner(System.in);

        // 자료구조 및 메뉴 입력값 저장
        System.out.println("저장할 자료구조를 list, set, map 중 하나를 입력해주세요.");
        String dataStructure = sc.nextLine();
        System.out.println("요리 제목을 입력해주세요.");
        String foodName = sc.nextLine();


        if (dataStructure.equals("list")) {     // List 컬렉션 저장부
            ArrayList<String> stringArray = new ArrayList<String>();
            System.out.println("요리 레시피를 한 문장씩 입력해주세요.");
            System.out.println("입력을 마치면 '끝'을 입력해주세요.");
            stringArray.add(dataStructure);     // 자료 구조 배열 저장
            stringArray.add(foodName);      // 메뉴 이름 배열 저장
            while (true) {    // 배열에 "num. 끝"이 없을때까지 레시피 작성
                String confirm = sc.nextLine();
                if (Objects.equals(confirm, "끝")) {
                    break;
                }
                stringArray.add(confirm);
            }
            int check = stringArray.size();   // 배열의 사이즈 확인
            System.out.println("[ " + stringArray.get(0) + "(으)로 저장된 " + stringArray.get(1) + " ]");  // 자료 구조 및 메뉴 이름 통합 출력
            for (int i=2; i <= check-1; i++) {  // 레시피 출력
                System.out.println(i-1 + ". " + stringArray.get(i));
            }
        }

        if (dataStructure.equals("set")) {      // set 컬렉션 저장부
            Set<String> stringSet = new LinkedHashSet<String>();

            System.out.println("요리 레시피를 한 문장씩 입력해주세요.");
            System.out.println("입력을 마치면 '끝'을 입력해주세요.");
            stringSet.add("[ " + dataStructure + "(으)로 저장된 " + foodName + " ]");  // 자료 구조 및 메뉴 이름 통합 저장
            int num = 1;  // 레시피 순번
            while (true) {
                String confirm = sc.nextLine();     // 입력 데이터 검증 변수
                if (Objects.equals(confirm, "끝")) {     // 입력 데이터에서 끝을 인식하면 브레이크
                    break;
                }
                stringSet.add(num++ + ". " + confirm);      // 끝을 인식하기 전까지 add 반복
            }
            for (String value: stringSet) {
                System.out.println(value);
            }
        }

        if (dataStructure.equals("map")) {      // map 컬렉션 저장부
            Map<Integer, String> stringMap = new TreeMap<>();

            System.out.println("요리 레시피를 한 문장씩 입력해주세요.");
            System.out.println("입력을 마치면 '끝'을 입력해주세요.");
            stringMap.put(0, "[ " + dataStructure + "(으)로 저장된 " + foodName + " ]");     // 자료 구조 및 메뉴 이름 입력값 배열 저장

            int num = 1;
            while (true) {
                String confirm = sc.nextLine();
                if (Objects.equals(confirm, "끝")) {
                    break;
                }
                stringMap.put(num, num++ + ". " + confirm);
            }

            for (String result : stringMap.values()) {
                System.out.println(result);
            }
        }
    }
}
