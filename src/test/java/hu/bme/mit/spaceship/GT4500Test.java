package hu.bme.mit.spaceship;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class GT4500Test {

  private GT4500 ship;

  @Before
  public void init(){
    TorpedoStore primary = mock(TorpedoStore.class);
    TorpedoStore secondary = mock(TorpedoStore.class);
    this.ship = new GT4500(primary, secondary);
  }

  @Test
  public void fireTorpedos_Single_Success(){
    // Arrange
    when(ship.fireTorpedos(FiringMode.SINGLE)).thenReturn(true);
    // Act
    boolean result = ship.fireTorpedos(FiringMode.SINGLE);

    // Assert
    verify(ship, times(1)).fireTorpedos(FiringMode.SINGLE);
  }

  @Test
  public void fireTorpedos_All_Success(){
    // Arrange
    when(ship.fireTorpedos(FiringMode.ALL)).thenReturn(true);
    // Act
    boolean result = ship.fireTorpedos(FiringMode.ALL);

    // Assert
    verify(ship, times(1)).fireTorpedos(FiringMode.ALL);
  }

}
