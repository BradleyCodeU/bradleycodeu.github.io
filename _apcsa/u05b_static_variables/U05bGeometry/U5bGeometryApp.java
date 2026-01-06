class Main {
  public static void main(String[] args) {
    
    // create variables for height and radius here
    
    System.out.printf("%-30s%4.2f\n", "Cube volume: ", Geometry.cubeVolume(height));
    System.out.printf("%-30s%4.2f\n", "Cube surface area: ", Geometry.cubeSurface(height));
    System.out.printf("%-30s%4.2f\n", "Cylinder volume: ", Geometry.cylinderVolume(radius, height));
    System.out.printf("%-30s%4.2f\n", "Cylinder surface area: ", Geometry.cylinderSurface(radius, height));
  }
}