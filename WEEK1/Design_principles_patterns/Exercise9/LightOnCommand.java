package WEEK1.Design_principles_patterns.Exercise9;

public class LightOnCommand implements Command {
  private Light light;
  public LightOnCommand(Light light)
  {
    this.light=light;
  }
  public void execute()
  {
    light.turnOff();

  }

  
}
