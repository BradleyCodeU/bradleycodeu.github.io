import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_U5bGeometry {



    
    @Test
public void test_cubeSurface() {
  assertEquals("Geometry.cubeSurface(2.5)-->37.5", "Geometry.cubeSurface(2.5)-->"+Geometry.cubeSurface(2.5));
  assertEquals("Geometry.cubeSurface(0.5)-->1.5", "Geometry.cubeSurface(0.5)-->"+Geometry.cubeSurface(0.5));

}


@Test
public void test_cubeVolume() {
  assertEquals("Geometry.cubeVolume(2.5)-->15.625", "Geometry.cubeVolume(2.5)-->"+Geometry.cubeVolume(2.5));
  assertEquals("Geometry.cubeVolume(0.5)-->0.125", "Geometry.cubeVolume(0.5)-->"+Geometry.cubeVolume(0.5));

}


@Test
public void test_cylinderSurface() {
  double radius1 = 3.5;
    double height1 = 2.5;
    double radius2 = 1.5;
    double height2 = 0.5;
  assertEquals("Geometry.cylinderSurface(3.5,2.5)-->131.94689145077132", "Geometry.cylinderSurface(3.5,2.5)-->"+Geometry.cylinderSurface(3.5,2.5));
  assertEquals("Geometry.cylinderSurface(1.5,0.5)-->18.84955592153876", "Geometry.cylinderSurface(1.5,0.5)-->"+Geometry.cylinderSurface(1.5,0.5));

}


@Test
public void test_cylinderVolume() {
  double radius1 = 3.5;
    double height1 = 2.5;
    double radius2 = 1.5;
    double height2 = 0.5;
  assertEquals("Geometry.cylinderVolume(3.5,2.5)-->96.21127501618741", "Geometry.cylinderVolume(3.5,2.5)-->"+Geometry.cylinderVolume(3.5,2.5));
  assertEquals("Geometry.cylinderVolume(1.5,0.5)-->3.5342917352885173", "Geometry.cylinderVolume(1.5,0.5)-->"+Geometry.cylinderVolume(1.5,0.5));

}


}