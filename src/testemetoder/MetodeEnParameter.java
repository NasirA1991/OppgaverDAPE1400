package testemetoder;

class Person {
    public String navn;
    public int fødselsår;

    public int alder(int årstall){
        int alder = årstall - fødselsår;
        return alder;
    }

}

public class MetodeEnParameter {

    public static void main(String []args){
        Person p1 = new Person();
        p1.navn = "Nasir Amin";
        p1.fødselsår = 1991;
        int alder = p1.alder(2022);
        System.out.println(p1.navn+" er "+alder+" år ");
    }
}
