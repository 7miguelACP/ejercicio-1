class Main {
  public static void main(String[] args) {
    
    int numero1=10, numero2=20, numero3=30, total;
    total = suma(numero1, numero2, numero3);
    System.out.println("la suma es "+total);  

  }
  public static int suma(int n1,int n2, int n3){
      int resultado= n1 + n2 + n3;
      return resultado; 
    
  }
}