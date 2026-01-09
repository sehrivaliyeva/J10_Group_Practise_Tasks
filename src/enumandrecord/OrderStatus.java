package enumandrecord;

public enum OrderStatus {
    NEW("Yeni"),
    PROCESSING("Hazirlanir"),
    SHIPPED("Gozlemede"),
    DELIVERED("Catdirildi"),
    CANCELED("Leqv olundu");

    String description;

     OrderStatus(String description){
        this.description = description;
    }
    public void printDescription(){
        System.out.println(description);
    }
    boolean isFinalStatus(){
         return this == DELIVERED || this == CANCELED;
    }
}
