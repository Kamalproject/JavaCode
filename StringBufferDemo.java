public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer br=new StringBuffer("Kamallochan Panigrahi");
        System.out.println(br);
        br.append(" Gst Inspector");
        System.out.println(br);
        br.replace(0,3,"Kuna");
        System.out.println(br);
        br.insert(4, "Software Engineer");
        System.out.println(br);
        br.reverse();
        System.out.println(br);
        br.delete(0,3);
        System.out.println(br);
        br.indexOf("Kanha");
        System.out.println(br);
        br.charAt(3);
        System.out.println(br);
    }
}
