package Collections_Generics;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

class IceCreamOrder {
    private String flavor;
    private String theme;
    private int spoon;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getSpoon() {
        return spoon;
    }

    public void setSpoon(int spoon) {
    	this.spoon = spoon;
    }
}

public class IceCreamShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Map<String, Object>> orders = new ArrayList<>();

        System.out.print("아이스크림을 몇 개 주문하시나요?: ");
        int orderNum = sc.nextInt();

        for (int i = 0; i < orderNum; i++) {
            Map<String, Object> orderDetails = new HashMap<>();

            System.out.println("아이스크림 #" + (i + 1));

            // 아이스크림 종류 입력
            System.out.print("아이스크림 종류 (바닐라, 초콜릿, 딸기): ");
            String flavor = sc.next();
            orderDetails.put("flavor", flavor);

            // 풍미 선택
            System.out.print("풍미 선택 (순하게, 보통, 진하게): ");
            String theme = sc.next();
            orderDetails.put("theme", theme);

            // 수저 개수 입력
            System.out.print("수저 개수: ");
            int spoon = sc.nextInt();
            orderDetails.put("spoon", spoon);

            // 주문 정보를 리스트에 추가
            orders.add(orderDetails);
        }

        // 주문 내역 출력
        System.out.println("\n주문 내역 입니다");
        DateTimeFormatter timeSet = DateTimeFormatter.ofPattern("hh:mm");
        
        for (int i = 0; i < orders.size(); i++) {
            Map<String, Object> order = orders.get(i);

            System.out.println("주문 " + (i + 1));
            System.out.println("아이스크림 종류: " + order.get("flavor"));
            System.out.println("풍미 선택: " + order.get("theme"));
            System.out.println("수저 개수: " + order.get("spoon"));
            System.out.println("주문 시간: " + LocalTime.now().format(timeSet));
            System.out.println("완성 시간: " + LocalTime.now().plusMinutes(10).format(timeSet));
            System.out.println();
        }
        
    }
}
