package lesson4;

import lesson3.Paintable;

public enum CarType implements Paintable {

  //  public static final CarType SEDAN = new CarType("Седан");
  SEDAN("Седан") {
    @Override
    public void paint() {
      System.out.println(this.getUkrainianTranslation() + " фарбуємо у синій колір");
    }
  }, SUV("Кросовер") {
    @Override
    public void paint() {
      System.out.println(this.getUkrainianTranslation() + " фарбуємо у червоний колір");

    }
  }, HATCHBACK("Хетчбек") {
    @Override
    public void paint() {
      System.out.println(this.getUkrainianTranslation() + " фарбуємо у білий колір");
    }
  };

  private String ukrainianTranslation;

  CarType(String ukrainianTranslation) {
    this.ukrainianTranslation = ukrainianTranslation;
  }

  public String getUkrainianTranslation() {
    return ukrainianTranslation;
  }

  public void setUkrainianTranslation(String ukrainianTranslation) {
    this.ukrainianTranslation = ukrainianTranslation;
  }

  public abstract void paint();
}
