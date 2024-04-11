public class Arraylist{
    public static void main (String[]args){
        Arraylist <String> al=new Arraylist<String>(); 
        al.add("java2EE");
        al.add("Python Django");
        al.add("C#ASP");
        al.add("java2EE");
        System.out.println(al.size());
        al.remove(0);
        al.add(2,"Devops");
        System.out.println(al.get(2));
        System.out.println(al);
        if(al.contains("C#ASP")){
            System.out.println("Found");
        }else{
            System.out.println("NOT Found");
        }

    }
}