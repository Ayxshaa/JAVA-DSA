public class Performance {
    public static void main(String[] args) {
        String series = "";
        for(int i =0; i<26; i++){
            char ch = (char) ('a'+i);
            System.out.println(ch); // char one eg
        }
        for(int i =0; i<26; i++){
            char ch = (char) ('a'+i);
            series = series+ ch; // string one eg
        }
        System.out.println(series);
    }

}
