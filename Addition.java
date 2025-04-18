class Addition{
    public static void main(String args[]){
        Addition a = new Addition();
        int sum = a.add(5, 6);
        System.out.println("Addition is :: "+sum);

    }

    int add(int a, int b){
        //Addtion function for two numbers
        int c = a + b;
        return c;
    }
}