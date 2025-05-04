import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Task> todolist = new ArrayList<>();

        String userInput = "";
        String STOP = "stop";
        String NEW = "new";
        String LIST = "list";
        //constants for list
        String ALL =  "all";
        String PRIORITY = "priority";
        String ZERO = "0";
        String ONE = "1";
        String TWO = "2";
        String THREE = "3";
        String FOUR = "4";
        String FIVE = "5";

        //code starts
        while (!userInput.equalsIgnoreCase(STOP)){
            if (userInput.equalsIgnoreCase(NEW)) {
                System.out.println("What is the name of your task?");
                String name = input.nextLine();
                System.out.println("What is a description of your task?");
                String description = input.nextLine();

                //add exception handling
                int priority = 0;
                boolean pass = false;
                while(!pass){
                    try {

                        System.out.println("What is the priority of your task, ( 0 - 5 ) 5 being the highest?");
                        priority = input.nextInt();
                        pass = true;
                    } catch(Exception e){
                        System.out.println("oh man");
                        input.nextLine();
                    }
                }
                input.nextLine();
                Task newtask = new Task(name, description, priority);
                todolist.add(newtask);
            }
            if (userInput.equalsIgnoreCase(LIST)){
                System.out.println("Type 'all' to display all or 'priority' to sort by priority");
                userInput = input.nextLine();
                if (userInput.equalsIgnoreCase(ALL)){
                    todolist.sort(new SortByPriority());
                    for (Task x :todolist){
                        x.display();

                    }
                }
                if (userInput.equalsIgnoreCase(PRIORITY)) {
                    System.out.println("What priority task's would you like to display");
                    userInput = input.nextLine();
                    todolist.sort(new SortByPriority());
                    if (userInput.equalsIgnoreCase(ZERO)){
                        for (Task x :todolist){
                           if (x.getPriority() == 0){
                               x.display();
                           }
                        }
                    }if (userInput.equalsIgnoreCase(ONE)){
                        for (Task x :todolist){
                            if (x.getPriority() == 1){
                                x.display();
                            }
                        }
                    }if (userInput.equalsIgnoreCase(TWO)){
                        for (Task x :todolist){
                            if (x.getPriority() == 2){
                                x.display();
                            }
                        }
                    }if (userInput.equalsIgnoreCase(THREE)){
                        for (Task x :todolist){
                            if (x.getPriority() == 3){
                                x.display();
                            }
                        }
                    }if (userInput.equalsIgnoreCase(FOUR)){
                        for (Task x :todolist){
                            if (x.getPriority() == 4){
                                x.display();
                            }
                        }
                    }if (userInput.equalsIgnoreCase(FIVE)){
                        for (Task x :todolist){
                            if (x.getPriority() == 5){
                                x.display();
                            }
                        }
                    }
                }

            }
            if (userInput.equalsIgnoreCase(STOP)){
                break;
            }

                System.out.println("Enter 'stop' to quit, 'new' to enter a new task, or list to display any other tasks.");
                userInput = input.nextLine();


        }
    }
}

