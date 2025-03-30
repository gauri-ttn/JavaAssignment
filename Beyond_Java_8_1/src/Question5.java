public class Question5 {
    public static void main(String[] args){
        String s="Hello World";
        System.out.println("Repeat: " +s.repeat(4));
        System.out.println(">>>>>>>>>>>>>>>>>>>");

        String s1="   Java   \n";
        System.out.println("Trimmed: " +s1.trim());
        System.out.println("Stripped: " +s1.strip());
        System.out.println(">>>>>>>>>>>>>>>>>>>");

        String s2=" ";
        System.out.println("isBlank");
        System.out.println(s2.isBlank());
        System.out.println(s1.isBlank());
        System.out.println(">>>>>>>>>>>>>>>>>>>");

        System.out.println("Indent");
        System.out.println(s.indent(5));
        System.out.println(">>>>>>>>>>>>>>>>>>>");

        System.out.println("transform");
        String res="hello".transform(e->e.toUpperCase());
        System.out.println(res);
        System.out.println(">>>>>>>>>>>>>>>>>>>");

        System.out.println("stripIndent");
        String s3= """
                  \tHello
                  \t\tWortld
                  """;
        System.out.println(s3+"\n");
        System.out.println(s3.stripIndent());
        System.out.println(">>>>>>>>>>>>>>>>>>>");

        System.out.println("translateEscapes");
        String s4= "Hello\\nWorld";
        System.out.println(s4.translateEscapes());
        System.out.println(">>>>>>>>>>>>>>>>>>>");

        System.out.println("Formatted");
        String s5 = "Hello, %s! You have %d new messages.".formatted("Gauri", 5);
        System.out.println(s5);
        System.out.println(">>>>>>>>>>>>>>>>>>>");

        System.out.println("Tripple Quotes");
        String s6= """
                Multi 
                line
                string""";
        System.out.println(s6);
    }
}
