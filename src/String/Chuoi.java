package String;

public class Chuoi {
    public static void main(String[] args) {
        // dung de noi chuoi, trong xu li bat dong bo, tot do xu ly nhanh hon StringBuffer
        StringBuilder builder = new StringBuilder();
        builder.append("vu van tien");
        builder.append(" rat dep trai");
        System.out.println(builder);

        StringBuffer buffer = new StringBuffer();
        buffer.append("vu van tien");
        buffer.append(" rat nhieu tien");
        System.out.println(buffer);
        // dung de noi chuoi, trong xu li dong bo
    }
}
