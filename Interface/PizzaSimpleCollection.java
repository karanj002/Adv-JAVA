//package Interface;
//import java.util.*;
//import java.io.*;
//import java.util.stream.Stream;
//
//public class PizzaSimpleCollection {
//    private PizzaSimpleInt[] list;
//    private File thefile;
//
//    public PizzaSimpleCollection(File f) throws FileNotFoundException{
//            thefile=f;
//            list= new PizzaSimpleInt[0];
//            read();
//            }
//    public PizzaSimpleCollection(String name)throws FileNotFoundException{
//        this(new File(name));
//        }
//        public void read() throws FileNotFoundException {
//            if (thefile.exists()){
//                Scanner sc=new Scanner(thefile);
//                int size=Integer.parseInt(sc.nextLine());
//                list=new PizzaSimpleInt[size];
//                for(int index=0; index<size; index++){
//                    String name= sc.nextLine();
//                    double price=Double.parseDouble(sc.nextLine());
//                    list[index] = new PizzaSimple(name,price);
//                    }
//                sc.close();
//                }
//            }
//            public void write() throws FileNotFoundException{
//                PrintStream stream=new PrintStream(thefile);
//                System.out.println(list.length);
//                for (int index=0 ; index<list.length; index++){
//                    stream.println(list[index].getName());
//                    stream.println(list[index].getPrice());
//                }
//                stream.close();
//            }
//            public void add(String name, double price){
//                PizzaSimpleInt[] listNew= Arrays.copyOf(list,list.length+1);
//                listNew[list.length] = new PizzaSimple(name, price);
//                list = listNew;
//            }
//            public void delete (int index){
//                if (index >= 0 && index < list.length) {
//                    PizzaSimpleInt[] listNew = new PizzaSimpleInt[list.length - 1];
//                    System.arraycopy(list, 0, listNew, 0, index);
//                    System.arraycopy(list, index + 1, listNew, index, list.length - index - 1);
//                    list = listNew;
//                } else {
//                    System.out.println("Invalid index for deletion.");
//                }
//
//        public PizzaSimpleInt[] getList() {
//            return list;
//        }
//        public File getThefile() {
//            return thefile;
//        }
//        public void setList(PizzaSimple[] list) {
//            this.list = (PizzaSimpleInt[]) list;
//        }
//        public void setThefile(File thefile) {
//            this.thefile = thefile;
//        }
//}
//
