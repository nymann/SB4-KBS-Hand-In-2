@Override
public void setColor(String hex) {
    String hexWithoutPound = hex.replace("#", "");
    this.shapeRenderer.setColor(Color.valueOf(hexWithoutPound));
}
