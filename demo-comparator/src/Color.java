public enum Color {
  RED(1), //
  YELLOW(2), //
  BLUE(3),;

  int id;

  private Color(int id) { // enum constructor must be private
    this.id = id;
  }
}
