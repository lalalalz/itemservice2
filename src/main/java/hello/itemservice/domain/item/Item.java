package hello.itemservice.domain.item;

import lombok.Data;

import java.util.List;

@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    // 추가 요구사항에 따른 추가 코드
    private Boolean open;  // 판매여부
    private List<String> regions; // 등록 지점
    private ItemType itemType; // 상품 종류
    private DeliveryCode deliveryCode; // 배송 방식 정보


    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}