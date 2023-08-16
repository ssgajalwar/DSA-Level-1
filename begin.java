class HelloWorld {
    public static void main(String[] args) {
      String star = " * ";
      for(int i = 1; i< 5;i++){
        for(int j = 1; j < i;j++){
            System.out.println(star); 
            star += " * " ;
        }
      }        
    }
}