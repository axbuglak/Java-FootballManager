package fields;

public class StandartField extends FieldFabric {

  public StandartField() {
    super("Standart field");
    this.addPositionFirstTeam(1, 320, 50); // Center of the goal area

    // Defenders (3 defenders)
    this.addPositionFirstTeam(2, 200, 180); // Left defender
    this.addPositionFirstTeam(3, 320, 180); // Center defender
    this.addPositionFirstTeam(4, 440, 180); // Right defender

    // Midfielders (5 midfielders)
    this.addPositionFirstTeam(5, 160, 320); // Left midfielder
    this.addPositionFirstTeam(6, 240, 320); // Left center midfielder
    this.addPositionFirstTeam(7, 320, 320); // Center midfielder
    this.addPositionFirstTeam(8, 400, 320); // Right center midfielder
    this.addPositionFirstTeam(9, 480, 320); // Right midfielder

    // Forwards (2 forwards)
    this.addPositionFirstTeam(10, 240, 430); // Left forward
    this.addPositionFirstTeam(11, 400, 430); // Right forward

    this.addPositionSecondTeam(1, 320, 887); // Center of the goal area (reversed)

    // Defenders (3 defenders)
    this.addPositionSecondTeam(2, 440, 757); // Right defender (reversed)
    this.addPositionSecondTeam(3, 320, 757); // Center defender (reversed)
    this.addPositionSecondTeam(4, 200, 757); // Left defender (reversed)

    // Midfielders (5 midfielders)
    this.addPositionSecondTeam(5, 480, 617); // Right midfielder (reversed)
    this.addPositionSecondTeam(6, 400, 617); // Right center midfielder (reversed)
    this.addPositionSecondTeam(7, 320, 617); // Center midfielder (reversed)
    this.addPositionSecondTeam(8, 240, 617); // Left center midfielder (reversed)
    this.addPositionSecondTeam(9, 160, 617); // Left midfielder (reversed)

    // Forwards (2 forwards)
    this.addPositionSecondTeam(10, 400, 500); // Right forward (reversed)
    this.addPositionSecondTeam(11, 240, 500); // Left forward (reversed)
  }

}
