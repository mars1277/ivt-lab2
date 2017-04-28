package hu.bme.mit.spaceship;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class GT4500Test {

  private GT4500 ship;

  TorpedoStore primary;
  TorpedoStore secondary;

  @Before
  public void init(){
    primary = mock(TorpedoStore.class);
    secondary = mock(TorpedoStore.class);
    this.ship = new GT4500(primary, secondary);
  }

  @Test
  public void fireTorpedos_Single_Success(){
    // Arrange
    when(primary.fire(1)).thenReturn(true);
    when(secondary.fire(1)).thenReturn(true);
    
    // Act
    boolean result = ship.fireTorpedos(FiringMode.SINGLE);

    // Assert
    verify(ship, times(1)).fireTorpedos(FiringMode.SINGLE);
  }

  @Test
  public void fireTorpedos_All_Success(){
    // Arrange
    when(primary.fire(1)).thenReturn(true);
    when(secondary.fire(1)).thenReturn(true);
 
    // Act
    boolean result = ship.fireTorpedos(FiringMode.ALL);

    // Assert
    verify(ship, times(1)).fireTorpedos(FiringMode.ALL);
  }

}
