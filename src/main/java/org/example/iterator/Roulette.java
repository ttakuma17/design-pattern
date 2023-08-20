package org.example.iterator;

import java.util.Iterator;

/**
 * ルーレット - Concrete Aggregate の役割
 */
public class Roulette implements Iterable<RouletteNumber> {
  private RouletteNumber[] roulette;
  private int last = 0;

  public Roulette(int maxsize) {
    this.roulette = new RouletteNumber[maxsize];
  }

  public RouletteNumber getRouletteAt(int index){
    return roulette[index];
  }

  public void appendRouletteNumber(RouletteNumber rouletteNumber){
    this.roulette[last] = rouletteNumber;
    last++;
  }

  public int getLength(){
    return last;
  }

  @Override
  public Iterator<RouletteNumber> iterator() {
    return new Dealer(this);
  }
}
