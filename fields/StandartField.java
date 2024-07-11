package fields;

public class StandartField extends FieldFabric {

  public StandartField() {
    super("Standart field");
    this.addPosition(1, 320, 50, "first", "goalkeeper"); // Center of the goal area

    // Defenders (3 defenders)
    this.addPosition(2, 200, 180, "first", "left-defender"); // Left defender
    this.addPosition(3, 320, 180, "first", "center-defender"); // Center defender
    this.addPosition(4, 440, 180, "first", "right-defender"); // Right defender

    // Midfielders (5 midfielders)
    this.addPosition(5, 160, 320, "first", "left-midfielder"); // Left midfielder
    this.addPosition(6, 240, 320, "first", "central-midfielder"); // Left center midfielder
    this.addPosition(7, 320, 320, "first", "center-back"); // Center midfielder
    this.addPosition(8, 400, 320, "first", "central-midfielder"); // Right center midfielder
    this.addPosition(9, 480, 320, "first", "right-midfielder"); // Right midfielder

    // Forwards (2 forwards)
    this.addPosition(10, 240, 430, "first", "left-forward"); // Left forward
    this.addPosition(11, 400, 430, "first", "right-forward"); // Right forward


    this.addPosition(1, 320, 887, "second", "goalkeeper"); // Center of the goal area (reversed)
    // Defenders (3 defenders)
    this.addPosition(2, 440, 757, "second", "right-defender"); // Right defender (reversed)
    this.addPosition(3, 320, 757, "second", "center-defender"); // Center defender (reversed)
    this.addPosition(4, 200, 757, "second", "left-defender"); // Left defender (reversed)

    // Midfielders (5 midfielders)
    this.addPosition(5, 480, 617, "second", "right-midfielder"); // Right midfielder (reversed)
    this.addPosition(6, 400, 617, "second","central-midfielder"); // Right center midfielder (reversed)
    this.addPosition(7, 320, 617, "second", "center-back"); // Center midfielder (reversed)
    this.addPosition(8, 240, 617, "second", "central-midfielder"); // Left center midfielder (reversed)
    this.addPosition(9, 160, 617, "second", "left-midfielder"); // Left midfielder (reversed)

    // Forwards (2 forwards)
    this.addPosition(10, 400, 500, "second", "right-forward"); // Right forward (reversed)
    this.addPosition(11, 240, 500, "second", "left-forward"); // Left forward (reversed)
  }
}
