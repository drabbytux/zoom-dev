public class Guitar extends StringedInstrument {
  
  private boolean rightHanded = true;
  protected String stringType;
  protected String bodyMaterial;

  public void setLeftHanded(){
    rightHanded = false;
  }

  public void setRighttHanded(){
    rightHanded = true;
  }

  public boolean isRightHandedGuitar(){
    return rightHanded;
  }

}
