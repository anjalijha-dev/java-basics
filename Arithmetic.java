class Arithmetic{
    public static void main(String[] args){
        //arithmetic:
        int a = 20;
        int b = 10;
        // Operator precedence : *,/,% before +,-
        // % = use to find remainder
        int ans = a * b / a - b;
        int ans2 = (a * b) / (a - b);
        System.out.println(ans);
        System.out.println(ans2);
    }
}
