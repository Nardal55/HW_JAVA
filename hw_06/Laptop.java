public class Laptop {
    private String name;
    private int ram;
    private int HD;
    private String os;
    private String colour;
    private double diagonal;

    public Laptop(String name, int ram, int HD, String os, String colour, double diagonal){
        this.name = name;
        this.ram = ram;
        this.HD = HD;
        this.os = os;
        this.colour = colour;
        this.diagonal = diagonal;
    }

    public int getRam(){
        return this.ram;
    }
    public int getHardDisk(){
        return this.HD;
    }
    public String getOS(){
        return this.os;
    }
    public double getDiagonal(){
        return this.diagonal;
    }
    // public String getName() {
    //     return this.name
    // }
    @Override
    public String toString() {
        return String.format("Название: %s \n объем оперативной памяти: %d Гб \n объем накопителя %d Гб \n ОС %s \n Цвет %s \n Диагональ %.1f \n", 
                    this.name, this.ram, this.HD, this.os, this.colour, this.diagonal);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Laptop) {
            return !this.name.equals(((Laptop) obj).name) || this.ram != ((Laptop) obj).ram || this.HD != ((Laptop) obj).HD || !this.os.equals(((Laptop) obj).os)
                    || !this.colour.equals(((Laptop) obj).colour) || this.diagonal != ((Laptop) obj).diagonal;
        }
        return false;
        
    }
}
