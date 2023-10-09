// An interface that will be implemented by composite class (Housing) and leaf class(Room)

public interface IStructure{
    public void enter();
    public void exit();
    public void location();
    public String getName();
}