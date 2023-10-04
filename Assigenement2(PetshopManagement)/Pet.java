public class Pet {
    private String name;
    private String species;
    private int age;
    private double price;



    public Pet(String name,String species,int age,double price){
        this.name = name;
        this.species = species;
        this.age = age;
        this.price = price;
    }

    public String getName(){

        return name;
    }

    public String getSpecies(){

        return species;
    }

    public int getAge(){

        return age;
    }

    public double getPrice(){

        return price;
    }

    @Override
    public  String toString(){

        return "Name: " + name + "\nSpecies: " + species + "\nAge: "+ age + "\nPrice: "+price;
    }


}
