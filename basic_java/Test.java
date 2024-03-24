public class Test {
    public int data;
    public String name;
    Test(int data , String name){
        this.data = data;
        this.name = name;
    }

    public void display(){
        System.err.println("The name is :"+name+" and data is - "+data);
    }
}
