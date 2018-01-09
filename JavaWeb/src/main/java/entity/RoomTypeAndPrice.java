package entity;

public class RoomTypeAndPrice {
//    CREATE TABLE roomTypeAndPrice
//            (
//	# 房间类型（主码）
//                    roomType VARCHAR(32),
//	# 价格
//    price INT UNSIGNED NOT NULL,
//            # 备注
//    remarks VARCHAR(32),
//	# 主键
//    PRIMARY KEY (roomType)
//
//) ENGINE=InnoDB;
    private String roomType;

    private int price;

    private String desc;

    private String url;

    public RoomTypeAndPrice() {

    }

    public RoomTypeAndPrice(String roomType,
                            int price,
                            String desc,String url) {
        this.roomType = roomType;
        this.price = price;
        this.desc = desc;
        this.url =url ;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}