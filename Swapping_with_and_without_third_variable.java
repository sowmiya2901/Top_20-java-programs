With 3 rd var:

class HelloWorld {
    public static void main(String[] args) {
       int a=10;
       int b=20;
       int t;
       t=a;
       a=b;
       b=t;
       System. out. println("A is"+a);
       System. out. println("B is"+b);
       
    }
}


Without 3rd variable:

class HelloWorld {
    public static void main(String[] args) {
       int a=10;
       int b=20;
       a=a+b;
       b=a-b;
       a=a-b;
       System. out. println("A is"+a);
       System. out. println("B is"+b);
       
    }
}
