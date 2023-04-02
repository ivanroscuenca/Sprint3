import java.util.ArrayList;
//create class Undo
public class Undo {
//Create a private Undo object called instance
    private static Undo instance ;
    //attribute arraylist private and static
    private static ArrayList<String> commandList = new ArrayList<>();

    //cosntructor private
    private Undo(){};

    //static method getInstance if null we will be created object
    public static Undo getInstance() {

    if (instance==null){
        instance=new Undo( );
    }
        return instance;
    }

    // public method to add commands. Option 1
    public void addCommand(String command){
        commandList.add(command);
    }

    // public method to delete commands. Option 2
    public void deleteCommand(){
        try{
        commandList.remove(commandList.size()-1);
        } catch(Exception e){
            System.out.println("There is no commands to delete");
        }
    }
    // public method to show all commands. Option 3
    public void ShowCommand(){
        System.out.println(commandList);;
    }
    // public method to show last command added. Option 4
    public void ShowLastCommand(){
        try {
            System.out.println(commandList.get(commandList.size() - 1));;
        } catch(Exception e){
            System.out.println("There is no last command");
        }

    }

}
