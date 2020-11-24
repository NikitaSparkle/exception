package org.itstep.task01;

public class Main {
    public static void main(String[] args) throws FullListException {
        List list = new List(5);

        // try{
        //    list.removeLast();
        // }catch (EmptyListException emptEx){
        //    System.err.println("Could not remove last item");
        // }

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        try{
            list.add(1);
        }catch (FullListException fllEx){
            System.err.println("List is full");
        }

    }
}
