package md.tekwillacademy.classesandobject.autoservicetask;

public class Tool {

    String nameOfTheTool;

    String material;

    public Tool(String enteredNameOfTheTool){
        nameOfTheTool = enteredNameOfTheTool;
        System.out.println("The constructor with param was used and the material is still null");
    }
}
