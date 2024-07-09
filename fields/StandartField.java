package fields;

import java.util.ArrayList;

import players.Player;

public class StandartField extends FieldFabric {

  public StandartField(ArrayList<Player> players) {
    super("Standart field" );
    this.addPosition(1, 50, 50);
  }

}
