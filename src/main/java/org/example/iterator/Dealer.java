package org.example.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Concrete iteratorの 役割
 */
public class Dealer implements Iterator<RouletteNumber> {
  private Roulette roulette;
  private int index;

  public Dealer(Roulette roulette) {
    this.roulette = roulette;
    this.index = 0;
  }

  @Override
  public boolean hasNext() {
    if(index < roulette.getLength()) return true;
    else return false;
  }

  @Override
  public RouletteNumber next() {
    if(!hasNext()) throw new NoSuchElementException();
    RouletteNumber rouletteNumber = roulette.getRouletteAt(index);
    index++;
    return rouletteNumber;
  }
}
